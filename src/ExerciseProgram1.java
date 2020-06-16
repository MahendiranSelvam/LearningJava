public class ExerciseProgram1 {

    public static void main(String args[]) {

        String S = "asdf1qwe9as8d7";

        int length = S.length();
        int count = 0;

        for(int i = 0; i<length; i++){

            if(S.charAt(i) >= '0' && S.charAt(i) <= '9'){

                String S2 = String.valueOf(S.charAt(i));
                int number = Integer.parseInt(S2);
                count = count + number;
            }

        }

        System.out.println("Sum of numbers in the string:- " +count);

    }
}
