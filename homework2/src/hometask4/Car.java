package hometask4;


import java.text.DecimalFormat;

public class Car {

    public static final String FORMAT_DOUBLE = "#0.00";
    public static final int ODESSA_KRIVOE_OZERO = 179;
    public static final int KRIVOE_OZERO_ZHASHKOV = 153;
    public static final int ZHASHKOV_KYIV = 148;

    public static float volumeOfFuelTank = 50f;
    public static float fuelLeft = 34.4f;
    public static float fuelConsumptionFor100 = 9.8f;
    public static float fuelPrice = 24.21f;

    public static void odessaKrivoeOzero(){

        System.out.println("Приехали в Кривое Озеро.");
        System.out.println("Проехали " + ODESSA_KRIVOE_OZERO + " км.");

        String formattedFuelLeft = new DecimalFormat(FORMAT_DOUBLE).format(fuelLeftForNKilometers(ODESSA_KRIVOE_OZERO, fuelConsumptionFor100, fuelLeft));
        System.out.println("По прибытию у нас осталось: " + formattedFuelLeft + " литров топлива.");

        String formattedFuelSpent = new DecimalFormat(FORMAT_DOUBLE).format(fuelLeft - fuelLeftForNKilometers(ODESSA_KRIVOE_OZERO, fuelConsumptionFor100, fuelLeft));
        System.out.println("Мы потратили: " + formattedFuelSpent + " литров топлива.");

        fuelLeft = fuelLeftForNKilometers(ODESSA_KRIVOE_OZERO, fuelConsumptionFor100, fuelLeft);

        String formattedPrice = new DecimalFormat(FORMAT_DOUBLE).format(fillToFull(volumeOfFuelTank, fuelLeft) * fuelPrice);
        System.out.println("Заправили до полного бака по цене: " + formattedPrice + " грн. (" + fuelPrice + " грн. за литр)");

        String formattedFilled = new DecimalFormat(FORMAT_DOUBLE).format(fillToFull(volumeOfFuelTank, fuelLeft) + fuelLeft);
        fuelLeft = fillToFull(volumeOfFuelTank, fuelLeft) + fuelLeft;
        System.out.println("В баке сейчас: " + formattedFilled + " литров топлива.");

        System.out.println("Выехали из Кривого Озера.");
        System.out.println("====================================================");
    }

    public static void krivoeOzeroZhashkov(){

        System.out.println("Приехали в Жашков. ");
        System.out.println("Проехали " + KRIVOE_OZERO_ZHASHKOV + " км.");

        String formattedFuelLeft = new DecimalFormat(FORMAT_DOUBLE).format(fuelLeftForNKilometers(KRIVOE_OZERO_ZHASHKOV, fuelConsumptionFor100, fuelLeft));
        System.out.println("По прибытию у нас осталось: " + formattedFuelLeft + " литров топлива.");
        fuelLeft = fuelLeftForNKilometers(KRIVOE_OZERO_ZHASHKOV, fuelConsumptionFor100, fuelLeft);

        String formattedFuelSpent = new DecimalFormat(FORMAT_DOUBLE).format(fuelLeft - fuelLeftForNKilometers(KRIVOE_OZERO_ZHASHKOV, fuelConsumptionFor100, fuelLeft));
        System.out.println("Мы потратили: " + formattedFuelSpent + " литров топлива.");

        String formattedPrice = new DecimalFormat(FORMAT_DOUBLE).format(fillToFull(volumeOfFuelTank, fuelLeft) * fuelPrice);
        System.out.println("Заправили до полного бака по цене: " + formattedPrice + " грн. (" + fuelPrice + " грн. за литр)");

        String formattedFilled = new DecimalFormat(FORMAT_DOUBLE).format(fillToFull(volumeOfFuelTank, fuelLeft) + fuelLeft);
        System.out.println("В баке сейчас: " + formattedFilled + " литров топлива.");

        System.out.println("Выехали из Жашков.");
        System.out.println("====================================================");

    }

    public static void zhashkovKyiv(){

        System.out.println("Приехали в Киев. ");
        System.out.println("Проехали " + ZHASHKOV_KYIV + " км.");

        String formattedFuelLeft = new DecimalFormat(FORMAT_DOUBLE).format(fuelLeftForNKilometers(ZHASHKOV_KYIV, fuelConsumptionFor100, fuelLeft));
        System.out.println("По прибытию у нас осталось: " + formattedFuelLeft + " литров топлива.");
        fuelLeft = fuelLeftForNKilometers(ZHASHKOV_KYIV, fuelConsumptionFor100, fuelLeft);

        String formattedFuelSpent = new DecimalFormat(FORMAT_DOUBLE).format(fuelLeft - fuelLeftForNKilometers(ZHASHKOV_KYIV, fuelConsumptionFor100, fuelLeft));
        System.out.println("Мы потратили: " + formattedFuelSpent + " литров топлива.");

        String formattedPrice = new DecimalFormat(FORMAT_DOUBLE).format(fillToFull(volumeOfFuelTank, fuelLeft) * fuelPrice);
        System.out.println("Заправили до полного бака по цене: " + formattedPrice + " грн. (" + fuelPrice + " грн. за литр)");

        String formattedFilled = new DecimalFormat(FORMAT_DOUBLE).format(fillToFull(volumeOfFuelTank, fuelLeft) + fuelLeft);
        System.out.println("В баке сейчас: " + formattedFilled + " литров топлива.");

    }

    public static float fillToFull(float vol, float left){

        return vol - left;

    }

    public static float fuelLeftForNKilometers(int kilometers, float consumption, float left){

        float spent = (consumption / 100) * kilometers;

        return left - spent;
    }

    public static float fuelNeedToFill(int kilometers){
        return (fuelConsumptionFor100 / 100) * kilometers;
    }
}
