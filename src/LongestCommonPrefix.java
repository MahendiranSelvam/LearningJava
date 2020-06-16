public class LongestCommonPrefix {

    public static void main(String args[]){

        String[] strs = new String[]{"dogj","dogj", "dogji"};

         String commonprefix = longestCommonPrefix(strs);
         System.out.println(commonprefix);

    }

    public static String longestCommonPrefix(String[] strs) {
        String Tempstring = "";
        int minlength = 0;

        if(strs.length != 0){
            minlength = strs[0].length();

            for (int i = 1; i < strs.length; i++) {
                if (strs[i].length() < minlength) {
                    minlength = strs[i].length();
                }
            }

        }

        for (int i = 0; i < minlength; i++) {

                char c = strs[0].charAt(i);

                int count = 0;

                for (int k = 1; k < strs.length ; k++) {
                    if (strs[k].charAt(i) == c) {
                        count++;

                    } else {
                        break;
                    }
                }


                if (count == strs.length - 1) {
                   Tempstring = Tempstring + c;
                }
                else{
                    break;
                }


        }
        return Tempstring;

    }
}
