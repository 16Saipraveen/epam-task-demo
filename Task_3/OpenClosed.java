
class Vehicle {
    String vehicle_num;
    public void display(){
        System.out.println("Vehicle number is" + vehicle_num);
    }
}

class car extends Vehicle{
    String num;
    public car(String num){
        this.num = num;
    }
    @Override
    public void display() {
        System.out.println("Car number is "+ num);
    }
}

class OpenClosed{
    public static void main(String[] args) {
        car c = new car("AP37BV6315");
        c.display();
    }
}