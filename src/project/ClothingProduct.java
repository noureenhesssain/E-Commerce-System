package project;
public class ClothingProduct extends product {
private String size;
private String fabric;   
public ClothingProduct(int  productId, String name, float price, String size, String fabric) {
                super (productId , name,price);
                this.size=size;
                this.fabric=fabric;
             }
  public String get_size(){
        return size;}
     public String get_fabric(){
         return fabric;}
        public void set_size(String size){
                this.size=size;     
}
        public void set_fabric (String fabric){
            this. fabric = fabric;
}
}
