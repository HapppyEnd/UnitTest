import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
public class VehicleTest {
    Car car = new Car("bmw","x3",2000);
    Motorcycle moto = new Motorcycle("harley","davidson",2015);


    @Test
    void testCarIsVehicle(){
        assertThat(car).isInstanceOf(Vehicle.class);
    }
    @Test
    void testWheelsCar(){
        assertThat(car.getNumWheels()).isEqualTo(4);
    }
    @Test
    void testWheelsMoto(){
        assertThat(moto.getNumWheels()).isEqualTo(2);
    }
    @Test
    void testDriveCar(){
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }
    @Test
    void testDriveMoto(){
        moto.testDrive();
        assertThat(moto.getSpeed()).isEqualTo(75);
    }
    @Test
    void testParkCar(){
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }
    @Test
    void testParkMoto(){
        moto.testDrive();
        moto.park();
        assertThat(moto.getSpeed()).isEqualTo(0);
    }
}
