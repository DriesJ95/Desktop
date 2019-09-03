package opdracht_voetbal;

import java.util.Arrays;

public class Team {
    public Long id;
    public String name;
    public String city;
    public String country;
    public Player[] players = new Player[]{};

    public Team(Long id, String name, String city, Country country) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.country = country.name();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public void addPlayer(Player player){
        Player [] temp = new Player [players.length+1];
        for (int i = 0; i < players.length; i++){
            temp[i] = players[i];
        }
        temp[temp.length-1] = player;
        players = temp;
    }

    @Override
    public String toString() {
        return "[Team id: " + id +
                ", name: '" + name + '\'' +
                ", city: '" + city + '\'' +
                ", country: '" + country + '\'' +
                "\n  Players: " + Arrays.toString(players) + "]";
    }
}
