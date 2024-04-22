package project;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class EcommerceGui extends JFrame implements ActionListener {
   private JPanel p1;
   private JLabel l1, l2, l3, l4, l5;
   private JTextField t1, t2, t3, t4;
   private JButton b1, b2;
    private cartGui cartGui;
    private String customerId;private String orderid;
    EcommerceGui() {
        this.setTitle("E-commerce");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(500, 400);
        this.setLocation(200, 50);
        l1 = new JLabel("Please enter your Id: ");
        l2 = new JLabel("Please enter your name: ");
        l3 = new JLabel("Please enter your address: ");
        l4 = new JLabel("How many products you want to add to cart?");
        l5 = new JLabel("Welcome to the E-commerce system: ");
        p1 = new JPanel();
        p1.setLayout(null);
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();
        l1.setBounds(10, 50, 300, 25);
        t1.setBounds(280, 50, 200, 25);
        l2.setBounds(10, 90, 300, 25);
        t2.setBounds(280, 90, 200, 25);
        t3.setBounds(280, 130, 200, 25);
        l3.setBounds(10, 130, 300, 25);
        l4.setBounds(10, 170, 300, 25);
        t4.setBounds(280, 170, 200, 25);
        l5.setBounds(10, 10, 300, 25);
        this.add(p1);
        p1.add(l1);p1.add(l2);p1.add(l3);p1.add(t4);p1.add(l4);
        p1.add(t1);p1.add(t2);p1.add(t3);p1.add(l5);
        this.setVisible(true);
        t1.addActionListener(this);
        t4.addActionListener(this);
        b1 = new JButton("create");
        b1.setBounds(50, 230, 150, 25);
        p1.add(b1);
        b1.addActionListener(this);
        b2 = new JButton("Exist");
        b2.setBounds(250, 230, 150, 25);
        p1.add(b2);
        b2.addActionListener(this);
    }
    EcommerceGui(String customerId, String orderid){
        this.customerId=customerId;
        this.orderid=orderid;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String nproduct = t4.getText().toString();
            int x = Integer.parseInt(nproduct);
            String orderId = "1";
            String customerID = t1.getText().toString();
            cartGui a = new cartGui(customerID, orderId, x);
            dispose();
        }
        if (e.getSource()== b2){

            this.dispose();
        }
    }
    public cartGui getMyFrame() {
        return cartGui;
    }
}

