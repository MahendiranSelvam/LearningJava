import java.util.Scanner;

public class ReturnIndicesSECONDway {

    public static void main(String args[]){

        int[] numberslist = {1,4,5,10,20};

        int[] indices = twoSum(numberslist,21);

        for(int i=0; i<indices.length;i++){
            System.out.println(indices[i]);
        }


    }

    public static int[] twoSum(int[] numbers, int target) {

        int sum = 0;
        int CountofNumbers = numbers.length;
        int indices[] = new int[2];

        for(int i =0; i<CountofNumbers; i++){

            for(int j = i+1; j<CountofNumbers;j++){
                sum = numbers[i];
                sum = sum + numbers[j];

                if(sum == target){
                    indices[0] = i+1;
                    indices[1] = j+1;
                    break;
                }
            }

            if(sum == target){
                break;
            }
        }

        return indices;
    }
}
