public class Question3 {
    // referenced from https://www.javatpoint.com/how-to-print-array-in-java
    // referenced from https://stackoverflow.com/questions/30734252/how-do-you-print-certain-number-in-an-array

    public static void main(String[] args) {
        int[] array = {20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1,0};
        int x = 0;
        while (x < 11) {
            if (array[x] != 9) {
                System.out.println(array[x]);
            }
            x++;
        }
    }
}