// Access Modifiers 
// These are used to control the access the members of a class 
// 4 types:
// 1. public 
// 2. private
// 3. Protected 
// 4. if nothing specified - package-private (default)

class Student {
    // name can be accessed by any class in the same package or other package 
    // (no need to import)
    public String name = "Lalitendra";

    // id can only be accessed in the same class
    private int id = 25;

    // gender can be accessed only in the classes in the same package or 
    // sub classes (need to import) in different package
    protected char gender = 'M';

    // age can only be accessed by the classes in same package 
    // hence called as package-private
    int age = 21;

    // branch is a class variable. It is not specific to any object.
    // Generally if a variables value is common to all the object of the class
    // it is declared as static 
    static String branch = "CSE";

    public Student() {}

    public Student(int id) {
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
    }
}
public class ScopesOfMembers2 {
    public static void main(String[] args) {
        
        Student student = new Student();
        System.out.println(student.name);     
        System.out.println(student.age);   
        System.out.println(student.gender);   

        // -> Except the private variable, every variable can be accessed and 
        //    modified which is harmful 
        // -> So in maximum cases the variables are declared private and 
        //    we use public methods called setters and getters to access them
        // -> If you dont want a variable to get modified use 'final' to make 
        //    it constant Ex: final int PI = 3.14;
        // -> To access private variables we need to initialise the values 
        //    of the object using constructor or setter methods and then 
        //    access them using public getter methods


        Student student1 = new Student(25);
        System.out.println("student1.id = " + student1.getId());

        Student student2 = new Student();
        student2.setId(50);
        System.out.println("student2.id = " + student2.getId());

        // branch is accessed via class name since it is a static variable
        System.out.println(Student.branch);
    }
}
