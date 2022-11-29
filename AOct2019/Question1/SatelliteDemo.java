package PastPapers.AOct2019.Question1;

public class SatelliteDemo {
    public static void main(String[] args) {
        ISatellite navigationSatellite = new NavigationSatellite("Ravana-01");
        IGeoLocation locationTracker1 = new SatelliteLocation("Sri Lanka");
        ISatellite droneSatellite = new DroneSatellite("Ravana-02");
        IGeoLocation locationTracker2 = new SatelliteLocation("Russia");

        ISatellite[] satelliteArray = new ISatellite[]{navigationSatellite, droneSatellite};
        IGeoLocation[] trackerArray = new IGeoLocation[]{locationTracker1, locationTracker2};

        SatelliteCenter satelliteCenter = new SatelliteCenter(0, satelliteArray, trackerArray);
        satelliteCenter.startService();
        satelliteCenter.stopService();
        satelliteCenter.locationService();

        SatelliteCenter remoteController2 = new SatelliteCenter(1, satelliteArray, trackerArray);
        remoteController2.startService();
        remoteController2.stopService();
        remoteController2.locationService();
    }
}
