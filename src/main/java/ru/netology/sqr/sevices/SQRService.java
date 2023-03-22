package ru.netology.sqr.sevices;

public class SQRService {

    public int quantitySquare(int bottomBorder, int topBorder) {
        int quantity = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= bottomBorder & i * i <= topBorder) {
                quantity++;
            }
        }
        return quantity;
    }
}
