package dierensoorten;

public abstract class Animal {
        private String name;

        public Animal(){}
        public Animal(String name){

        }
        public void setName(String name){
            this.name = name;
        }
        public String getName(){
            return this.name;
        }
        public abstract void move();
        public abstract void makeNoise();
}
