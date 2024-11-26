class Cycle {
    void ride() {
        System.out.println("My ancestor is a cycle who is a vehicle with pedals.");
    }
}

class Motorcycle extends Cycle {
    @Override
    void ride() {
        System.out.println("Hello I am a motorcycle, I am a cycle with an engine.");
        super.ride();
    }
}

public class Solution5 {
    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.ride();
    }
}
