public class ArmstrongNumberProgram {

    public static void main(String args[]){

        int number = 1;

        while(number<=2000){

            int n = number;
            int m = number;
            int x,y;
            int sum =0;

            int count=0;

            while(n!=0){
                n=n/10;
                count++;
            }

            for(int i =0; i<count; i++){

                x=m%10;
                y = (int) Math.pow(x,count);
                sum = sum + y;
                m=m/10;

            }
            if(sum == number){
                System.out.print(number + " ");
            }
            number++;
        }
    }
}
