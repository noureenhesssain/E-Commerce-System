package project;
public class order {
    private int customerId;
   private int orderId;
   private product[] products;
   private float totalPrice;
    public order (int customerId, int orderId, product[] products){
        this.customerId=Math.abs(customerId);
        this.orderId=Math.abs(orderId);
        this.products= products;
        this.totalPrice=calculateTotalPrice();
    }
    order() {
       }
    public float calculateTotalPrice() {
        float totalPrice = 0;
        for (product product : products) {
            if (product != null) {
                totalPrice += product.get_price();
            }
        }
        return totalPrice;
    }
    public void printOrderInfo() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Products:");
        for (product product : products) {
            if (product != null) {
                System.out.println("- " + product.get_name() + ": $" + product.get_price());
            }
        }
        System.out.println("Total Price: $" + totalPrice);
    }
    public float getTotalPrice() {
        return totalPrice;
    }
}


