/**
 * Created by emma on 7/11/17.
 */

import java.util.ArrayList;

public class GroceryTest {

    public static void main(String[] args) {

        ArrayList<GroceryItem> groceryItems = new ArrayList<GroceryItem>();

        for(int i = 1; i <= 20; i++) {
            groceryItems.add(new GroceryItem(i));
        }

        ArrayList<GroceryItem> itemsAbove7 = new ArrayList<GroceryItem>();
        ArrayList<GroceryItem> itemsBelow7 = new ArrayList<GroceryItem>();

        for(GroceryItem item : groceryItems) {

            if(item.getShelfLife() > 7) {
                itemsAbove7.add(item);
            } else {
                itemsBelow7.add(item);
            }

        }

    }

}
