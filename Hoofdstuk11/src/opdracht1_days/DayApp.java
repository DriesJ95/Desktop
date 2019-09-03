package opdracht1_days;

public class DayApp {
    public static void main(String[] args) {
        Day day1 =  Day.MONDAY;
        for (Day d : Day.values()){
            System.out.println(d.toString());
        }
    }
}
