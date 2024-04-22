package project;
public class Customer {
    private  int  customerId;
     private String name;
     private String  address;
public Customer(int customerId, String name, String address) {
      this.customerId=Math.abs(customerId);
      this.name=name;
    this.address=address;
}
public int get_customerId(){
    return Math.abs(customerId);
}
public String get_name(){
    return name;
}
public String get_address(){
    return address;
}
public void set_customerId(int  customerId){
    this.customerId=Math.abs(customerId);
}
public void set_name (String name){
    this.name=name;
}
public void set_address( String  address){
    this.address=address;
}
}

