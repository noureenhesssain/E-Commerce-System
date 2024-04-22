package project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class orderGui extends JFrame implements ActionListener {
    private JLabel label1,label2,label3,label4,label5;
    private JButton buttton;
    orderGui(String customerid, String orderid, String selectedItemText, float totalPrice) {
        setTitle("Order place : ");
        setSize(700,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.gray);
        this.setResizable(false);
        setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
        label1 = new JLabel("Here's your summary : ");
        label2 = new JLabel("CustomerID : " + customerid);
        label3 = new JLabel("OrderID : "+ orderid);
        label4 = new JLabel("<html>" + "Selected items : "+selectedItemText+"</html>");
        label5 = new JLabel("Total price : " + totalPrice + " $");
        buttton = new JButton("Ok");
        label1.setBounds(5,50,300,25);
        label2.setBounds(5,100,300,25);
        label3.setBounds(5,150,300,25);
        label4.setPreferredSize(new Dimension(label4.getPreferredSize().width,label4.getPreferredSize().height));
        label5.setBounds(5,250,400,10);
        buttton.setBounds(50,350,10,25);
        add(label1);
        add(Box.createVerticalStrut(10));
        add(label2);
        add(Box.createVerticalStrut(10));
        add(label3);
        add(Box.createVerticalStrut(10));
        add(label4);
        add(Box.createVerticalStrut(10));
        add(label5);
        add(Box.createVerticalStrut(30));
        add(buttton);
        buttton.addActionListener(this);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttton) {
           this.dispose();
           System.exit(0);
        }
    }
}

