package task02;

public class CoffeeMachineFacade {
    private WaterHeater waterHeater;
    private CoffeeGrinder grinder;
    private BrewUnit brewUnit;
    private CupDispenser cupDispenser;

    public CoffeeMachineFacade(WaterHeater waterHeater, CoffeeGrinder grinder, BrewUnit brewUnit, CupDispenser cupDispenser) {
        this.waterHeater = waterHeater;
        this.grinder = grinder;
        this.brewUnit = brewUnit;
        this.cupDispenser = cupDispenser;
    }

    public void brewEspresso() {
        System.out.println("--- Making Espresso ---");
        cupDispenser.dispenseCup();
        grinder.grindBeans("fine");
        waterHeater.heatWater(92);
        brewUnit.brew(25);
        System.out.println("Your espresso is ready! Careful, it's hot.");
    }

    public void brewAmericano() {
        System.out.println("--- Making Americano ---");
        cupDispenser.dispenseCup();
        grinder.grindBeans("medium");
        waterHeater.heatWater(95);
        brewUnit.brew(40);
        waterHeater.addExtraHotWater();
        System.out.println("Your americano is ready! Have a nice morning.");
    }
}