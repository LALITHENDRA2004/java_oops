public class ScopesOfMembers1 {    
    public int id1 = 1;
    private int id2 = 2;
    protected int id3 = 3;
    public static void main(String[] args) {
        ScopesOfMembers1 obj = new ScopesOfMembers1();
        System.out.println(obj.id1);
        System.out.println(obj.id2);
        System.out.println(obj.id3);
    }
}

// within the same class, any variable can be accessed irrespective of the 
// scope of the memeber