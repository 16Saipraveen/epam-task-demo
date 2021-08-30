
class Rectangle{
    int height;
    int width;
    public void setHeigth(int height){
        this.height = height;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public void Area(){
        System.out.println("Area is "+ (height*width));
    }
}

class Square extends Rectangle{
    int height;
    int width;
    public void setHeigth(int height){
        this.height = height;
        this.width = height;
    }
    public void setWidth(int width){
        this.width = width;
        this.height = width;
    }
    public void Area(){
        System.out.println("Area is "+ height*width);  
    }

}

class Liskov{
     public static void main(String[] args) {
        Square s = new Square();
        s.setHeigth(5);
        s.setWidth(4);
        s.Area();
    }
}