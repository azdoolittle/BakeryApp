import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class BakerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Welcome to the Brookley's Better Bakery App!
        //We contain peanut, gluten, soy and dairy in our products.
        //
        //To search for foods that you can eat, please enter the name of the diet restriction:
        //To see a list of all our foods, please type "all".
        Date date = new Date();
        date.setTime(12 / 2 / 2020);
        String input;
        ArrayList<Bakery> bakeries = new ArrayList<>();
        Bakery product1 = new Bakery("Banana Bread", 5.95, date, 23);
        Bakery product2 = new Bakery("Cinnamon Bread", 10.95, date, 1);
        Bakery product3 = new Bakery("Sour Bears", 4.95, date, 0);
        Bakery product4 = new Bakery("Mint Brownie", 4.95, date, 11);
        bakeries.add(product1);
        bakeries.add(product2);
        bakeries.add(product3);
        bakeries.add(product4);
        product1.setRestrictions("peanuts");
        // product1.setRestriction(restriction);
        product2.setRestrictions("dairy");
        product2.setRestrictions("soy");
        product3.setRestrictions("soy");
        product3.setRestrictions("dairy");
        product3.setRestrictions("peanuts");
        product3.setRestrictions("gluten");
        product4.setRestrictions("none");
        System.out.println(bakeries.get(0));

        System.out.println("Welcome to the Tmc's Better Bakery App! ");
        System.out.println("We contain peanut, gluten, soy and dairy in our products. ");
        System.out.println("To search for foods that you can eat, please enter the name of the diet restriction:");
        System.out.println("To see a list of all our foods, please type \"all\".   \n");
        input = scanner.nextLine();

        if (input.equalsIgnoreCase("All")) {
            System.out.println("Here is all our products ");
            for (Bakery product : bakeries) {
                System.out.println(product + " ");
            }
        } else {
            System.out.println("These are products free of " + input);
            for (Bakery product : bakeries) {
                if (!product.restrictions.contains(input)) {
                    System.out.println(product);
                }
//            for (int i = 0; i < bakeries.size(); i++) {
//                String[] restr = bakeries.get(i).getRestrictions();
//                if(restrictionChecker(restr, input)){
//                    System.out.println(bakeries.get(i));
//                }
//            }
            }
        }
    }
}

//    public static boolean restrictionChecker(String[] arr, String input) {
//        for (int i = 0; i < arr.length; i++) {
//            if (input.equalsIgnoreCase(arr[i]))
//                return false;
//        }
//        return true;
//    }
//
//    private HashMap<String, ArrayList<String>> restrictions = new HashMap<>();
//
//    BananaBread
//        price = 5.99;
//        qtyInStock = 13
//        restrictions = {"soy", "dairy"};
//
//    CinnamonBread
//        price = 5.99;
//        qtyInStock = 13
//        restrictions = {"dairy"};
//
//    ChocolateChipCookie
//        price = 5.99;
//        qtyInStock = 13
//        restrictions = {"cookie"};
//    Brownie
//        price = 5.99;
//        qtyInStock = 13
//        restrictions = {"none"};
//
//    for (ArrayList product : bakeries) {
//        if (!product.contains("peanut")) {
//            System.out.println(product);
//        }
