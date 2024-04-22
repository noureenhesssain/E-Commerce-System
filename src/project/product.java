package project;
public class product {
   int productId;
    String name  ;      
  float  price ;
public product (int productId,String name , float price2){
    this.productId = productId;
    this.name = name;
    this.price = Math.abs(price2);
}
public int get_productId (){
       return Math.abs(productId) ;
}
public String get_name(){
       return name;
}
public float get_price (){
      return (float) Math.abs(price); 
}
public void set_productId (int productId){
        this.productId=Math.abs(productId);
}
public void set_name ( String name ){
        this.name=name;
}
public void set_price ( float  price){
        this.price=price;
}
}