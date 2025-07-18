class Person {
    String name;
    int age;

    Person() {}

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    int studentId;
    
    Student(String name, int age, int studentId) {
        // - the derived class first calls the constructor of parent class 
        //   before excution of the derived class's constructor to initialise 
        //   the values to the attributes of the parent class.
        // - super(name, age) calls the parent class Constructor
        // - if this statement is not written, it calls the Default constructor
        //   by default.
        // - if the default constructor is available, there is no issue 
        // - if not, it will throw a compile time error
        super(name, age); 
        this.studentId = studentId;
        System.out.println("Student Details: ");
    } 
}

class Teacher extends Person {
    int teacherId;

    Teacher(String name, int age, int teacherId) {
        super(name, age);
        this.teacherId = teacherId;
        System.out.println("Teacher Details: ");
    }
}

public class HierarchialInheritance {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Drona", 50, 456);

        System.out.println(teacher.name);
        System.out.println(teacher.age);
        System.out.println(teacher.teacherId);
        System.out.println();

        Student student = new Student("Arjuna", 30, 123);

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.studentId);

    }
}
