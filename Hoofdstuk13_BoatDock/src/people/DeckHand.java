package people;

public class DeckHand extends Person {
    public String nickName;
    public DeckHand(String name,String nickName, int age){
        super(name,age);
        setNickName(nickName);
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
