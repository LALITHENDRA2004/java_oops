public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world..");
    }
}

// main() method is the entry point of any java program.

// why public? 
// -> public means this method is accessible from anywhere.
// -> The JVM needs to access the main() method to run our program.
// -> If we make it private or protected, the JVM won't be able to see it, and we will get a runtime error.

// why static?
// -> static means method belongs to the class, not to any specific object.
// -> which means if the method is not static, the JVM need to create an object and then call the main() 
//    method via object which is an extra work.

// why void?
// -> main() method is of return type void because it is not expected to return any value to the JVM.
// -> Instead of using a return value, the JVM monitors the program execution and handles termination automatically 
//    when the main() method finishes.

// why main?
// -> main is a special name recognized by the JVM as the program's entry point.
// -> if we try to use any other inplace of main(), it throws an error, Main method not found.
// -> If two classes in the same file have their own main() methods, and the file is compiled properly, we can run 
//    either class by using 'java ClassName', where ClassName is the name of the class containing the main() method.

// why String[] args?
// -> This allows us to pass command line arguements to our program.
// -> While running the program using 'java ClassName' command if we give space seperated values after the class 
//    name, each value is taken as an element of the String array.
// -> The name of the array can be anything, args is just a convention.
