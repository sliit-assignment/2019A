package PastPapers.AOct2019.Question4;

public class ChickenFlavour implements IPrepareDeliciously{
    @Override
    public void addFlavour() {
        System.out.println("Added chicken for the meal");
    }

    @Override
    public double getCost() {
        return 100;
    }
}
