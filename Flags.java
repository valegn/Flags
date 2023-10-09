import java.awt.*;

public class Flags {

// import static sun.security.util.Debug.args;

    public static final int COLOR_YELLOW = new Color(250, 201, 20).getRGB();
    public static final int COLOR_BLUE = new Color(17, 13, 99).getRGB();
    public static final int COLOR_RED = new Color(196, 0, 15).getRGB();
    public static final int COLOR_BLACK = new Color(5, 5, 5).getRGB();
    public static final int COLOR_WHITE = new Color(255, 255, 255).getRGB();
    public static final int COLOR_GREEN = new Color(35, 138, 51).getRGB();

    public static int[][] createUSFlag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0;
        int rowEnd = 0;
        int cellF = 0;
        rowIni = 0;
        rowEnd = (int) (height * 0.50);
        int cellIni = 0;
        cellF = (int) (height * 0.50);
        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = cellIni; cell < cellF; cell++)
                flag[row][cell] = COLOR_BLUE;
        }
        int w = (int) (height / 12);


        rowIni = 0;
        rowEnd = (int) (height * 0.50);
        cellIni = rowEnd;
        cellF = (int) (width * 1.0);
        for (int row = rowIni; row < rowEnd; row += w) {
            for (int cell = cellIni; cell < cellF; cell++)
                if ((row / w) % 2 == 0) {
                    for (int k = 0; k < w; k++) {
                        flag[row + k][cell] = COLOR_RED;
                    }
                } else {
                    for (int k = 0; k < w; k++) {
                        flag[row + k][cell] = COLOR_WHITE;
                    }}}

        w = (int) (height / 12);
        rowIni = (int) (height * 0.50);
        rowEnd = (int) (height * 1.0);
        cellIni = (int) (height * 0.0);
        cellF = (int) (width * 1.0);
        for (int row = rowIni; row < rowEnd; row += w) {
            for (int cell = cellIni; cell < cellF; cell++)
                if ((row / w) % 2 == 0) {
                    for (int k = 0; k < w; k++) {
                        flag[row + k][cell] = COLOR_RED;}
                } else {
                    for (int k = 0; k < w; k++) {
                        flag[row + k][cell] = COLOR_WHITE;
                    }}}

        return flag;
    }
    public static int[][] createNorFlag (int height, int width){
        int [][] flagnor = new int [height][width];
        int rowIni=0;
        int rowEnd=0;
        int cellF=0;
        int cellIni=0;
        cellF=(int)(width*1.0);
        rowEnd=(int)(height*1.0);
        for (int row=rowIni;row<rowEnd;row++) {
            for (int cell = cellIni; cell < cellF; cell++)
                flagnor[row][cell] = COLOR_RED;

        }
        cellIni=(int)(width*0.30);
        cellF=(int)(width*0.45);
        rowIni=(int)(height*0.0);
        rowEnd=(int)(height*1.0);
        for (int row=rowIni;row<rowEnd;row++) {
            for (int cell =cellIni ; cell < cellF; cell++)
                flagnor[row][cell] = COLOR_WHITE;
        }
        cellIni=(int)(width*0.0);
        cellF=(int)(width*1.0);
        rowIni=(int)(height*0.45);
        rowEnd=(int)(height*0.60);
        for (int row=rowIni;row<rowEnd;row++) {
            for (int cell =cellIni ; cell < cellF; cell++)
                flagnor[row][cell] = COLOR_WHITE;
        }
        ////////////
        cellIni=(int)(width*0.35);
        cellF=(int)(width*0.40);
        rowIni=(int)(height*0.0);
        rowEnd=(int)(height*1.0);
        for (int row=rowIni;row<rowEnd;row++) {
            for (int cell =cellIni ; cell < cellF; cell++)
                flagnor[row][cell] = COLOR_BLUE;
        }
        cellIni=(int)(width*0.0);
        cellF=(int)(width*1.0);
        rowIni=(int)(height*0.48);
        rowEnd=(int)(height*0.55);
        for (int row=rowIni;row<rowEnd;row++) {
            for (int cell =cellIni ; cell < cellF; cell++)
                flagnor[row][cell] = COLOR_BLUE;
        }
        return flagnor;}

    public static int[][] createFinFlag (int height, int width){
        int [][] flagFin = new int [height][width];
        int rowIni=0;
        int rowEnd=0;
        int cellF=0;
        int cellIni=0;
        cellF=(int)(width*1.0);
        rowEnd=(int)(height*1.0);
        for (int row=rowIni;row<rowEnd;row++) {
            for (int cell = cellIni; cell < cellF; cell++)
                flagFin[row][cell] = COLOR_WHITE;}
        cellIni=(int)(width*0.30);
        cellF=(int)(width*0.50);
        rowIni=(int)(height*0.0);
        rowEnd=(int)(height*1.0);
        for (int row=rowIni;row<rowEnd;row++) {
            for (int cell =cellIni ; cell < cellF; cell++)
                flagFin[row][cell] = COLOR_BLUE;}
        cellIni=(int)(width*0.0);
        cellF=(int)(width*1.0);
        rowIni=(int)(height*0.40);
        rowEnd=(int)(height*0.60);
        for (int row=rowIni;row<rowEnd;row++) {
            for (int cell =cellIni ; cell < cellF; cell++)
                flagFin[row][cell] = COLOR_BLUE;
        }
        return flagFin;
    }
