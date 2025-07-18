// Base class
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Interface 1
interface Speaker {
    void giveLecture();
}

// Interface 2
interface ContentCreator {
    void createCourse();
}

// Teacher class: inherits from Person and implements 2 interfaces
class Teacher extends Person implements Speaker, ContentCreator {
    int teacherId;

    Teacher(String name, int age, int teacherId) {
        super(name, age);
        this.teacherId = teacherId;
    }

    public void giveLecture() {
        System.out.println("Giving a lecture...");
    }

    public void createCourse() {
        System.out.println("Creating a course...");
    }

    void displayTeacher() {
        displayPerson();
        System.out.println("Teacher ID: " + teacherId);
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Dr. Arvind", 40, 1234);
        teacher.displayTeacher();
        teacher.giveLecture();
        teacher.createCourse();
    }
}
