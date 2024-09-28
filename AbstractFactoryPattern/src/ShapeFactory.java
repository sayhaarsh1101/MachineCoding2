import exception.ObjectCreationException;

public class ShapeFactory implements AbstractFactory<Shape>{

    @Override
    public Shape create(String shapeType){
        switch(shapeType){
            case "Rectangle" : return new Rectangle();
            case "Circle" : return new Circle();
            default : throw new ObjectCreationException(shapeType);
        }
    }
}
