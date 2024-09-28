public class App {
    public static void main(String[] args) throws Exception {

        AbstractFactory<Color> colorAbstractFactory= AbstractFactoryProvider.getFactory("COLOR");
        Color color = colorAbstractFactory.create("Blue");
        color.fill();

        AbstractFactory<Shape> shAbstractFactory = AbstractFactoryProvider.getFactory("SHAPE");
        Shape shape = shAbstractFactory.create("Circle");
        shape.draw();

        AbstractFactory<Shape> nAbstractFactory = AbstractFactoryProvider.getFactory("SHAPE");
        Shape shape2 = nAbstractFactory.create("cube");
        shape2.draw();

    }
}
