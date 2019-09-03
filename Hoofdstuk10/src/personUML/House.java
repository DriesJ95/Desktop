package personUML;

public class House {
    private LivingRoom living;
    private Address address;


    public House(){
        living = new LivingRoom();
    }

    public House(Address address){
        living = new LivingRoom();
        setAddress(address);
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
