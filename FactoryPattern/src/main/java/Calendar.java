public class Calendar {
    Zone zone;
    public void print (){
        System.out.println(zone.displayName);
        System.out.println(zone.offset.toString());
    }
    public Calendar createCalendar(){
        return new Calendar();
    }
}
