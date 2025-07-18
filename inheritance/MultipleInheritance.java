interface Camera {
    // - the methods in an interface are public abstact by default
    // - the methods in interface are public by default because, any class 
    //   which implements an interface should be able to access the methods
    // - if the scope is not public, the methods cant be accessed by every 
    //   class (restricted accordingly)
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

class SmartPhone implements Camera, MusicPlayer {
    // we should define the method public only since the interface declares 
    // it public by default 
    public void takePhoto() {
        System.out.println("Taking photo...");
    }

    public void playMusic() {
        System.out.println("Playing music...");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();

        smartPhone.takePhoto();
        smartPhone.playMusic();
    }
}
