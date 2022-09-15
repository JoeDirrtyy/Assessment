public class Question2 {
//Referenced from Question 4 homework
 // Referenced from https://stackoverflow.com/questions/40222495/using-all-elements-in-an-array-except-for-one

    public static void getLetters(String[] alphabet) {
        String value = "";
        for (int x = 0; x < alphabet.length; x++) {
            //if (alphabet[x] == "Y"){
            //System.out.println(alphabet[x]); ;
            // }
            if (!alphabet[x].equals("Y")){
                value = alphabet[x];
                System.out.println(value);
            }
        }
    }

    public static void main(String[] args) {
        String[] alphabet = {"$","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        getLetters(alphabet);
    }
}
