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
        //String[] restriction = {"No peanut", "No gluten", "No soy", "No dairy"};
        String[] restriction = {"peanut", "gluten", "soy", "dairy"};

        //product1.setRestriction(Dietrestriction);
       // product1.setRestriction(restriction);
        product2.setRestriction(restriction);
        product3.setRestriction(restriction);
        product4.setRestriction(restriction);
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
            System.out.println("These are products free of "+ input);
            for (int i = 0; i < bakeries.size(); i++) {
                String[] restr = bakeries.get(i).getRestriction();
                if(restrictionChecker(restr, input)){
                    System.out.println(bakeries.get(i));
                }

            }


        }
    }

    public static boolean restrictionChecker(String[] arr, String input) {
        for (int i = 0; i < arr.length; i++) {
            if (input.equalsIgnoreCase(arr[i]))
                return false;
        }
        return true;
    }

}
