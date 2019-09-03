package superHeroes;

public abstract class Hero {
    private String alias;
    private int age;

    public Hero(String alias, int age){
        this.alias = alias;
        this.age = age;
    }

    public abstract void useSuperPower();

    public String getAlias(){
        return this.alias;
    }
    public int getAge(){
        return this.age;
    }


}
