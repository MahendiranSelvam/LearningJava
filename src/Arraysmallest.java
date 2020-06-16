public class Arraysmallest {

    public static void main(String args[]){

        int TestArray[] = new int[]{12,45,1,89,4,90};
        
           int minNum = 0;
            
           for(int i = 0; i< TestArray.length;i++){

               minNum = TestArray[i];
               for(int j = 1; j< TestArray.length; j++){
                   if(TestArray[j] < minNum){
                       minNum = TestArray[j];
                   }
               }

           }
        
        System.out.println(minNum);
    }
}
