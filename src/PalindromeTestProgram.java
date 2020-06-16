import java.util.Scanner;

public class PalindromeTestProgram {

    public static void main(String args[]) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the value: ");
        String enteredNumber = obj.nextLine();
        boolean PalindromeResult;

            PalindromeResult = PalindromTestMethod(enteredNumber);


        if (PalindromeResult == true){
            System.out.println("TRUE:- The entered value is palindrome");
        }
        else if (PalindromeResult == false){
            System.out.println("FALSE:- The entered value is NOT palindrome");
        }

    }

    public static boolean PalindromTestMethod(String TestValue) {

        int PalindromeFlag = 0;

        int lengthofNumber = TestValue.length();

        for (int i = 0, j = lengthofNumber - 1; i <= lengthofNumber / 2 && j >= lengthofNumber / 2; i++, j--) {

            if (TestValue.charAt(i) == TestValue.charAt(j)) {
                PalindromeFlag = 1;
            } else {
                PalindromeFlag = 0;
                break;
            }
        }

        if (PalindromeFlag == 1) {
            return true;
        } else
            return false;

    }

}
