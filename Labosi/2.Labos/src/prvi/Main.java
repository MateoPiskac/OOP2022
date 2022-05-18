package prvi;



public class Main {
    public static void main(String[] args) {



    CoffeeMaker ss = new SmartSerpa();
                ss.getCoffeeSize(); // vraca 0
        System.out.println(ss.getCoffeeSize());
                ss.getWaterAmount(); // vraca 0
        System.out.println(ss.getWaterAmount());
                ss.addCoffee(10); // voda nije zagrijana, nema dodavanja kave
                ss.getCoffeeSize(); // vraca 0
        System.out.println(ss.getCoffeeSize());

                ss.getWaterAmount(); // vraca 0
        System.out.println(ss.getWaterAmount());
                ss.addWater(3);
                ss.getCoffeeSize(); // vraca 0
        System.out.println(ss.getCoffeeSize());
                ss.getWaterAmount(); // vraca 3
        System.out.println(ss.getWaterAmount());
                ss.isWaterHeated(); // vraca false
        System.out.println(ss.isWaterHeated());
                ss.heatWater();
        System.out.println(ss.isWaterHeated());
                ss.getCoffeeSize(); // vraca// 0
        System.out.println(ss.getCoffeeSize());
                ss.getWaterAmount(); // vraca 3
        System.out.println(ss.getWaterAmount());
                ss.isWaterHeated(); // vraca true
        System.out.println(ss.isWaterHeated());
                ss.addWater(1);
                ss.getCoffeeSize(); // vraca 0
        System.out.println(ss.getCoffeeSize());
                ss.getWaterAmount(); // vraca 4
        System.out.println(ss.getWaterAmount());
                ss.isWaterHeated(); // vraca false
        System.out.println(ss.isWaterHeated());
                ss.heatWater();
                ss.addCoffee(3);
                ss.addCoffee(5);
                ss.getCoffeeSize(); // vraca 8
        System.out.println(ss.getCoffeeSize());
                ss.getWaterAmount(); // vraca 4
        System.out.println(ss.getWaterAmount());
                ss.isWaterHeated(); // vraca true
        System.out.println(ss.isWaterHeated());

        System.out.println(ss.getWaterAmount()+" test");
                ss.pourCoffee(1);
                ss.getCoffeeSize(); // vraca 6
        System.out.println(ss.getCoffeeSize());
                ss.getWaterAmount(); // vraca 3
        System.out.println(ss.getWaterAmount());
                ss.isWaterHeated(); // vraca true
//        System.out.println(ss.isWaterHeated());
//        System.out.println(ss.pourCoffee(10)); // trazimo 10 kava a dobit cemo samo tri jer nam je toliko ostalo..
                ss.pourCoffee(10);
                ss.getCoffeeSize(); // vraca 0
                ss.getWaterAmount(); // vraca 0
}

}