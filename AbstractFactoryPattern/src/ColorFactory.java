import exception.ObjectCreationException;

public class ColorFactory implements AbstractFactory<Color>{

    public  Color create(String colorType){

        switch(colorType){
            case "Blue" : return new Blue();
            case "Red" : return new Red();
            default : throw new ObjectCreationException("colorType");

        }
    }

}
