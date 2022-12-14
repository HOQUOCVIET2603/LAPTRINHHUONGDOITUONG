
package com.mycompany.qlhocphi;

import java.awt.*;
import java.awt.event.*;

public class GiaoDien implements ActionListener {
    Frame f=new Frame("TINH HOC PHI");
    Label l1=new Label("Ten");
     TextField tf1=new TextField(10);
    Label l2=new Label("Nganh");
     TextField tf2=new TextField(10);
    Label l3=new Label("Doi tuong");
     TextField tf3=new TextField(10);
     Label l4=new Label("SO TC HOC LAI ");
     TextField tf4=new TextField(10);
     
     Choice c = new Choice();
     
    Label kq=new Label();
    Button b1 = new Button(" Tinh ");
    Button b2=new Button("  Thoat ");
    public GiaoDien()
    {
        f.setLayout(new GridLayout(8,5));
        
        f.add(l1);
        f.add(tf1);
        f.add(l2);
        f.add(tf2);
        f.add(l3);
        f.add(tf3);
        f.add(l4);
        f.add(tf4);
        
        c.addItem("DAI HOC");
        c.addItem("CAO HOC");
        f.add(c);
        f.add(new Label());
        b1.addActionListener(this); 
        b2.addActionListener(this);
        f.add(kq);
        f.add(b1);
        f.add(b2);
        
        
        
        f.setSize(1000, 500);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ( e.getSource() == b2)
        {
            System.exit(0);
        }
        if ( e.getSource() == b1)
        {
            String ht = tf1.getText();
            String ng = tf2.getText();
            String dt = tf3.getText();
            int tc = Integer.parseInt(tf4.getText());
            if ( c.getSelectedItem().equals("DAI HOC"))
            {
                HocPhiDH dh = new HocPhiDH(ht, ng, dt, tc);
                kq.setText(dh.HienThi());
            }
            if ( c.getSelectedItem().equals("CAO HOC"))
            {
                HocPhiCH ch = new HocPhiCH(ht, ng, dt, tc);
                kq.setText(ch.HienThi());
            }
        }
    }
    
    
}
