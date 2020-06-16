public class ReturnIndicesFOURTHway {


    public static void main(String args[]){

        int[] numberslist = {1,4,5,10,20};

        int[] indices = twoSum(numberslist,25);

        for(int i=0; i<indices.length;i++){
            System.out.println(indices[i]);
        }


    }

    public static int[] twoSum(int[] numbers, int target) {

        int sum = 0;
        int CountofNumbers = numbers.length;
        int indices[] = new int[2];

        if(target <= numbers[CountofNumbers/2]){
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

        else{

            for(int i =CountofNumbers-1 ; i>=0; i--){

                for(int j = i-1; j>=0;j--){
                    sum = numbers[i];
                    sum = sum + numbers[j];

                    if(sum == target){
                        indices[0] = j+1;
                        indices[1] = i+1;
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
}
