interface Engine {
    public void start();
}



class Car{
    private Enginee engine;
    public Car(Engine e) {
        engine = e;
    }
    public void start() {
        engine.start();
    }
}

class PetrolEngine implements Engine {
   public void start() {System.out.println("Petrolengine");}
}
class DieselEngine implements Engine {
   public void start() {System.out.println("Diesel engine");}
}

class DependencyInversion{
    public static void main(String args[]){
        Car c = new Car(new PetrolEngine());
        c.start();
    }
}