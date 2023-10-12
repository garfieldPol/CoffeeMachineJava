package machine;

public class MachineSupply {
    int water;
    int milk;
    int coffeeBeans;
    int disposableCups;
    int money;

    public MachineSupply(int water, int milk, int coffeeBeans, int disposableCups, int money) {
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.disposableCups = disposableCups;
        this.money = money;
    }

        public static void Hello_Advert(int water,int milk,int coffeeBeans,int disposableCups,int money){
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk +  " ml of milk");
        System.out.println(coffeeBeans + " g of coffee beans");
        System.out.println(disposableCups + " disposable cups");
        System.out.println("$" +money+ " of money\n");
    }




}
