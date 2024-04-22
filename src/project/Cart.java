package project;
public class Cart {
   private int customerId;
   private int   nProducts ;
   private product[] products;  
    public Cart (int customerId , int nproducts){
        this.customerId=Math.abs(customerId);
        this.nProducts= Math.abs(nproducts);
        this.products=new product[nproducts];
    } 
   public int get_customerId(){
    return Math.abs(customerId);
} 
   public int get_nproducts(){
       return Math.abs(nProducts);
   }
   public void set_customerId(int customerId){
    this.customerId = customerId;       
   }
   public void set_nproducts(int nProducts){
    this.nProducts = nProducts;       
   }
   public void addproduct(product product, int index){
       if (index >= 0 && index < nProducts) {
        products[index] = product;
        } else {
        System.out.println("Invalid index.");
        }
        }
   public void removeproduct(int index){
    if (index >= 0 && index < nProducts) {
        products[index] = null;
        } else {
        System.out.println("Invalid index.");
        }
   }
   public float calculatePrice(){
    float totalPrice = 0;
 for (product product : products) {
 if (product != null) {
 totalPrice += product.get_price();
 }
 }
 return totalPrice;
 }   
  public product [] getProducts(){
    return products;
} 
  public int getcustomerId(){
      return customerId;
  }
   public void placeOrder (){
       
   }
}

