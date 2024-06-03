package oop;

import java.util.ArrayList;
import java.util.List;



public class HotDrinkMachine implements VendingMachine {
 
     List<Product> ListHotDrinks = new ArrayList<>();
   
   


@Override
public Product getProduct(String name) {
    for (Product hotDrink : ListHotDrinks) {
        if( hotDrink.getName().equals(name))
        {
           ListHotDrinks.remove(hotDrink);
            return hotDrink;}

}
System.out.println("NO");
        return null;
}

@Override
public Product getProduct(String name, double volume, int temperature) {
        for (Product hotDrink : ListHotDrinks) {
            if(hotDrink.getName().equals(name)
                    && ((HotDrink)hotDrink).getTemperature()==temperature
                    && ((HotDrink)hotDrink).getVolume()==volume){
                ListHotDrinks.remove(hotDrink);
                return (HotDrink) hotDrink;}
        }
        throw new UnsupportedOperationException("Unimplemented method 'geProduct'");
        
        
}

@Override
public void addProduct(List<Product> productList) {
    this.ListHotDrinks.addAll(productList);
}

@Override
public List<Product> showProducts() {
   return ListHotDrinks;
}

        
        }
    
