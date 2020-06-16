import java.util.Scanner;

public class ReturnIndicesProgram {

    public static void main(String args[]){

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the count of Numbers: ");
        int CountofNumbers = obj.nextInt();

        int NumbersArray[] = new int[CountofNumbers];

        System.out.print("Enter the numbers: ");

        for(int i =0; i<CountofNumbers; i++){
            NumbersArray[i] = obj.nextInt();
        }

        System.out.print("Enter the Target Number: ");
        int TargetNumber = obj.nextInt();

        int sum = 0;

        for(int i =0; i<CountofNumbers; i++){

            for(int j = CountofNumbers-1; j>=0; j--){

                sum = NumbersArray[i] + NumbersArray[j];
                if (sum == TargetNumber){
                    System.out.println("The indices are: ["+i +"," + j + "]");
                    System.out.println("The corresponding numbers at these indices are: "
                            +NumbersArray[i] + "," + NumbersArray[j]);
                    break;
                }

            }
            if(sum == TargetNumber){
                break;
            }

         }

    }

}
