import java.rmi.StubNotFoundException;

import javax.sound.sampled.SourceDataLine;

/*Create a new class Food in the Java project SwiftFood with the details given below.
Test the functionalities using the Tester class.*/

class Food {
    public String foodname;
    String cuisine;
    String foodtype;
    int quantityavailable;
    double unitprice;

    public void displayfood() {
        System.out.println("Displaying food deatils ");
        System.out.println("Foodname:" + foodname);
        System.out.println("Cuisine:" + cuisine);
        System.out.println("Food type:" + foodtype);
        System.out.println("Quantity available:" + quantityavailable);
        System.out.println("Unit price:" + unitprice);
    }
}

public class Class_object2 {
    public static void main(String[] args) {
        Food r = new Food();
        r.foodname = "kheer";
        r.cuisine = "first";
        r.foodtype = "breakfast";
        r.quantityavailable = 5;
        r.unitprice = 50.25;
        r.displayfood();

    }
}
/*
 * Displaying food deatils
 * Foodname:kheer
 * Cuisine:first
 * Food type:breakfast
 * Quantity available:5
 * Unit price:50.25
 */