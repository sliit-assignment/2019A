package PastPapers.AOct2019.Question1;

public class SatelliteLocation implements IGeoLocation{
    private String location;

    public SatelliteLocation(String location){
        this.location = location;
    }

    @Override
    public void displayLocation() {
        System.out.println("Satellite Location: " + location);
    }
}
