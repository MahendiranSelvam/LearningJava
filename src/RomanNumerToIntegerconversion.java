import java.util.Scanner;

public class RomanNumerToIntegerconversion {

    public static void main(String args[]){

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter any Roman number: ");
        String RomanNumber = obj.nextLine();

        int lengthofNumber = RomanNumber.length();
        int outputNum = 0;


            for(int i = lengthofNumber-1; i>=0; i--){

                if(RomanNumber.charAt(i) == 'I'){
                    outputNum = outputNum + 1;
                }


                if(RomanNumber.charAt(i) == 'V'){

                    if(i!=0){
                        if(RomanNumber.charAt(i-1) == 'I'){
                            outputNum = outputNum + 4;
                            i--;
                        }else{
                            outputNum = outputNum + 5;
                        }
                    } else{
                        outputNum = outputNum + 5;
                    }

                }


                if(RomanNumber.charAt(i) == 'X'){

                    if(i!=0){
                        if(RomanNumber.charAt(i-1) == 'I'){
                            outputNum = outputNum + 9;
                            i--;
                        }else{
                            outputNum = outputNum + 10;
                        }
                    } else{
                        outputNum = outputNum + 10;
                    }

                }


                if(RomanNumber.charAt(i) == 'L'){

                    if(i!=0){
                        if(RomanNumber.charAt(i-1) == 'X'){
                            outputNum = outputNum + 40;
                            i--;
                        }else{
                            outputNum = outputNum + 50;
                        }
                    } else{
                        outputNum = outputNum + 50;
                    }

                }


                if(RomanNumber.charAt(i) == 'C'){

                    if(i!=0){
                        if(RomanNumber.charAt(i-1) == 'X'){
                            outputNum = outputNum + 90;
                            i--;
                        }else{
                            outputNum = outputNum + 100;
                        }
                    } else{
                        outputNum = outputNum + 100;
                    }

                }


                if(RomanNumber.charAt(i) == 'D'){

                    if(i!=0){
                        if(RomanNumber.charAt(i-1) == 'C'){
                            outputNum = outputNum + 400;
                            i--;
                        }else{
                            outputNum = outputNum + 500;
                        }
                    } else{
                        outputNum = outputNum + 500;
                    }

                }


                if(RomanNumber.charAt(i) == 'M'){

                    if(i!=0){
                        if(RomanNumber.charAt(i-1) == 'C'){
                            outputNum = outputNum + 900;
                            i--;
                        }else{
                            outputNum = outputNum + 1000;
                        }
                    } else{
                        outputNum = outputNum + 1000;
                    }

                }


            }

        System.out.println("The corresponding integer is: "+outputNum);


    }
}
