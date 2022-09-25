public class Main {
    public static void main(String[] args) {
        short bananas = 5;
        short oneBananasWeight = 80;
        int totalBananasWeight = bananas * oneBananasWeight;
        System.out.println("" +totalBananasWeight+ "");
        short milkk = 200;
        System.out.println("" +milkk+ "");
        short milk100ml = 105;
        int milksTotalWeight = milk100ml * 2;
        System.out.println("" +milksTotalWeight+ "");
        short iceCream = 2;
        short oneIceCream = 100;
        int totalIceCreamWeight = oneIceCream * iceCream;
        System.out.println("" +totalIceCreamWeight+ "");
        short eggs = 4;
        short oneEgg = 70;
        int totalEggsWeight = oneEgg * eggs;
        System.out.println("" +totalEggsWeight+ "");
        int totalWeightOfFood = totalBananasWeight + milksTotalWeight + totalIceCreamWeight + totalEggsWeight;
        System.out.println("" +totalWeightOfFood+ "");

    }
}