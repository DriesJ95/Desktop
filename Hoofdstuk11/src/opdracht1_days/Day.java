package opdracht1_days;

public enum Day {
    MONDAY,TUESDAY,WEDNESSDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;

    private boolean isWeekDay;

    public String toString(){
        if(this.ordinal() < 5){
            isWeekDay = true;
            return "The day is " + this.name().toLowerCase() + " is it a weekday? " + isWeekDay;
        }
        else{
            isWeekDay = false;
            return "The day is " + this.name().toLowerCase() + " is it a weekday? " + isWeekDay;
        }
    }

}
