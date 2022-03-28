package ru.netology.sqr;

public class SQRService {
    public int numberOfHits(int diapasonStart, int diapasonEnd) {
        int hitCounter = 0;
        for (int i = 10; i <= 99; i++) {
            int result = i * i;
            if (result >= diapasonStart && result <= diapasonEnd) {
                hitCounter++;
            }
        }

        return hitCounter;
    }
}
