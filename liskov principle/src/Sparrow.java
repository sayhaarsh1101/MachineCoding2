public class Sparrow implements FlyingBird, WalkingBird {

    @Override
    public void eat(){
        System.out.println("Sparrow can eat");
    }

    @Override
    public void walk(){
        System.out.println("Sparrow can walk");
    }

    @Override
    public void fly(){
        System.out.println("Sparrow can fly");
    }

}
