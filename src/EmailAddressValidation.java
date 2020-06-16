import java.util.Scanner;

public class EmailAddressValidation {

    public static void main(String args[]) {

        String EmailAddress = "mmm";

        boolean Result = isEmailAddressValid(EmailAddress);

        System.out.println(Result);

    }

    public static boolean isEmailAddressValid(String EmailAddress) {

        int countofATsymbol = 0;
        int countofDOT = 0;
        int flag = 1;

        for (int i = 0; i < EmailAddress.length(); i++) {

            if (EmailAddress.charAt(i) == '@') {
                countofATsymbol++;
            }

        }

        if (countofATsymbol == 1) {

            String[] SubStringsofEmailAddress = EmailAddress.split("[@]");

            String IDpart = SubStringsofEmailAddress[0];
            String Domainpart = SubStringsofEmailAddress[1];


            if (IDpart.contains("~") || IDpart.contains("`") || IDpart.contains("!")
                    || IDpart.contains("@") || IDpart.contains("#") || IDpart.contains("$") || IDpart.contains("%")
                    || IDpart.contains("^") || IDpart.contains("&") || IDpart.contains("*") || IDpart.contains("(")
                    || IDpart.contains(")") || IDpart.contains("-") || IDpart.contains("+") || IDpart.contains("=")
                    || IDpart.contains("{") || IDpart.contains("}") || IDpart.contains("[") || IDpart.contains("]")
                    || IDpart.contains("|") || IDpart.contains(":") || IDpart.contains(";") || IDpart.contains("'")
                    || IDpart.contains("<") || IDpart.contains(",") || IDpart.contains(">") || IDpart.contains("?")
                    || IDpart.contains("/") || IDpart.contains(" ")) {

                flag = 0;

            }


            if (Domainpart.contains(".")) {

                String[] Domainsubparts = Domainpart.split("[.]");

                String DomainName = Domainsubparts[0];

                if (DomainName.contains("~") || DomainName.contains("`") || DomainName.contains("!")
                        || DomainName.contains("@") || DomainName.contains("#") || DomainName.contains("$") || DomainName.contains("%")
                        || DomainName.contains("^") || DomainName.contains("&") || DomainName.contains("*") || DomainName.contains("(")
                        || DomainName.contains(")") || DomainName.contains("-") || DomainName.contains("+") || DomainName.contains("=")
                        || DomainName.contains("{") || DomainName.contains("}") || DomainName.contains("[") || DomainName.contains("]")
                        || DomainName.contains("|") || DomainName.contains(":") || DomainName.contains(";") || DomainName.contains("'")
                        || DomainName.contains("<") || DomainName.contains(",") || DomainName.contains(">") || DomainName.contains("?")
                        || DomainName.contains("/") || DomainName.contains(" ")) {


                    flag = 0;
                }


                for (int i = 0; i < Domainpart.length(); i++) {
                    if (Domainpart.charAt(i) == '.') {
                        countofDOT++;
                    }
                }


                if (countofDOT == 1) {

                    if ((!Domainsubparts[1].equals("com")) && (!Domainsubparts[1].equals("org"))) {

                        flag = 0;
                    }

                }

                if (countofDOT == 2) {

                    if (Domainsubparts[1].equals("co")) {
                        if ((!Domainsubparts[2].equals("in")) || (!Domainsubparts[2].equals("uk"))) {

                            flag = 0;
                        }

                    }

                    if (countofDOT > 2) {

                        flag = 0;
                    }

                }

                else if ((countofDOT < 1) || (countofDOT > 2) ){

                    flag = 0;
                }


       }

        } else if (countofATsymbol != 1) {
            flag = 0;
        }


            if (flag == 1) {
                return true;
            } else {
                return false;
            }

        }

    }




