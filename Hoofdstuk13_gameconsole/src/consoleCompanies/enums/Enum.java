package consoleCompanies.enums;

import java.io.ObjectInputStream;
import java.io.Serializable;

public abstract class Enum implements Comparable, Serializable {
    private String name;
    private int ordinal;

    public Enum(String name, int ordinal){
        this.name = name;
        this.ordinal = ordinal;
    }

    public String name(){
        return name;
    }
    public int ordinal(){
        return ordinal;
    }
    public String toString(){
        return name() + " " + ordinal();
    }
    public boolean equals(Object object){
        if (object.equals(this)){
            return true;
        }else{
            return false;
        }
    }
    public Object clone(){
        return this;
    }
    public int compareTo(int e){
        return e;
    }
    //public T valueOf(Class<T>, String){}

    @Override
    public void finalize(){

    }
    private void readObject(ObjectInputStream stream){}

    private void readObjectNoData(){}


}
