package hometask4;

import java.text.DecimalFormat;

public class CarMain {

    public static void main(String[] args) {

        System.out.println("В баке: " + Car.fuelLeft + " литров топлива.");
        System.out.println("На 100 километров уходит: " + Car.fuelConsumptionFor100 + " литров топлива.");
        System.out.println("Выехали из Одессы без заправки.");

        String formattedTotalPrice = new DecimalFormat(Car.FORMAT_DOUBLE).format(Car.fuelNeedToFill(480) * Car.fuelPrice);
        System.out.println("Вся поездка будет стоить: " + formattedTotalPrice + " грн.");

        System.out.println("====================================================");

        Car.odessaKrivoeOzero();
        Car.krivoeOzeroZhashkov();
        Car.zhashkovKyiv();

    }
}
