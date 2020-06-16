import java.util.ArrayList;

public class ExerciseProgram2 {

    public static void main(String args[]) {

        String S = "When the world realise its own mistake, corona will dissolve automatically";

        String[] words = S.split(" ");

        for(int i = 0; i<words.length; i++){

            if((i == 1) || (i%2 == 1)){

                char[] chararay = words[i].toCharArray();

                String S2 = "";

                for(int j=chararay.length-1; j>=0; j--){
                    S2 = S2.concat(String.valueOf(chararay[j]));
                }

                words[i] = S2;

            }

        }

        for(int i = 0; i<words.length; i++){
            System.out.print(words[i] + " ");
        }


    }
}
