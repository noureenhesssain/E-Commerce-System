package project;
import java.util.Scanner;
public class EcommerceSystem {
    public static void main(String[] args) {
        EcommerceGui ecommercegui = new EcommerceGui();
Scanner input = new Scanner(System.in);
System.out.println("Welcome to the E-Commerce System!");
System.out.println("Please enter your Id: ");
int customerId = input.nextInt();
System.out.println("Please enter your name: ");
String name = input.next();
System.out.println("Please enter your address: ");
String address = input.next();
 System.out.println("How many products you want to add to your cart?");
int ncart = input.nextInt();
 Customer myCustomer = new Customer(customerId, name, address);
 Cart myCart = new Cart(myCustomer.get_customerId(), ncart);
 for (int i = 0; i < ncart; i++) {
  System.out.println("Enter product type (1 for electronic, 2 for clothing, 3 for book):");
  int productType = input.nextInt();
  input.nextLine();
 switch (productType) {
  case 1 -> {
      ElectronicProduct newElectronicProduct = new ElectronicProduct(1,"smartphone", 599.99f,"samsung",1);
      myCart.addproduct(newElectronicProduct, i);
          }
  case 2 -> {
      ClothingProduct newClothingProduct = new ClothingProduct(2,"T-shirt", 19.99f,"Medium","cotton");
      myCart.addproduct(newClothingProduct, i);
          }
 case 3 -> {
    BookProduct newBookProduct = new BookProduct(3,"oop",39.99f,"O'Reilly","X Publications");
     myCart.addproduct(newBookProduct, i);
          }
 default -> {
     
         System.out.println("Invalid product type.");}
 }
 }
 System.out.println( "Your total is "+ myCart.calculatePrice()+ " $");
     System.out.println("\nDo you want to place an order for the products in your cart? (1-yes/2-no)");
     int response = input.nextInt();
     if (response==1) {
         System.out.println ("Here's your order's summary:");
order myOrder = new order(myCustomer.get_customerId(), 1, myCart.getProducts());
      myOrder.printOrderInfo();

     } else {
         System.out.println("Order not placed.");
     }
     System.exit(0);
      }
 }





