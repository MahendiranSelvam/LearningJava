public class ExerciseProgram3 {

    public static void main(String args[]){

        String S = "1. It is Work from Home  not Work for Home";

        int length = S.length();

        int CountofNumbers = 0;
        int CountofSpaces = 0;
        int Countoflowercases = 0;
        int CountofUppercases = 0;

        for(int i = 0; i <length; i++){

            if(S.charAt(i) >= '0' && S.charAt(i) <= '9' ){

                CountofNumbers++;
            }

            if(S.charAt(i) == ' '){
                CountofSpaces++;
            }

            if(Character.isUpperCase(S.charAt(i))){

                CountofUppercases++;
            }

            if(Character.isLowerCase(S.charAt(i))){

                Countoflowercases++;
            }

        }

        System.out.println("Count of numbers: " + CountofNumbers);
        System.out.println("Count of spaces: " + CountofSpaces);
        System.out.println("Count of lower cases: " + Countoflowercases);
        System.out.println("Count of upper cases: " + CountofUppercases);

    }
}
