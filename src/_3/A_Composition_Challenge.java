package _3;

public class A_Composition_Challenge
{
    public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();
//        kitchen.getDishWasher().setHasWorkToDo(true);
//        kitchen.getIceBox().setHasWorkToDo(true);
//        kitchen.getBrewMaster().setHasWorkToDo(true);
//        kitchen.getDishWasher().doDishes();
//        kitchen.getIceBox().orderFood();
//        kitchen.getBrewMaster().brewCoffee();
        kitchen.setKitchenState(true,false,true);
        kitchen.doKitchenWork();

    }
}
class SmartKitchen
{
    private CoffeeMaker brewMaster;
    private Refrigerator iceBox;
    private DishWasher dishWasher;

    public SmartKitchen() {
        brewMaster = new CoffeeMaker();
        iceBox = new Refrigerator();
        dishWasher = new DishWasher();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }
    public void setKitchenState(boolean coffeeFlag,boolean fridgeFlag,boolean disWasherFlag)
    {
        brewMaster.setHasWorkToDo(coffeeFlag);
        iceBox.setHasWorkToDo(fridgeFlag);
        dishWasher.setHasWorkToDo(disWasherFlag);
    }
    public void doKitchenWork()
    {
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }
}
class CoffeeMaker
{
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void brewCoffee() {
        if (hasWorkToDo)
        {
            System.out.println("Brewing Coffee");
            hasWorkToDo = false;
    }
    }
}
class Refrigerator
{
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void orderFood() {
        if (hasWorkToDo)
        {
            System.out.println("Ordering Food");
            hasWorkToDo = false;
        }
    }
}

class DishWasher
{
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void doDishes() {
        if (hasWorkToDo)
        {
            System.out.println("Washing dishes");
            hasWorkToDo = false;
        }
    }
}

