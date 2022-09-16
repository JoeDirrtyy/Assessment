public class Sub {

    public static String getReceipt(String product, int qty, double price, int miles) {
        double total = price * qty;
       double fee;
        if (miles < 4) {
            fee = 2.0;
        }
        else if (miles >= 5 && miles <= 15) {
            fee =  5;
        }
        else if (miles >= 16 && miles <= 25) {
             fee = 10;
        }
       else if (miles >= 26 && miles <= 50){
             fee = 15;
        }else{
            fee =  20;}
        total = total + fee;



        String s = String.format("Product  Qty  Price  Miles  Total \n ----    ---  -----  ----  -----  \n %s   %d    %.2f   %d   %.2f ", product, qty, price, miles, total);
        //System.out.printf(s);
        //System.out.printf("Product: " + product + "\n" + "Qty: " + qty + "\n" + "Price: $" + price + "\n" + "Miles: " + miles);
        return s;
    }

        public static void main (String[]args){
            System.out.println(getReceipt("rice", 20, 5.0,  10));
            System.out.println("     Thank you, come again!");



            //  String str = new String("Yearup Wilmington");
            //System.out.println(str.substring(3));
            // System.out.println(str.substring(4,11));
            //  String firstName = new String("Christopher");
            // System.out.println(firstName.substring(0,5));
            // System.out.println(firstName.substring(4,8));
            // System.out.println(firstName.substring(7,11));
            // System.out.println(firstName.substring(4,8));

            //int qty = 20;
            // double price = 5.0;
            //  double fee = 5.0;
            // double miles = 10.0;
            //   double total = qty * price + fee;

           // String s = String.format("Product  Qty  Price  Fee  Miles  Total \n ----    ---  -----  ---  -----  -----\n Rice    %,d   %,.2f  %,.2f  %,.2f %, .2f", qty, price, fee, miles, total);
            // System.out.println(s);
            //   System.out.printf("\n      Thank you come again");
        }
    }


