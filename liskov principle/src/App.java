public class App {
    public static void main(String[] args) throws Exception {

        Bird penguinBird = new Penguin();
        penguinBird.eat();

        FlyingBird spFlyingBird = new Sparrow();
        spFlyingBird.fly();

        WalkingBird peWalkingBird = new Penguin();
        peWalkingBird.eat();
        peWalkingBird.walk();

        WalkingBird spWalkingBird = new Sparrow();
        spWalkingBird.eat();
        spWalkingBird.walk();;

    }
}
