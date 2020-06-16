import java.util.Scanner;

public class IPAddressConvertSECONDway {

    public static void main(String args[]){

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the value: ");
        String enteredData = obj.nextLine();

        String S1 = null;
        String S2 = "";

        //System.out.println(enteredData);

        for(int i=0; i<enteredData.length(); i++){
            if(enteredData.charAt(i) == '.'){
                S1 = enteredData.substring(0,i);
                //System.out.print(S1);
                //System.out.print("[.]");
                S2 = S2.concat(S1);
                S2 = S2.concat("[.]");
               //System.out.print(S1);

                enteredData = enteredData.substring(i+1,enteredData.length());
                i = 0;
            }
        }
        //System.out.println(S2);
        S2 = S2.concat(enteredData);

        System.out.println(S2);

    }
}
