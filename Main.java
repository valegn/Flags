import java.awt.*;

// import static sun.security.util.Debug.args;

public class Main {

    public static final int COLOR_YELLOW = new Color(250, 201, 20).getRGB();
    public static final int COLOR_BLUE = new Color(17, 13, 99).getRGB();
    public static final int COLOR_RED = new Color(196, 0, 15).getRGB();
    public static final int COLOR_BLACK = new Color(5, 5, 5).getRGB();
    public static final int COLOR_WHITE = new Color(255, 255, 255).getRGB();
    public static final int COLOR_GREEN = new Color(35, 138, 51).getRGB();

    public static int[][] createCheFlag (int height, int width) {
        int[][] flagChe = new int[height][width];
        int rowIni = 0;
        int rowEnd = 0;

        rowIni = (int) (height * 0.0);
        rowEnd = (int) (height * 1.0);
        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < flagChe[row].length; cell++)
                flagChe[row][cell] = COLOR_RED;
        }
        int cellini = (int) (width * 0.4);

        int cellf = (int) (width * 0.6);
        rowIni = (int) (height * 0.1);
        rowEnd = (int) (height * 0.95);
        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = cellini; cell < cellf; cell++)
                flagChe[row][cell] = COLOR_WHITE;
        }

        cellini = (int) (width * 0.1);

         cellf=(int)(width*0.90);
        rowIni=(int)(height*0.4);
        rowEnd=(int)(height*0.6);
        for (int row=rowIni;row<rowEnd;row++){
            for (int cell =cellini; cell<cellf; cell++)
                flagChe[row][cell] = COLOR_WHITE;
        }

            return flagChe;
        }



     }
