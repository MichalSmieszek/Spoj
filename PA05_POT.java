import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main   {
    public static void main (String[] args)  throws java.lang.Exception{
        Scanner scanner = new Scanner(System.in);
        int numberOfTrials=Integer.parseInt(scanner.nextLine());
        for (int i=1;i<=numberOfTrials;i++) {
            String line=scanner.nextLine();
            int number = (int)Long.parseLong(line.split(" ")[0])%10;
            long exponent= Long.parseLong(line.split(" ")[1]);
            int result = number;
            List<Integer> listOfModulo10Results =  new LinkedList<>();
            listOfModulo10Results.add(number);
            while (!listOfModulo10Results.contains((number*result)%10)) {
                    //or even easier while((number*result)%10!=number), but spoj accepted, so I don't want to change this
                    result = (number * result) % 10;
                    listOfModulo10Results.add(result);
            }
            /*
            Notice that we need permute our list, adding on 0th position in our list last element from the list,
            to use modulo function.
            */
            listOfModulo10Results.add(0,listOfModulo10Results.get(listOfModulo10Results.size()-1));
            listOfModulo10Results.remove(listOfModulo10Results.size()-1);
            System.out.println(listOfModulo10Results.get((int)exponent%(listOfModulo10Results.size())));
            //System.out.print(listOfModulo10Results);
        }

    }
}
