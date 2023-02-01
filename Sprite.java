package Items;
import Categories.Drinks;

public class Sprite extends Drinks{

    public Sprite(String productName, int productPrice, int numberOfProducts, String unitOfMeasurement, int volume) {
        super(productName, productPrice, numberOfProducts, unitOfMeasurement, volume);
    }


    @Override
    public String toString() {
        return "Sprite[productName=" + productName
                + ", productPrice=" + productPrice
                + ", numberOfProducts=" + numberOfProducts
                + ", unitOfMeasurement=" + unitOfMeasurement
                + ", volume=" + volume + "]";
    } 

}
