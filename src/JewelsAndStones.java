public class JewelsAndStones {

    public static void main(String args[]){

        int NumberofJewels;
        NumberofJewels = numJewelsInStones("z","ZzzZ");
        System.out.println(NumberofJewels);

    }

    public static int numJewelsInStones(String J, String S) {
        
        int count = 0;

        for(int i=0;i<S.length();i++){

            for(int k=0;k<J.length();k++){

                if(S.charAt(i) == J.charAt(k)){
                    count++;
                    break;
                }
            }

        }

        return count;

    }
}
