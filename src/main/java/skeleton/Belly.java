package skeleton;

public class Belly {
    boolean growling = false;
    public void eat(int cukes) {
        System.out.println("om nom nom");
    }
    public void wait(int hours) {
        growling=true;
    }
    public boolean isGrowling() {
        return growling;
    }
}
