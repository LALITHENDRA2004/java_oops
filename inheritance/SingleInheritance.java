class Employee {
    static String name = "Lalitendra";
    static int id = 525;
}

class Developer extends Employee {
    static String programmingLanguage = "CPP";

    public static void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Skill: " + programmingLanguage);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.printDetails();
    }
}
