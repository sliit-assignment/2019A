package PastPapers.AOct2019.Question4;

public class Dinner extends Meal{

    public Dinner(){
        System.out.println("Preparing Dinner......");
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
