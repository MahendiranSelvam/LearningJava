import java.util.ArrayList;
import java.util.List;

public class DuplicatesUsingCollections {

    public static void main(String args[]){

        String S = "When life gives you lemons, make lemonade";

        List<Character> CharList = new ArrayList<Character>();
        List<Character> DuplicateCharacters = new ArrayList<Character>();

        int CountofOccurence;

        for(int i = 0; i < S.length(); i++){

            CharList.add(S.charAt(i));
        }

        for(int i =0; i< CharList.size(); i++){

            int count = 0;

            for(int j = i+1; j<CharList.size(); j++){

                if(CharList.get(i).equals(CharList.get(j))){
                    count++;

                }

            }

            CountofOccurence = count + 1;


            if(count>0 && !DuplicateCharacters.contains(CharList.get(i))) {

                if(CharList.get(i) == ' '){

                    System.out.println("Space character ' ' is displayed multiple times in the string. Count of occurence is " + CountofOccurence );

                }
                else{

                    System.out.println(CharList.get(i) + " is displayed multiple times in the string. Count of occurence is " + CountofOccurence );

                }

                DuplicateCharacters.add(CharList.get((i)));

            }
        }


    }

}
