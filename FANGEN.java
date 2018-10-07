import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.abs;

class FANGEN {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        boolean notZero = true;
        while (notZero == true) {
            int size = Integer.parseInt(scanner.nextLine());
            if (size==0)
                notZero=false;
            else {
                String[][] WindmillArray = Windmill.doTriangles(size);
                for (int i = 0; i < 2 * abs(size); i++) {
                    for (int j = 0; j < 2 * abs(size); j++)
                        System.out.print(WindmillArray[i][j]);
                    System.out.println("");
                }
            }
        }
    }
}

class Windmill{

    public static String[][] doStars (int size){
        String[][] stars=new String[2*size][2*size];
        for(int i=0;i<2*size;i++)
            for(int j=0;j<2*size;j++)
                stars[i][j]="*";
        return stars;
    }

    public static String[][] doTriangles (int size){
        String [][] Windmill= doStars(abs(size));
        if (size<0)
            for(int i=0;i<abs(size);i++) {
                for (int j = 0; j < i; j++) {
                    Windmill[i][j] = ".";
                    Windmill[j][2 * abs(size) - i - 1] = ".";
                    Windmill[2 * abs(size) - j - 1][i] = ".";
                    Windmill[2 * abs(size) - i - 1][2 * abs(size) - j - 1] = ".";
                }
            }
        else
            for(int i=0;i<abs(size);i++) {
                for (int j = 0; j < i; j++) {
                        Windmill[j][i] = ".";
                        Windmill[i][2 * abs(size) - j - 1] = ".";
                        Windmill[2 * abs(size) - i - 1][j] = ".";
                        Windmill[2 * abs(size) - j - 1][2 * abs(size) - i - 1] = ".";
                    }
                }

            return Windmill;
    }
}

