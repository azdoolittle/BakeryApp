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
        date.getTime();
        String input;
        ArrayList<Bakery> bakeries = new ArrayList<>();
        ArrayList<Bakery> nonRestr = new ArrayList<>();
        ArrayList<Bakery> removeList = new ArrayList<>();

        Bakery product1 = new Bakery("Banana Bread", 5.95, date, 23);
        Bakery product2 = new Bakery("Cinnamon Bread", 10.95, date, 1);
        Bakery product3 = new Bakery("Sour Bears", 4.95, date, 0);
        Bakery product4 = new Bakery("Mint Brownie", 4.95, date, 15);
        Bakery product5 = new Bakery("Soft Crust Pizza", 4.95, date, 11);
        Bakery product6 = new Bakery("Savory Rolls", 1.95, date, 11);
        Bakery product7 = new Bakery("Blueberry Muffins", 4.95, date, 11);
        Bakery product8 = new Bakery("Beef Empanadas", 0.95, date, 16);
        Bakery product9 = new Bakery("Hamburger Buns", 4.95, date, 11);
        Bakery product10 = new Bakery("Bread Pudding", 6.95, date, 11);
        Bakery product11 = new Bakery("Chocolate Donuts", 4.95, date, 41);
        Bakery product12 = new Bakery("Kaiser Rolls", 4.95, date, 23);
        Bakery product13 = new Bakery("Sourdough", 2.95, date, 11);
        Bakery product14 = new Bakery("Baguette", 1.95, date, 11);
        Bakery product15 = new Bakery("Sugar Cookies", 4.95, date, 11);
        bakeries.add(product1);
        bakeries.add(product2);
        bakeries.add(product3);
        bakeries.add(product4);
        bakeries.add(product5);
        bakeries.add(product6);
        bakeries.add(product7);
        bakeries.add(product8);
        bakeries.add(product9);
        bakeries.add(product10);
        bakeries.add(product11);
        bakeries.add(product12);
        bakeries.add(product13);
        bakeries.add(product14);
        bakeries.add(product15);
        product1.setRestrictions("peanuts");
        product2.setRestrictions("dairy");
        product2.setRestrictions("soy");
        product3.setRestrictions("soy");
        product3.setRestrictions("dairy");
        product3.setRestrictions("peanuts");
        product3.setRestrictions("gluten");
        product4.setRestrictions("gluten");
        product5.setRestrictions("none");
        product6.setRestrictions("dairy");
        product7.setRestrictions("soy");
        product8.setRestrictions("dairy");
        product8.setRestrictions("soy");
        product9.setRestrictions("peanuts");
        product10.setRestrictions("peanuts");
        product11.setRestrictions("none");
        product12.setRestrictions("gluten");
        product12.setRestrictions("peanuts");
        product12.setRestrictions("soy");
        product12.setRestrictions("dairy");
        product13.setRestrictions("gluten");
        product14.setRestrictions("none");
        product15.setRestrictions("dairy");
        // clone after filling bakeries
        nonRestr = (ArrayList<Bakery>) bakeries.clone();

        System.out.println("Welcome to the Tmc's Better Bakery App! ");
        System.out.println("We contain peanut, gluten, soy and dairy in our products. ");

        System.out.println("To search for foods that you can eat, please enter the name of the diet restriction:");
        System.out.println("To see a list of all our foods, please type \"all\".   \n");
        input = scanner.nextLine();

        // list all products
        if (input.equalsIgnoreCase("All")) {
            System.out.println("Here is all our products ");
            int i = 1;
            for (Bakery product : bakeries) {
                System.out.printf("%d) %s \n", i++, product);
            }
        } else {
            // get restrictions, add to restriction list
            String cont = "y";
            for (Bakery product : nonRestr) {
                if (product.restrictions.contains(input)) {
                    // add to remove list
                    removeList.add(product);
                }
            }

            // remove restricted products from non restricted list
            for (Bakery product : removeList) {
                if (nonRestr.contains(product)) {
                    nonRestr.remove(product);
                }
            }

            System.out.println("Do you want to add another restriction? (y/n)");
            cont = scanner.nextLine();

            // keep asking to add restrictions until no
            while (!cont.equalsIgnoreCase("n")) {
                System.out.println("Enter your diet restriction.");
                input = scanner.nextLine();

                // add restricted products to restricted list
                for (Bakery product : nonRestr) {
                    if (product.restrictions.contains(input)) {
                        removeList.add(product);
                    }
                }

                // remove restricted products from non restricted list
                for (Bakery product : removeList) {
                    if (nonRestr.contains(product)) {
                        nonRestr.remove(product);
                    }
                }

                System.out.println("Do you want to add another restriction? (y/n)");
                cont = scanner.nextLine();
            }

            // finally, print list of non restricted products
            for (Bakery product : nonRestr) {
                System.out.println(product);
            }
        }
    }
}

