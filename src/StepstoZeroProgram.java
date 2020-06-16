import java.util.Scanner;

public class StepstoZeroProgram {

    public static void main(String args[]){

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter any non negative number: ");
        int enteredNumber = obj.nextInt();

        int Count = 0;

        if(enteredNumber == 0)  {
            System.out.println("Entered number is already zero");
        } else{
            do{

                if(enteredNumber%2 == 0){
                    enteredNumber = enteredNumber/2;
                    Count++;
                }else{
                    enteredNumber = enteredNumber-1;
                    Count++;
                }

            }while(enteredNumber!= 0);

        }

        System.out.println("Number of steps required to make the number ZERO is: " +Count);

    }
}