////////////////////////////
    public static int[][] createDNKFlag (int height, int width){
        int [][] flagDNK = new int [height][width];
        int rowIni=0;
        int rowEnd=0;
        int cellF=0;
        int cellIni=0;
        cellF=(int)(width*1.0);
        rowEnd=(int)(height*1.0);
        for (int row=rowIni;row<rowEnd;row++) {
            for (int cell = cellIni; cell < cellF; cell++)
                flagDNK[row][cell] = COLOR_RED;

        }
        cellIni=(int)(width*0.30);
        cellF=(int)(width*0.40);
        rowIni=(int)(height*0.0);
        rowEnd=(int)(height*1.0);
        for (int row=rowIni;row<rowEnd;row++) {
            for (int cell =cellIni ; cell < cellF; cell++)
                flagDNK[row][cell] = COLOR_WHITE;
        }
        cellIni=(int)(width*0.0);
        cellF=(int)(width*1.0);
        rowIni=(int)(height*0.45);
        rowEnd=(int)(height*0.55);
        for (int row=rowIni;row<rowEnd;row++) {
            for (int cell =cellIni ; cell < cellF; cell++)
                flagDNK[row][cell] = COLOR_WHITE;}
        return flagDNK;
    }
    public static int[][] createPMFlag (int height, int width){
        int [][] flagPM = new int [height][width];
        int rowIni=0;
        int rowEnd=0;
        int cellF=0;
        rowIni=0;
        cellF=(int)(width*0.50);
        int cellIni=0;
        rowEnd=(int)(height*0.50);
        for (int row=rowIni;row<rowEnd;row++) {
            for (int cell = cellIni; cell < cellF; cell++)
                flagPM[row][cell] = COLOR_WHITE;}
        cellF=(int)(width*1.0);
        cellIni=(int)(width*0.50);
        rowIni=0;
        rowEnd=(int)(height*0.50);
        for (int row=rowIni;row<rowEnd;row++) {
            for (int cell =cellIni ; cell < cellF; cell++)
                flagPM[row][cell] = COLOR_RED;}
        cellF=(int)(width*0.50);
        cellIni=0;
        rowIni=(int)(height*0.50);
        rowEnd=(int)(height*1.0);
        for (int row=rowIni;row<rowEnd;row++) {
            for (int cell = cellIni; cell < cellF; cell++)
                flagPM[row][cell] = COLOR_BLUE;

        }
        cellF=(int)(width*1.0);
        cellIni=(int)(width*0.50);
        rowIni=(int)(height*0.50);
        rowEnd=(int)(height*1.0);
        for (int row=rowIni;row<rowEnd;row++) {
            for (int cell =cellIni ; cell < cellF; cell++)
                flagPM[row][cell] = COLOR_WHITE;

        }
        return flagPM;
    }
    public static int[][] createCOLFlag (int height, int width){
        int [][] flagCOL = new int [height][width];
        int rowIni=0;
        int rowEnd=0;
        rowEnd=(int)(height*0.40);
        for (int row=rowIni;row<rowEnd;row++) {
            for (int cell = 0; cell < flagCOL[row].length; cell++)
                flagCOL[row][cell] = COLOR_YELLOW;


        }
        rowIni = (int) (height * 0.40);
        rowEnd = (int) (height * 0.75);
        for (int row=rowIni;row<rowEnd;row++){
            for (int cell = 0; cell < flagCOL[row].length; cell++)
                flagCOL[row][cell] = COLOR_BLUE;
        }
        rowIni = (int) (height * 0.75);
        rowEnd = (int) (height * 1.0);
        for (int row=rowIni;row<rowEnd;row++){
            for (int cell = 0; cell < flagCOL[row].length; cell++)
                flagCOL[row][cell] = COLOR_RED;
        }

        return flagCOL;
    }
    //////////77
    public static int[][] createVenzFlag (int height, int width){
        int [][] flagVenz = new int [height][width];
        int rowIni=0;
        int rowEnd=0;
        rowEnd=(int)(height*0.34);
        for (int row=rowIni;row<rowEnd;row++) {
            for (int cell = 0; cell < flagVenz[row].length; cell++)
                flagVenz[row][cell] = COLOR_YELLOW;


        }
        rowIni = (int) (height * 0.34);
        rowEnd = (int) (height * 0.67);
        for (int row=rowIni;row<rowEnd;row++){
            for (int cell = 0; cell < flagVenz[row].length; cell++)
                flagVenz[row][cell] = COLOR_BLUE;
        }
        rowIni = (int) (height * 0.67);
        rowEnd = (int) (height * 1.0);
        for (int row=rowIni;row<rowEnd;row++){
            for (int cell = 0; cell < flagVenz[row].length; cell++)
                flagVenz[row][cell] = COLOR_RED;
        }

        return flagVenz;
    }


    //SOUTHAFRICA
    public static int[][] createZAFFLAG(int heigth, int width) {
        int[][] flagZaf = new int[heigth][width];
        int rowIni = 0;
        int rowEnd = 0;
        int cellIni = 0;
        int cellEnd = 0;

        //COLOR RED
        rowIni = 0;
        rowEnd = (int) (heigth * 0.35);
        cellIni = 0;
        cellEnd = width;

        for (int row = rowIni; row < rowEnd; row++) {

            for (int cell = cellIni; cell < cellEnd; cell++) {
                flagZaf[row][cell] = COLOR_RED;
            }
        }

        //COLOR WHITE
        rowIni = rowEnd;
        rowEnd = (int) (heigth * 0.7);
        cellIni = 0;
        cellEnd = width;

        for (int row = rowIni; row < rowEnd; row++) {

            for (int cell = cellIni; cell < cellEnd; cell++) {
                flagZaf[row][cell] = COLOR_WHITE;
            }
        }

        //COLOR BLUE
        rowIni = rowEnd;
        rowEnd = heigth;
        cellIni = 0;
        cellEnd = width;

        for (int row = rowIni; row < rowEnd; row++) {

            for (int cell = cellIni; cell < cellEnd; cell++) {
                flagZaf[row][cell] = COLOR_BLUE;
            }
        }

        //COLOR WHITE >
        rowIni = 0;
        rowEnd = (int) (heigth * 0.5);
        cellIni = 0;
        cellEnd = 1;

        for (int row = rowIni; row < rowEnd; row++) {
            cellEnd++;
            for (int cell = cellIni; cell < cellEnd; cell++) {
                flagZaf[row][cell] = COLOR_WHITE;
                flagZaf[heigth - 1 - row][cell] = COLOR_WHITE;
            }
        }

        //COLOR GREEN >
        rowIni = 0;
        rowEnd = (int) (heigth * 0.5);
        cellIni = 0;
        cellEnd = 0;

        for (int row = rowIni; row < rowEnd; row++) {
            cellEnd++;
            for (int cell = cellIni; cell < cellEnd; cell++) {
                flagZaf[row][cell] = COLOR_GREEN;
                flagZaf[heigth - 1 - row][cell] = COLOR_GREEN;
            }
        }
        //COLOR GREEN --
        rowIni = (int) (heigth * 0.5) - 1;
        rowEnd = rowIni + 2;
        cellIni = 0;
        cellEnd = width;

        for (int row = rowIni; row < rowEnd; row++) {

            for (int cell = cellIni; cell < cellEnd; cell++) {
                flagZaf[row][cell] = COLOR_GREEN;
            }
        }

        //COLOR YELLOW >
        rowIni = 2;
        rowEnd = (int) (heigth * 0.5);
        cellIni = 0;
        cellEnd = 0;

        for (int row = rowIni; row < rowEnd; row++) {
            cellEnd++;
            for (int cell = cellIni; cell < cellEnd; cell++) {
                flagZaf[row][cell] = COLOR_YELLOW;
                flagZaf[heigth - 1 - row][cell] = COLOR_YELLOW;
            }
        }

        //COLOR BLACK >
        rowIni = 3;
        rowEnd = (int) (heigth * 0.5);
        cellIni = 0;
        cellEnd = 0;

        for (int row = rowIni; row < rowEnd; row++) {
            cellEnd++;
            for (int cell = cellIni; cell < cellEnd; cell++) {
                flagZaf[row][cell] = COLOR_BLACK;
                flagZaf[heigth - 1 - row][cell] = COLOR_BLACK;
            }
        }

        return flagZaf;
    }
        public static int[][] createCheFlag(int height, int width){
            int[][] flagche=new int[height][width];
            int rowInt=0;
            int rowEnd=0;
            int cellInt=0;
            int cellEnd=0;

            rowEnd=height;

            cellEnd=width;
            for (int row=0; row<rowEnd; row++){
                for (int cell=0; cell<cellEnd; cell++){
                    flagche[row][cell]=Main.COLOR_WHITE;
                }
            }

            rowEnd=(int)(height*0.1);
            cellEnd=width;
            for (int row=0; row<rowEnd; row++){
                for (int cell=0; cell<cellEnd; cell++){
                    flagche[row][cell]=Main.COLOR_RED;
                }
            }

            rowInt=(int)(height*0.1);
            rowEnd=(int)(height*0.35);
            cellEnd=(int)(width*0.4);
            for (int row=rowInt; row<rowEnd; row++){
                for (int cell=0; cell<cellEnd; cell++){
                    flagche[row][cell]=Main.COLOR_RED;
                }
            }

            rowInt=(int)(height*0.35);
            rowEnd=(int)(height*0.6);
            cellEnd=(int)(width*0.20);
            for (int row=rowInt; row<rowEnd; row++){
                for (int cell=0; cell<cellEnd; cell++){
                    flagche[row][cell]=Main.COLOR_RED;
                }
            }

            rowInt=(int)(height*0.6);
            rowEnd=(int)(height*0.9);
            cellEnd=(int)(width*0.4);
            for (int row=rowInt; row<rowEnd; row++){
                for (int cell=0; cell<cellEnd; cell++){
                    flagche[row][cell]=Main.COLOR_RED;
                }
            }

            rowInt=(int) (height*0.9);
            rowEnd=height;
            cellEnd=width;
            for (int row=rowInt; row<rowEnd; row++){
                for (int cell=0; cell<cellEnd; cell++){
                    flagche[row][cell]=Main.COLOR_RED;
                }
            }

            rowInt=(int)(height*0.1);
            rowEnd=(int)(height*0.35);
            cellInt=(int)(width*0.6);
            cellEnd=(width);
            for (int row=rowInt; row<rowEnd; row++){
                for (int cell=cellInt; cell<cellEnd; cell++){
                    flagche[row][cell]=Main.COLOR_RED;
                }
            }

            rowInt=(int)(height*0.35);
            rowEnd=(int)(height*0.6);
            cellInt=(int)(width*0.8);
            cellEnd=(width);
            for (int row=rowInt; row<rowEnd; row++){
                for (int cell=cellInt; cell<cellEnd; cell++){
                    flagche[row][cell]=Main.COLOR_RED;
                }
            }

            rowInt=(int)(height*0.6);
            rowEnd=(int)(height*0.9);
            cellInt=(int)(width*0.6);
            cellEnd=(width);
            for (int row=rowInt; row<rowEnd; row++){
                for (int cell=cellInt; cell<cellEnd; cell++){
                    flagche[row][cell]=Main.COLOR_RED;}}
            return flagche;}
    public static int[][] createKWTFLAG(int heigth, int width) {
        int[][] flagkwt = new int[heigth][width];
        int rowIni = 0;
        int rowEnd = (int) ((double) heigth * 0.35);
        int cellIni = 0;
        int cellEnd = width;

        int row;
        int cell;
        for (row = rowIni; row < rowEnd; ++row) {
            for (cell = cellIni; cell < cellEnd; ++cell) {
                flagkwt[row][cell] = Main.COLOR_GREEN;
            }
        }

        rowIni = rowEnd;
        rowEnd = (int) ((double) heigth * 0.7);
        cellIni = 0;
        cellEnd = width;

        for (row = rowIni; row < rowEnd; ++row) {
            for (cell = cellIni; cell < cellEnd; ++cell) {
                flagkwt[row][cell] = Main.COLOR_WHITE;
            }
        }

        rowIni = rowEnd;
        rowEnd = heigth;
        cellIni = 0;
        cellEnd = width;

        for (row = rowIni; row < rowEnd; ++row) {
            for (cell = cellIni; cell < cellEnd; ++cell) {
                flagkwt[row][cell] = Main.COLOR_RED;
            }
        }

        rowIni = 0;
        rowEnd = (int) ((double) heigth * 0.5);
        cellIni = 0;
        cellEnd = 0;

        for (row = rowIni; row < rowEnd; ++row) {
            ++cellEnd;

            for (cell = cellIni; cell < cellEnd; ++cell) {
                flagkwt[row][cell] = Main.COLOR_BLACK;
                flagkwt[heigth - 1 - row][cell] = Main.COLOR_BLACK;
            }
        }
        return flagkwt;
    }
    public static int[][] createCzeFlag(int height, int width){
        int[][] flagcze= new int[height][width];
        int rowInt=0;
        int rowEnd=0;
        int rowIntTwo=0;
        int rowEndTwo=0;

        rowInt=(int)(height*0);
        rowEnd=(int)(height*0.5);
        rowIntTwo=(int)(width*0);
        rowEndTwo=(int)(width);
        for (int row=rowInt; row<rowEnd; row++){
            for (int cell=rowIntTwo; cell<rowEndTwo; cell++){
                flagcze[row][cell]=Main.COLOR_WHITE;
            }
        }

        rowInt=(int)(height*0.5);
        rowEnd=(int)(height);
        rowIntTwo=(int)(width*0);
        rowEndTwo=(int)(width);
        for (int row=rowInt; row<rowEnd; row++){
            for (int cell=rowIntTwo; cell<rowEndTwo; cell++){
                flagcze[row][cell]=Main.COLOR_RED;
            }
        }

        rowEnd=(int)(height*0.5);
        rowInt=height*0;
        rowIntTwo=0;
        rowEndTwo=0;
        for (int row=rowInt; row<rowEnd; row++){
            rowEndTwo++;
            for (int cell=rowIntTwo; cell<rowEndTwo; cell++){
                flagcze[row][cell]=Main.COLOR_BLUE;
                flagcze[height-1-row][cell]=Main.COLOR_BLUE;
            }
        }


        return flagcze;
    }

        public static int[][] createPolFlag(int height, int width) {
            int[][] flagpol = new int[height][width];
            int rowInt = 0;
            int rowEnd = 0;
            rowEnd = (int) (height * 0.5);
            for (int row = 0; row < rowEnd; row++) {
                for (int cell = 0; cell < flagpol[row].length; cell++) {
                    flagpol[row][cell] = Main.COLOR_WHITE;
                }
            }

            rowInt = (int) (height * 0.5);
            rowEnd = (int) (height);
            for (int row = rowInt; row < rowEnd; row++) {
                for (int cell = 0; cell < flagpol[row].length; cell++) {
                    flagpol[row][cell] = Main.COLOR_RED;
                }
            }
            return flagpol;
        }
    public static int[][] createChlFlag(int height, int width){
        int[][] flagchl=new int[height][width];
        int rowInt=0;
        int rowIntTwo=0;
        int rowEnd=0;
        int rowEndTwo=0;

        rowEnd=(int)(height*0.5);
        rowEndTwo=(int)(width*0.35);
        for (int row=rowInt; row<rowEnd; row++){
            for (int cell=rowIntTwo;cell<rowEndTwo;cell++){
                flagchl[row][cell]=Main.COLOR_BLUE;
            }
        }

        rowEnd=(int)(height*0.5);
        rowIntTwo=(int)(width*0.35);
        rowEndTwo=(width);
        for (int row=rowInt; row<rowEnd; row++){
            for (int cell=rowIntTwo;cell<rowEndTwo;cell++){
                flagchl[row][cell]=Main.COLOR_WHITE;
            }
        }

        rowInt=(int)(height*0.5);
        rowEnd=(int)(height);
        rowEndTwo=(width);
        for (int row=rowInt; row<rowEnd; row++){
            for (int cell=0;cell<rowEndTwo;cell++){
                flagchl[row][cell]=Main.COLOR_RED;
            }
        }

        return flagchl;
    }

    public static void  main(String[] args){

        int[][]flag=createUSFlag(12,20);
        int[][]flagnor=createNorFlag(22,40);
        int[][]flagFin=createFinFlag(24,40);
        int[][]flagDNK=createDNKFlag(24,40);
        int[][]  flagPM=createPMFlag(24,40); ///
        int[][]flagCOL=createCOLFlag(24,40);  //----
        int[][] flagche={};
        int[][] flagkwt={};
        int[][] flagcze={};
        int[][] flagpol={};
        int[][] flagchl={};
        flagchl=createChlFlag(24,40);
        JOptionPaneArrays.showColorArray2D(null,flagchl);
        flagpol=createPolFlag(24,40);
        JOptionPaneArrays.showColorArray2D(null,flagpol);
        flagcze=createCzeFlag(24,40);
        JOptionPaneArrays.showColorArray2D(null,flagcze);
        flagkwt=createKWTFLAG(24, 40);
        JOptionPaneArrays.showColorArray2D(null,flagkwt);
        flagche=createCheFlag(24, 40);
        int[][]flagVenz=createVenzFlag(24,40); //----
        int [][] flagZaf = createZAFFLAG(24,40);
        JOptionPaneArrays.showColorArray2D(null,flagZaf); ///
        JOptionPaneArrays.showColorArray2D(null,flagche);

        JOptionPaneArrays.showColorArray2D(null,flag);
        JOptionPaneArrays.showColorArray2D(null,flagPM);///
        JOptionPaneArrays.showColorArray2D(null,flagDNK); ///
        JOptionPaneArrays.showColorArray2D(null,flagFin);////
        JOptionPaneArrays.showColorArray2D(null,flagCOL);///
        JOptionPaneArrays.showColorArray2D(null,flagVenz);///
        JOptionPaneArrays.showColorArray2D(null,flagnor); ///

}}