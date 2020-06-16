import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RetriveValuefromSet {

    public static void main(String args[]){

        Set<Integer> NumberSet = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        int Value;

        Iterator it = NumberSet.iterator();

        while(it.hasNext()){

            Value = (Integer)it.next();

            if(Value == 7){
                System.out.println(Value);
            }

        }


    }
}
