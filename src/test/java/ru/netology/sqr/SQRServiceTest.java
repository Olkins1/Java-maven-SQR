package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(
            value = {
                    "'zero hits',1,99,0",
                    "'one hit',101,122,1",
                    "'all hit ',100,9801,90",
            },
            delimiter = ','
    )
    void numberOfHits(String test, int diapStart, int diapEnd, int hitsExpected) {
        SQRService service = new SQRService();
        int actual = service.numberOfHits(diapStart, diapEnd);
        assertEquals(hitsExpected, actual);
    }


}