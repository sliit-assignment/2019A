package PastPapers.AOct2019.Question4;

public class Breakfast extends Meal{

    public Breakfast(){
        System.out.println("Preparing Breakfast......");
    }

    @Override
    public void displayMeal() {
        super.addFlavour();
        super.deliveryTime();
        this.displayCost();
    }

    @Override
    public void displayCost() {
        System.out.println("Cost for the meal is = " + iPrepareDeliciously.getCost());
    }
}
