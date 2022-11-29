package PastPapers.AOct2019.Question1;

public class SatelliteCenter {
    private int option;
    private ISatellite[] ISatellite;
    private IGeoLocation[] IGeoLocation;

    public SatelliteCenter(int option, ISatellite[] ISatellite, IGeoLocation[] IGeoLocation){
        this.option = option;
        this.ISatellite = ISatellite;
        this.IGeoLocation = IGeoLocation;
    }

    public void startService(){
        for (ISatellite x: ISatellite){
            if(option == 0){
                x.activate();
            }else if(option == 1){
                x.deactivate();
            }
        }
    }

    public void stopService(){
        for (ISatellite satellite: ISatellite)
            satellite.deactivate();
    }

    public void locationService(){
        for (IGeoLocation satellite: IGeoLocation)
            satellite.displayLocation();
    }
}
