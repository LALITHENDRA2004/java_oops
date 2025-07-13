class PrivateScope {
    static void printScope() {
        System.out.println("This class has private scope");
    }
}

public class ScopesOfClasses {
    public static void main(String[] args) {
        System.out.println("This class has public scope.");
        PrivateScope.printScope();
    }
}

// Scope:

// The scope of a class can be two types, 
// 1. Public scope - Can be visible to anywhere
// 2. Package-private scope - Only visible within the same package
