public class Question1 {

    public static String getReciept(String product, int qty, double price, int miles) {
        System.out.println("+++++++++++++++++++++++++++");
        System.out.println("distance = fee");
        System.out.println("+++++++++++++++++++++++++++");
        System.out.println("0  -  4 miles = $2");
        System.out.println("5  -  15 miles = $5");
        System.out.println("16  -  25 miles = $10");
        System.out.println("26  -  50 miles = $15");
        System.out.println("More than 50 miles = $20");
        System.out.println("+++++++++++++++++++++++++++");
        double total = price * qty;
        if (miles <= 4) {
            total = total + 2;
        }
        if (miles >= 5 && miles <= 15) {
            total = total + 5;
        }
        if (miles >= 16 && miles <= 25) {
            total = total + 10;
        }
        if (miles >= 26 && miles <= 50){
            total = total + 15;
        }else{
            total = total + 20;}
        System.out.println("Product: " + product + "\n" + "Qty: " + qty + "\n" + "Price: $" + price + "\n" + "Miles: " + miles);
        System.out.println("====================");
        return "total: $" + total;

    }

    public static void main(String[] args) {
        System.out.println(getReciept("rice", 20, 5.0, 10 ));
        System.out.println(getReciept("beans", 10, 2.0, 30 ));
        System.out.println(getReciept("cake", 200, 5.75, 278) );


    }
}
