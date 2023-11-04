import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class TestBook {

BookRepository mockBookRepository;
BookService testBookService;

    @BeforeEach
    void setUp() {
        mockBookRepository = mock(BookRepository.class);
        testBookService = new BookService(mockBookRepository);
    }

    @Test
    void testFindBookById(){
        when(mockBookRepository.findById("1")).thenReturn(new Book("1", "Book1", "Author1"));
        Book result = testBookService.findBookById("1");
        assertThat(result.getId()).isEqualTo("1");
        verify(mockBookRepository, times(1)).findById("1");
    }

    @Test
    void testFindAllBooks(){
        ArrayList<Book> testList = new ArrayList<Book>();
        testList.add(new Book("1", "Book1", "Author1"));
        testList.add(new Book("2", "Book2", "Author2"));
        when(mockBookRepository.findAll()).thenReturn(testList);
        ArrayList<Book> result = (ArrayList<Book>) testBookService.findAllBooks();
        assertThat(result).isEqualTo(testList);
        verify(mockBookRepository, times(1)).findAll();
    }
}
