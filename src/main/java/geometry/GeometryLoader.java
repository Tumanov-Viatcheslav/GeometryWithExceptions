package geometry;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeometryLoader {

    public static List<Rectangle> loadListOfRectangles(String filePath) {
        List<Rectangle> rectangles = new ArrayList<>();
        try (BufferedReader input = new BufferedReader(new FileReader(filePath))) {
            String line;
            String[] splitLine;
            while ((line = input.readLine()) != null) {
                splitLine = line.split(" ");
                try {
                    Double.parseDouble(splitLine[0]);
                    Double.parseDouble(splitLine[1]);
                    rectangles.add(new Rectangle(Double.parseDouble(splitLine[0]), Double.parseDouble(splitLine[1])));
                }
                catch (Exception ex) {
                    System.out.println(ex.getClass().getName() + ": " + ex.getMessage());
                }

            }
        }
        catch (IOException ex) {
            System.out.println(ex.getClass().getName() + ": " + ex.getMessage());
        }
        return rectangles;
    }
}
