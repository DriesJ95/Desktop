package opdracht_ziekenhuis;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Staff extends Person {
    public LocalDate joined;
    public Departement departement;

    public long getWorkDays(){
        LocalDate now = LocalDate.now();
        long days = ChronoUnit.DAYS.between(joined,now);
        return days;
    }
    public int getWorkYears(){
        LocalDate now = LocalDate.now();
        Period periode = Period.between(joined,now);
        return periode.getYears();
    }
    public String getPensionDate(){
        LocalDate pensionDate = joined.plusYears(42);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return formatter.format(pensionDate);
    }
    public void setJoined(String joined){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate joinDate = LocalDate.parse(joined,formatter);
        this.joined = joinDate;
    }
    public String getJoined(){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return formatter.format(joined);
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    public String toString(){
        return this.getGivenName() + " has worked here since " + this.getJoined() + " in the departement " + this.getDepartement() +".\n" +
               "Duty days: " + this.getWorkDays() + ", duty years: " + this.getWorkYears() + " and will be retiring on " + this.getPensionDate() + "\n";
    }
}
