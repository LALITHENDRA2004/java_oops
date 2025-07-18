interface TVRemote {
    void increaseVolume();
    void decreaseVolume();
}

class SamsungTVRemote implements TVRemote{
    @Override
    public void increaseVolume() {
        System.out.println("Volume increased...");
    }

    @Override 
    public void decreaseVolume() {
        System.out.println("Volume decreased...");
    }
}

public class CompleteAbstraction {
    public static void main(String[] args) {
        SamsungTVRemote tvRemote = new SamsungTVRemote();

        tvRemote.increaseVolume();
        tvRemote.decreaseVolume();
    }
}
