package task02;

public class Main {
    public static void main(String[] args) {
        WaterHeater heater = new WaterHeater();
        CoffeeGrinder grinder = new CoffeeGrinder();
        BrewUnit brewUnit = new BrewUnit();
        CupDispenser cupDispenser = new CupDispenser();

        CoffeeMachineFacade coffeeMachine = new CoffeeMachineFacade(heater, grinder, brewUnit, cupDispenser);

        coffeeMachine.brewEspresso();
        System.out.println();
        coffeeMachine.brewAmericano();
    }
}