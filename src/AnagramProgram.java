public class AnagramProgram {

    public static void main (String args[]){

        String[] stringarray = {"listen", "act", "silent", "iceman", "cat", "Top", "engine","cinema"};
        String[] Anagrams = new String[stringarray.length];

        int countofwords = stringarray.length;


        for(int i =0; i < countofwords; i++){
            String temp = stringarray[i];

            for(int j = i+1; j<countofwords; j++){

                if(temp.length() == stringarray[j].length()){

                    char[] chararray = stringarray[j].toCharArray();

                    int count = 0;

                    for(int k =0; k<temp.length(); k++){
                        for(int m =0; m<chararray.length;m++){
                            if(temp.charAt(k) == chararray[m]){
                                count++;
                            }
                        }


                        if(count == temp.length()){
                            System.out.println(temp + ", " + stringarray[j] + " are Anagrams");
                        }
                    }


                }

                else{
                    continue;
                }


            }

        }

    }
}
