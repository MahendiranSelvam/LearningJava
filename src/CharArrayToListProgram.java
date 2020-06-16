import java.util.ArrayList;
import java.util.List;

public class CharArrayToListProgram {

    public static void main(String args[]){

        Character[] charArray = {'B','u','g','a','t','t','i',' ','C','h','i','r','o','n'};

        List<Character> charList = new ArrayList<Character>();

        for(int i = 0; i<charArray.length; i++){
            charList.add(charArray[i]);
        }

        for(int i =0; i<charList.size(); i++){
            System.out.print(charList.get(i));
        }


    }

}
