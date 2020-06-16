public class ReturnIndicesThirdway {



    public static void main(String args[]){

        int[] numberslist = {1,4,5,10,20};

        int[] indices = twoSum(numberslist,5);

        for(int i=0; i<indices.length;i++){
            System.out.println(indices[i]);
        }


    }

    public static int[] twoSum(int[] numbers, int target) {

        int sum = 0;
        int CountofNumbers = numbers.length;
        int indices[] = new int[2];

        for(int i =0; i<CountofNumbers; i++){

            int temp;
            temp = target - numbers[i];
            for(int j = i+1; j<numbers.length; j++){
                if (numbers[j] == temp){
                    indices[0] = i+1;
                    indices[1] = j+1;
                    break;
                }
                if(numbers[j] == temp){
                    break;
                }


            }

        }

        return indices;
    }
}
