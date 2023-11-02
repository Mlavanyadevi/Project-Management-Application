import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        productservice service =new productservice();
    
        service.addproduct(new product("Laptop", "Electronics", "Store", 2023));
        service.addproduct(new product("Refrigerator", "Appliances", "Kitchen", 2022));
        service.addproduct(new product("Running Shoes", "Sports", "Sporting Goods Store", 2021));
        service.addproduct(new product("Desk Chair", "Furniture", "Office", 2020));
        service.addproduct(new product("Coffee Maker", "Appliances", "Kitchen", 2019));
        service.addproduct(new product("Smartphone", "Electronics", "Store", 2024));
        service.addproduct(new product("LED TV", "Electronics", "Living Room", 2029));
        service.addproduct(new product("Toothbrush", "Health", "Bathroom", 2030));
        service.addproduct(new product("Backpack", "Fashion", "Store", 2031));
        service.addproduct(new product("Bicycle", "Sports", "Sporting Goods Store", 2032));
        service.addproduct(new product("Microwave Oven", "Appliances", "Kitchen", 2033));
        service.addproduct(new product("Sunglasses", "Fashion", "Store", 2034));
        service.addproduct(new product("Headphones", "Electronics", "Store", 2035));
        service.addproduct(new product("Drill Machine", "Tools", "Garage", 2036));
        service.addproduct(new product("Gaming Console", "Electronics", "Living Room", 2037));
       // List<product> products=service.getallproducts();
        //for(product p:products)
        //{
          //  System.out.println(p);
        //}
       // product p=service.getproduct("Bicycle");
        //System.out.println(p);
        //List<product> p=service.getproductwithtext("store");
        //for(product pro:p)
        //{
          //  System.out.println(pro);
        //}
        //List<product> products=service.getOutOfWarrantyProducts();
        //for(product p:products)
        //{
          //System.out.println(p);  
        //}
        boolean removed = service.removeProductByName("Laptop");
        if (removed)
         {
          System.out.println("Product removed successfully.");
         }
       else 
         {
          System.out.println("Product not found or could not be removed.");
         }
         List<product> updatedProducts = service.getallproducts();
         for (product p : updatedProducts) {
             System.out.println(p);
         }

    }
}