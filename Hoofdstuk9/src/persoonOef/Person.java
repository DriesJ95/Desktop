package persoonOef;
import java.util.Arrays;

public class Person {

    private String name;
    private String lastName;
    private String address;
    private int age;
    private double height;
    private String [] hobbys;

    public Person(){
        this("","","",0,0,new String[0]);
    }
    public Person(String name, String lastName){
        this(name, lastName, "", 0, 0,new String[0]);
    }
    public Person(String name, String lastName,String address, int age, double height, String [] hobbys){
        setName(name);
        setLastName(lastName);
        setAddress(address);
        setAge(age);
        setHeight(height);
        setHobbys(hobbys);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String street, int number, int zip) {
        this.address = street + " " + number + " " + zip;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String[] getHobbys() {
        return hobbys;
    }

    public void setHobbys(String[] hobbys) {
        this.hobbys = hobbys;
    }

    public void addHobby(String hobby){
        String[] temp = new String[this.hobbys.length+1];
        for(int i = 0; i < this.hobbys.length-1; i++){
            temp[i] = hobbys[i];
        }
        temp[this.hobbys.length] = hobby;
        this.hobbys = temp;
    }
    public void printInfo(){
        System.out.println("name: " + this.getName() + " " + this.getLastName());
        System.out.println("age: " + this.getAge());
        System.out.println("address: " + this.getAddress());
        System.out.println("height: " + this.getHeight());
        System.out.println("hobbys: " + Arrays.toString(getHobbys()));
    }





}
