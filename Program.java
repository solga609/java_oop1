/ import Base.Product;
 import Items.*;

 import java.util.ArrayList;



public class Program {

        int count = 1;
       
        for( Product pr , productItems) {
            System.out.printf("%d. %s\n", count, pr);
              System.out.println(pr);
            count+=1;
       }
         System.out.println(productItems.toString()); 
}

   public static void main(String[] args) {



      
        Eggs eggs = new Eggs("BigChicken", 80, 1, "pieces", "30 days", 15);       
        Milk milk = new Milk("Royal", 90, 1, "milliliters", 800, 8, "16 days");
        Sprite sprite = new Sprite("Буратино", 90, 1, "liters", 1);    
        Masks masks = new Masks("Olive mask", 317, 1, "pieces", 16);
        ToiletPaper toiletPaper = new ToiletPaper("Zewa Just1 Flowers", 710, 1, "pieces", 4, 4);
        Pampers pampers = new Pampers("Huggies", 800, 1, "pieces", 0, true, "NB", 0, 5, "disposable");
        BabyPacifier babyPacifier = new BabyPacifier("Super", 224, 1, "pieces", 6, true);



 ArrayList<Product> productItems = new ArrayList<Product>();

        
       
         productItems.add(eggs);
         productItems.add(milk);
         productItems.add(sprite);
         productItems.add(masks);
         productItems.add(toiletPaper);
        productItems.add(pampers);
        productItems.add(babyPacifier);
   

        fullInfoAboutProductItem(productItems); 

     }


    