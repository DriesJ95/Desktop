package domain;

import java.util.Date;

public class GuestBookBean {

    private Date date;

    private String name;

    private String message;

    public GuestBookBean(Date date, String name, String message){
        this.date = date;
        this.name = name;
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "domain.GuestBookBean{" +
                "date=" + date +
                ", name='" + name + '\'' +
                ", message='" + message + '\'' +
                '}' + '\n' ;
    }
}
