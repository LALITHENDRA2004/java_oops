// Constructor
// A constructor in Java is a special method that is used to initialize 
// objects.
// The constructor is called when an object of a class is created.
// It can be used to initialise values 

class Movie {
    private String name;
    private int year;
    private String director;

    // Default constructor
    public Movie() {
        // this can also be used the call other constructor of the same class
        // it should be the first statement if used 
        this("name", 0, "director");

        System.out.println("Default constructor is called.");
    }

    // Parameterised constructor
    public Movie(String name, int year, String director) {
        // -> here this is used to refer the current object
        // -> it is used to avoid confusion when the parameters and instance 
        //    variables have same name
        // -> left side variables are instance variables
        // -> right side variables are parameters passed to the constructors
        this.name = name;
        this.year = year;
        this.director = director;
    }

    // Copy constructor
    // the values are initialised with the values of movie
    public Movie(Movie movie) {
        this.name = movie.name;
        this.year = movie.year;
        this.director = movie.director;
    }


    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("year: " + year);
        System.out.println("Director: " + director);
    }

}

public class Constructors {
    public static void main(String[] args) {
        // since no values are provided, values are initialised with default
        // ones, and also the default constructor is executed.
        Movie movie1 = new Movie();
        movie1.displayDetails();

        // since values are provided parameterised constructor is executed
        Movie movie2 = new Movie("RRR", 2024, "Rajamouli");
        movie2.displayDetails();

        // since another object is provided as parameter copy constructor 
        // is executed
        Movie movie3 = new Movie(movie2);
        movie3.displayDetails();

    }
}
