public class Kid implements PersonInterface{


    @Override
    public void walk() {
        System.out.println("I am walking");
    }

    @Override
    public void stop() {
        System.out.println("I stopped walking");

    }
}
