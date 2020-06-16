public class UserNameValidation {

    public static void main(String args[]) {

        String UserName = "Test0$ghgh01";
        boolean Result = IsUserNameValid(UserName);

        System.out.println(Result);

    }

    public static boolean IsUserNameValid(String UserName) {

        int flag = 1;

        if (UserName.length() < 8) {
            flag = 0;
        }

        if (UserName.contains("~") || UserName.contains("`") || UserName.contains("!")
                || UserName.contains("#") || UserName.contains("%") || UserName.contains("^") || UserName.contains("&")
                || UserName.contains("*") || UserName.contains("(") || UserName.contains(")") || UserName.contains("-")
                || UserName.contains("+") || UserName.contains("=") || UserName.contains("{") || UserName.contains("}")
                || UserName.contains("[") || UserName.contains("]") || UserName.contains("|") || UserName.contains(":")
                || UserName.contains(";") || UserName.contains("'") || UserName.contains("<") || UserName.contains(",")
                || UserName.contains(">") || UserName.contains("?") || UserName.contains("/") || UserName.contains(" ")) {

            flag = 0;
        }

        if(flag == 0){

            return false;

        } else{
            return true;
        }



    }

}





