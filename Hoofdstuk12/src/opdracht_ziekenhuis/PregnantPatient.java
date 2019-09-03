package opdracht_ziekenhuis;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class PregnantPatient extends Patient {
    public LocalDate dateOfExpectedDelivery;

    public int getDaysToBirth(){
        LocalDate now = LocalDate.now();
        Period periode = Period.between(now,dateOfExpectedDelivery);
        return periode.getDays();
    }

    public void setDeliveryDate(String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate joinDate = LocalDate.parse(date,formatter);
        this.dateOfExpectedDelivery = joinDate;
    }
}
