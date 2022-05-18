package prvi;

public class SmartSerpa implements CoffeeMaker {
    private int waterAmount = 0;
    private int coffeeSize = 0;
    private boolean isHeated = false;


    @Override
    public void addWater(int water) {
        waterAmount += water;
        if (isWaterHeated() == true)
            isHeated = false;
    }

    @Override
    public void heatWater() {
        isHeated = true;
    }

    @Override
    public void addCoffee(int coffeeSpoonNumber) {
        if (isWaterHeated() == true) {
            coffeeSize += coffeeSpoonNumber;
        }
    }

    @Override
    public int pourCoffee(int requestedCupsNumber) {
         int coffeeNumber=0;
        for (int i = 0; i < requestedCupsNumber; i++) {
            if (waterAmount >= 1 && getCoffeeSize() >= 2) {
                waterAmount--;
                coffeeSize -= 2;
                coffeeNumber++;
                System.out.println();
                System.out.println(coffeeSize);
                System.out.println(waterAmount);
                System.out.println(coffeeNumber);
                System.out.println();;
            }
        }
        return coffeeNumber;
    }

    @Override
    public int getWaterAmount() {
        return waterAmount;
    }

    @Override
    public int getCoffeeSize() {
        return coffeeSize;
    }

    @Override
    public boolean isWaterHeated() {
        if (waterAmount == 0) {
            return false;
        } else
            return isHeated;

    }
}
