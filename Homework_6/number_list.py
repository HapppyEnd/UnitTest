"""Module contains class NumberList"""


class NumberList:
    """Сlass for finding the average value of two lists."""
    @staticmethod
    def get_average(number_list: list) -> float:
        """Return the average value of list.

        Parameters:
            number_list: list

        Returns:
            float: average value of list
        """
        if not isinstance(number_list, list):
            raise TypeError('There should be a list of numbers!')
        for element in number_list:
            if not isinstance(element, float | int):
                raise ValueError('There should be a numbers in list.')
        if not number_list:
            return 0
        return sum(number_list) / len(number_list)

    @staticmethod
    def compare_values(average_1: float, average_2: float) -> str:
        """Compare two average values.

        Parameters:
            average_1: float
            average_2: float

        Returns:
            str: the result of comparing two values
        """
        if average_1 > average_2:
            return 'The first list has a larger average value.'
        if average_2 > average_1:
            return 'The second list has a larger average value.'
        return 'The average values are equal.'
