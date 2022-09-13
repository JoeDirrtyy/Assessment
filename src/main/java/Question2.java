public class Question2 {
//Referenced from Question 4 homework
 // Referenced from https://stackoverflow.com/questions/40222495/using-all-elements-in-an-array-except-for-one

    public static char getLetterY(char[] alphabet){
       boolean $ = false;
        for (char y = 1; y < alphabet.length; y++){
        if (alphabet[y] == 0){
            $ = true;
        }
        }
        return 0;
    }

    public static void main(String[] args) {
        char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','$','Z'};
        System.out.println(alphabet);
    }
}
