package ru.netology.sqr.sevices;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/quantitySquares.csv")
    public void shouldCalculateQuantitySquare(int expected, int bottomBorder, int topBorder) {
        SQRService service = new SQRService();

        int actual = service.quantitySquare(bottomBorder, topBorder);
        Assertions.assertEquals(expected, actual);
    }

}
