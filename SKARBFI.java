import java.util.Scanner;
import java.lang.Math;
public class SKARBFI {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int numberOfTrials = Integer.parseInt(scanner.nextLine());
        for (int i=1;i<=numberOfTrials;i++) {
            int numberOfValues = Integer.parseInt(scanner.nextLine());
            int[] directionAndStepArray=new int[2];
            directionAndStepArray[0]=0;
            directionAndStepArray[1]=0;
            for(int value=1;value<=numberOfValues;value++){
                String line=scanner.nextLine();
                int direction = Integer.parseInt(line.split(" ")[0]);
                int steps = Integer.parseInt(line.split(" ")[1]);
                directionAndStepArray[(direction/2)]+=Math.pow(-1,(direction+1)%2)*steps;
            }
            if (directionAndStepArray[0]==0 && directionAndStepArray[1]==0)
                System.out.println("studnia") ;
            if (directionAndStepArray[0]!=0)
                System.out.println((int)(Math.signum((double)directionAndStepArray[0])+1)/2 + " " +Math.abs(directionAndStepArray[0])) ;
            if (directionAndStepArray[1]!=0)
                System.out.println((int)(Math.signum((double)directionAndStepArray[1])+1)/2+2 + " " +Math.abs(directionAndStepArray[1])) ;
        }
    }
}