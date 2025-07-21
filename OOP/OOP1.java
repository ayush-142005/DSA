package OOP;

public class OOP1 {
    static class Student {
        //Instance variables
        int roll_no ;
        String name ;
        double marks ;
        Student(){
            this.roll_no=10;
            this.name="Ayush";
            this.marks=8.69;
        }
        Student (int roll_no,String name, double marks){
            this.roll_no=roll_no;
            this.name=name;
            this.marks=marks;
        }

        void greeting(){
            System.out.println("My name is "+ this.name);
        }
        void changename(String newname){
            this.name=newname;
        }
    }
    public static void main(String[] args) {
        Student S1 = new Student();
        S1.name="Ayush Hood";
        System.out.println(S1.name) ;
        S1.greeting();
        Student S2 = new Student(10,"Ayush Kumar",9.7);
        S2.greeting();
        S2.changename("Ayush Hood");
        S2.greeting();


    }
}
