package PastPapers.AOct2019.Question4;

public class Lunch extends Meal{

    public Lunch(){
        System.out.println("Preparing Lunch......");
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
