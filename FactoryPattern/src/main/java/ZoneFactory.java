public class ZoneFactory {
    public Zone createZone (String zoneID){
        Zone zone;
        switch (zoneID) {
            case "US/Eastern":
                return zone = new ZoneUSEastern();
            case "US/Central":
                return zone = new ZoneUSCentral();
            case "US/Mountain":
                return zone = new ZoneUSMoutain();
            case "US/Pacific":
                return zone = new ZoneUSPacific();
            default:
                return null;
        }
    }
}
