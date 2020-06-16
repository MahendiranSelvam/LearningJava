import java.util.Scanner;

public class IPAddressconvertProgram {

    public static void main(String args[]){

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the value: ");
        String enteredData = obj.nextLine();

        System.out.println(enteredData);

        for(int i=0; i<enteredData.length(); i++){
            if(enteredData.charAt(i) == '.'){
                String S1 = enteredData.substring(0,i);
                System.out.print(S1);
                System.out.print("[.]");

                enteredData = enteredData.substring(i+1,enteredData.length());
                i = 0;
            }
        }

       System.out.print(enteredData);

    }
}
