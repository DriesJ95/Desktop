package opdracht_ziekenhuis;

public class Person {
    private String title;
    private String givenName;
    private String middleName;
    private String familyName;
    private String homeAddress;
    private Gender gender;

    public Person(String title, String givenName,String middleName, String familyName, String homeAddress, Gender gender){
        setTitle(title);
        setGivenName(givenName);
        setMiddleName(middleName);
        setFamilyName(familyName);
        setHomeAddress(homeAddress);
        setGender(gender);
    }

    public Person(){
        this("","","","","",null);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
