package project;
public class BookProduct extends product {
   private String author;
   private String publisher;
    public BookProduct(int  productId, String name, float price, String author, String publisher) {
        super (productId , name  ,price);
        this.author=author;
        this.publisher=publisher;
     }
    public String get_author (){
    return author;
}
    public String get_publisher (){
    return publisher;
}
    public void set_author (String author ){
    this.author = author ; 
}
    public void set_publisher (String publisher){
        this.publisher=publisher;    
}    
}

