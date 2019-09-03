public class GeslachtClass<E> {
    private E geslacht;

    public GeslachtClass(E geslacht){
        this.geslacht = geslacht;
    }

    public String name(){
        try {
            return (String) geslacht;
        }catch (Exception e){

        }
        return ((GeslachtClass.Geslacht) geslacht).name();
    }


    public enum Geslacht{
        MAN,VROUW;
    }

}
