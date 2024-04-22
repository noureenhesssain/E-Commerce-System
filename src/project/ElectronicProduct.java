package project;
public class ElectronicProduct extends product {
  private String brand; 
  private int warrantyPeriod;
   public ElectronicProduct(int  productId, String name, float price, String brand, int warrantyPeriod) {
      super (productId , name,price);
      this.brand=brand;
      this.warrantyPeriod=warrantyPeriod;
   }  
   public String get_brand(){
           return brand;    
}
   public int get_warrantyPeriod (){       
       return Math.abs(warrantyPeriod);        
}
   public void set_brand (String brand){
        this.brand=brand;
}
public void set_warrantyPeriod ( int warrantyPeriod){
        this.warrantyPeriod=Math.abs(warrantyPeriod);
}
}
