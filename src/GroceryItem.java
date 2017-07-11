/**
 * Created by emma on 7/11/17.
 */

import java.util.Random;

public class GroceryItem {

    private static Random rnGenerator = new Random(23);
    private int itemCode;
    private int shelfLife;

    public GroceryItem(int newItemCode) {
        setRandomShelfLife();
        setItemCode(newItemCode);
    }

    public void setRandomShelfLife() {
        int newShelfLife = rnGenerator.nextInt( 30 ) + 1;
        setShelfLife(newShelfLife);
    }

    public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }
}
