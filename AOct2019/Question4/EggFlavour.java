package PastPapers.AOct2019.Question4;

public class EggFlavour implements IPrepareDeliciously{
    @Override
    public void addFlavour() {
        System.out.println("Added egg for the meal");
    }

    @Override
    public double getCost() {
        return 60;
    }
}
