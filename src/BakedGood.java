import javax.lang.model.util.Types;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

class Bakery {
    //Each baked good has a name, price, an expiration date,
    // one or more diet restrictions (ie. gluten allergies), and quantity in stock.
    private String name;
    private double price;
    java.util.Date expirationDate;
//    private String []restriction;
    public ArrayList<String> restrictions;
    private int quantityInStock;

    public Bakery(String name, double price, Date expirationDate,int quantityInStock) {
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
        this.quantityInStock = quantityInStock;
        this.restrictions = new ArrayList<String>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

//    public String[] getRestriction() {
//        return restriction;
//    }

//    public void setRestriction(String[] restriction) {
//        for (int i = 0; i <restriction.length ; i++) {
//
//
//        this.restriction = restriction;
//    }}

    public ArrayList<String> getRestrictions() {
        return restrictions;
    }

    public void setRestrictions(String restr) {
        restrictions.add(restr);
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    @Override
    public String toString() {
        return
                name + '\'' +
                ", price=" + price +
                ", expirationDate=" + expirationDate +
                ", restriction=" + restrictions +
                ", quantityInStock=" + quantityInStock;
    }
}
