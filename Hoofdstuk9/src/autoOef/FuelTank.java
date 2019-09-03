package autoOef;

public class FuelTank {
    private float litresFuel;
    public final float maxFuelCapacity = 60;

    public FuelTank(){
        this.litresFuel = 0;
    }

    public void addFuel(float litresFuel){
        this.litresFuel += litresFuel;
        if (this.litresFuel > maxFuelCapacity){
            this.litresFuel = maxFuelCapacity;
        }
    }

    public void removeFuel(float litresFuel){
        this.litresFuel -= litresFuel;
        if (this.litresFuel < 0){
            this.litresFuel = 0;
        }
    }

    public boolean isEmpty(){
        if (this.litresFuel == 0){
            return true;
        }else{
            return false;
        }
    }

    public boolean isFull(){
        if (this.litresFuel == this.maxFuelCapacity){
            return true;
        }else{
            return false;
        }
    }
}
