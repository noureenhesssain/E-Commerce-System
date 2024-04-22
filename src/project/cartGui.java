package project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class cartGui extends JFrame implements ActionListener {
    ButtonGroup g1 = new ButtonGroup();
    private JRadioButton radioButton1, radioButton2;
    private JLabel ll1;
    private int count = 0;
    private int maxClicks;
    private float totalprice = 0;
    private JLabel totalPriceLabel;
    private String selectedItemsText = "";
    private String customerid;
    private String orderid;
    cartGui(String x, String y, int maxClicks) {
        customerid = x;
        orderid = y;
        this.maxClicks = maxClicks;
        initializeFrame();
    }
    private void initializeFrame() {
        this.setTitle("E-commerce products ");
        this.setSize(500, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        JLabel l1 = new JLabel("Enter product type ");
        JLabel l2 = new JLabel("electronic");
        JLabel l3 = new JLabel("clothing");
        JLabel l4 = new JLabel("book");
        JButton addbutton1 = new JButton("Add");
        JButton addbutton2 = new JButton("Add");
        JButton addbutton3 = new JButton("Add");
        JButton removebutton1 = new JButton("Remove");
        JButton removebutton2 = new JButton("Remove");
        JButton removebutton3 = new JButton("Remove");
        JButton orderplace = new JButton("Place order");
        l1.setBounds(10, 20, 160, 40);
        l2.setBounds(10, 60, 160, 40);
        l3.setBounds(10, 100, 160, 40);
        l4.setBounds(10, 140, 160, 40);
        addbutton1.setBounds(210, 60, 60, 30);
        addbutton2.setBounds(210, 100, 60, 30);
        addbutton3.setBounds(210, 140, 60, 30);
        removebutton1.setBounds(310, 60, 160, 30);
        removebutton2.setBounds(310, 100, 160, 30);
        removebutton3.setBounds(310, 140, 160, 30);
        addbutton1.addActionListener(this);
        addbutton2.addActionListener(this);
        addbutton3.addActionListener(this);
        removebutton1.addActionListener(this);
        removebutton2.addActionListener(this);
        removebutton3.addActionListener(this);
        this.add(addbutton1);
        this.add(addbutton2);
        this.add(addbutton3);
        this.add(removebutton1);
        this.add(removebutton2);
        this.add(removebutton3);
        this.add(l1);
        this.add(l2);
        this.add(l3);
        this.add(l4);
        this.setVisible(true);
        totalPriceLabel = new JLabel("Total Price: $0.00");
        totalPriceLabel.setBounds(70, 190, 200, 30);
        this.add(totalPriceLabel);
        ll1 = new JLabel("Do you want to place an order for the products in your cart?");
        radioButton1 = new JRadioButton("yes");
        radioButton2 = new JRadioButton("No");
        ll1.setBounds(10, 170, 350, 150);
        radioButton1.setBounds(100, 300, 50, 30);
        radioButton2.setBounds(250, 300, 50, 30);
        g1.add(radioButton1);
        g1.add(radioButton2);
        radioButton1.setVisible(true);
        radioButton2.setVisible(true);
        ll1.setVisible(true);
        this.add(ll1);
        this.add(radioButton1);
        this.add(radioButton2);
        radioButton1.addActionListener(this);
        radioButton2.addActionListener(this);
        addbutton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                totalprice += 599.99;
                updateTotalPriceLabel();
                recordItem("SmartPhone :   price: 599.99$     ", totalprice);

            }
        });
        removebutton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                totalprice -= 599.99;
                updateTotalPriceLabel();
                recordItem("", totalprice);

                count -= 1;
                maxClicks += 1;
            }
        });
        addbutton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                totalprice += 19.99;
                updateTotalPriceLabel();
                recordItem("T-shirt :  price: 19.99$     ", totalprice);

            }
        });
        removebutton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                totalprice -= 19.99;
                updateTotalPriceLabel();
                recordItem("", totalprice);
                count -= 1;
                maxClicks += 1;
            }
        });
        addbutton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                totalprice += 39.99;
                updateTotalPriceLabel();
                recordItem("OOP :   price: 39.99$     ", totalprice);


            }
        });
        removebutton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                totalprice -= 39.99;
                updateTotalPriceLabel();
                recordItem("", totalprice);
                count -= 1;
                maxClicks += 1;
            }
        });
    }
    private void updateTotalPriceLabel() {
        totalPriceLabel.setText("Total Price: $" + String.format("%.2f", totalprice));
    }
    private void recordItem(String itemName, float totalprice) {
        selectedItemsText += itemName + " , ";
    }
    private void disableButtons() {
        Component[] components = this.getContentPane().getComponents();
        for (Component component : components) {
            if (component instanceof JButton) {
                JButton button = (JButton) component;
                button.setEnabled(false);
            }
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton button = (JButton) e.getSource();
            count++;
            if (count >= maxClicks) {
                disableButtons();
            }
        }
        if (e.getSource() == radioButton1) {
            String customerId = customerid;
            String orderedItem = orderid;
            orderGui Guiorder = new orderGui(customerId, orderedItem, selectedItemsText, totalprice);
            dispose();
        } else if (e.getSource() == radioButton2) {
            JOptionPane.showMessageDialog(null, "order not placed");
            this.dispose();
        }
    }
}
