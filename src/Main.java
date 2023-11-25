import java.awt.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        String[] array = new String[]{"5", "3", "7", "8", "10"};
//        Arrays.sort(array, new StringComporator());
//        System.out.println(Arrays.toString(array));
//
//        Pelmen[] pelmens = new Pelmen[]{new Pelmen(100, Color.CYAN, "мираторг"), new Pelmen(100, Color.MAGENTA, "красная цена"), new Pelmen(100, Color.CYAN, "сибирская коллекция")};
//        Arrays.sort(pelmens);
//        System.out.println(Arrays.toString(pelmens));
        GeometryObjects[] geometryObjects = new GeometryObjects[]{new Rectangle(3, 6), new Round(7), new Triangle(3, 4, 5)};
        System.out.println(Arrays.toString(geometryObjects));
        Arrays.sort(geometryObjects);
        System.out.println(Arrays.toString(geometryObjects));
        geometryObjects[0].setScale(3);
        geometryObjects[2].setScale(0.5);
        geometryObjects[1].setScale(2);
        System.out.println(Arrays.toString(geometryObjects));
        Arrays.sort(geometryObjects);
        System.out.println(Arrays.toString(geometryObjects));
    }
}