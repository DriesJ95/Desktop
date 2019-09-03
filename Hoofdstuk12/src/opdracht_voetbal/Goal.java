package opdracht_voetbal;
import java.time.Instant;
import java.util.Date;

public class Goal {
    public Long id;
    public Date time;
    public String description;

    public Goal(){}

    public Goal(String description){
        this.description = description;
        this.time = Date.from(Instant.now());
    }

}
