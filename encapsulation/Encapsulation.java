class Student {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Student student = new Student("Arjuna", 25);

        System.out.println(student.getName());
        System.out.println(student.getAge());

        student.setName("Karna");
        student.setAge(30);

        System.out.println(student.getName());
        System.out.println(student.getAge());
    }
}
