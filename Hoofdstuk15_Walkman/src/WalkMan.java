public class WalkMan implements Player{
    public String type;
    public Casette casette;
    public boolean sound = false;

    public WalkMan(){
        this("");
    }

    public WalkMan(String type){
        setType(type);
    }

    public Casette getCasette(){
        return casette;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setCasette(Casette casette){
        this.casette = casette;
    }

    @Override
    public void play() {
        sound = true;
        System.out.println("WalkMan is playing");
    }

    @Override
    public void stop() {
        sound = false;
        System.out.println("WalkMan stopped");
    }

    @Override
    public void pause() {
        sound = false;
        System.out.println("WalkMan paused");
    }

    @Override
    public void reverse() {
        sound = true;
        System.out.println("Satanic jibber jabber resounds");

    }

    @Override
    public void eject(){
        sound = false;
        System.out.println("CD ejected from WalkMan");
    }
}
