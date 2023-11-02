import java.util.*;
public class productservice
{
    List<product> products=new ArrayList<>();
    public void addproduct(product p)
    {
      products.add(p);
    }
    public List<product> getallproducts()
    {
        return products;
    }
    public product getproduct(String name)
    {
        
        for(product p:products)
        {
            if(p.getName().equals(name))
            {
                return p;
            }
           
        }
        
    return null;
    }
    public List<product> getproductwithtext(String txt)
    {
        String str=txt.toLowerCase();
        List<product> prods=new ArrayList<>();
        for(product p:products)
        {
            String name=p.getName().toLowerCase();
            String type=p.getType().toLowerCase();
            String place=p.getPlace().toLowerCase();
            
            if(name.contains(str) || type.contains(str) || place.contains(str) )
            {
                prods.add(p);
            }
        }
        return prods;

    }
    public List<product> getOutOfWarrantyProducts() 
    {
        List<product> outOfWarrantyProducts = new ArrayList<>();
        int currentYear = 2023; // Set the current year as per your actual year

        for (product p : products)
         {
            if (p.getWarranty()<currentYear) 
            {
                outOfWarrantyProducts.add(p);
            }
        }

        return outOfWarrantyProducts;
    }
    
    public boolean removeProductByName(String productName) {
        productName = productName.toLowerCase(); 
    
        for (product p : products) {
            if (p.getName().toLowerCase().equals(productName)) {
                products.remove(p);
                return true; 
            }
        }
        return false; 
    }
    
    
}
