numberOfCities=int(input(""))
maxValue=0
actuallyValue=0
for cityNumber in range(0,numberOfCities):
     value = int(input(""))
     actuallyValue=max(0,actuallyValue+value)
     if (actuallyValue>maxValue):
          maxValue=actuallyValue
print(maxValue)



'''
import java.util.Scanner;

public class FZI_STEF {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int numberOfCities = Integer.parseInt(scanner.nextLine());
        int maxValue=0;
        int actuallyValue=0;
        for(int cityNumber=1;cityNumber<numberOfCities;cityNumber++){
            int value=Integer.parseInt(scanner.nextLine());
            actuallyValue=Math.max(0,actuallyValue+value);
            if (actuallyValue>maxValue)
                maxValue=actuallyValue;
        }
        System.out.print(maxValue);
    }
}
'''