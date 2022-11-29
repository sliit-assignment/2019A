package PastPapers.AOct2019.Question4;

public abstract class Meal {
    protected IPrepareQuickly iPrepareQuickly;
    protected IPrepareDeliciously iPrepareDeliciously;

    public void setFlavour(IPrepareDeliciously iPrepareDeliciously){
        this.iPrepareDeliciously = iPrepareDeliciously;
    }

    public void setDuration(IPrepareQuickly iPrepareQuickly){
        this.iPrepareQuickly = iPrepareQuickly;
    }

    public void addFlavour(){
        iPrepareDeliciously.addFlavour();
    }

    public void deliveryTime(){
        iPrepareQuickly.deliveryTime();
    }

    public abstract void displayMeal();

    public abstract void displayCost();
}
