import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesfromList {

    public static void main(String args[]){

        List<Character> charList = new ArrayList<Character>(Arrays.asList('A','B','C','D','A','D','E','F'));

        for(int i = 0; i<charList.size(); i++){

            for(int j = i+1; j<charList.size(); j++){
                if(charList.get(i) == charList.get(j)){
                    charList.remove(j);
                }
            }
        }

        System.out.println(charList);

    }
}

