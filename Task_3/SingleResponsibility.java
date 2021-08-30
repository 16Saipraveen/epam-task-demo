class Student{
    String name;
    int age;
    String reg_Id;
    public Student(String name, int age, String reg_Id) {
        this.name = name;
        this.age = age;
        this.reg_Id = reg_Id;
    }
    public void disp_details(){
        System.out.println("Student name is "+this.name+" his age is "+this.age+" and redg number is "+this.reg_Id);
    }
}

class Student_marks{
    int marks;
    public Student_marks(int marks){
        this.marks = marks;
    }
    public void display_marks(){
        System.out.println("The marks obtained by the student is "+this.marks);
    }
}


public class SingleResponsibility{
    public static void main(String[] args) {
        Student s = new Student("Kumar",20,"17pa1a0565");
        s.disp_details();
        Student_marks sm = new Student_marks(50);
        sm.display_marks();
    }
}