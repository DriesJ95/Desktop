public class Casette {
    public String name;
    public String music;

    public Casette(String name, String music){
        setName(name);
        setMusic(music);
    }

    public Casette(String name){
        this(name,"");
    }

    public Casette(){
        this("","");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMusic(String music) {
        this.music = music;
    }
}
