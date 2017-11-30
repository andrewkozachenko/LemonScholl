package school.lemon.finalMonth.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class ClickEvent implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() instanceof JButton){
            JButton d = (JButton)e.getSource();
            if(d.getIcon() == null) {
                d.setIcon(new ImageIcon("ic1.png"));
            }
        }
    }
}


public class XOgui extends JFrame implements ActionListener {

    ClickEvent event = new ClickEvent();

    public XOgui() {
        super("XO game");
        showButtons();
        setLayout(null);
        setSize(330,450);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton df = (JButton) e.getSource();
        df.setEnabled(false);
        if (df.getText() != null){
            System.out.println(df.getText());
            JOptionPane.showMessageDialog(this,"won");
        }

    }

    private void showButtons() {
        int x = 10, y = 10;
        JButton n = new JButton("1");
        n.setBounds(x, y, 100, 100);
        add(n);
        n.addActionListener(this);
        x+=100;
        JButton n1 = new JButton("2");
        n1.setBounds(x, y, 100, 100);
        add(n1);
        n1.addActionListener(this);
        x+=100;
        JButton n2 = new JButton("3");
        n2.setBounds(x, y, 100, 100);
        add(n2);
        n2.addActionListener(this);

        JButton n3 = new JButton("4");
        x=10;
        y+=100;
        n3.setBounds(x, y, 100, 100);
        add(n3);
        n3.addActionListener(this);
        x+=100;
        JButton n4 = new JButton("5");
        n4.setBounds(x, y, 100, 100);
        add(n4);
        n4.addActionListener(event);
        x+=100;
        JButton n5 = new JButton("6", new ImageIcon("ic1.jpg"));
        n5.setBounds(x, y, 100, 100);
        add(n5);
        n5.addActionListener(event);

        y+=100;
        x=10;
        JButton n6 = new JButton("7");
        n6.setBounds(x, y, 100, 100);
        add(n6);
        n6.addActionListener(this);
        x+=100;
        JButton n7 = new JButton("8");
        n7.setBounds(x, y, 100, 100);
        add(n7);
        n7.addActionListener(this);
        x+=100;
        JButton n8 = new JButton("9");
        n8.setBounds(x, y, 100, 100);
        add(n8);
        n8.addActionListener(this);



    }

    public static void main(String[] args) {
        new XOgui();
    }
}
