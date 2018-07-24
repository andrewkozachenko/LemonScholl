package school.lemon.ui;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

public class SampleWindow{
    public static void main( String []args ){
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension windowSize = new Dimension( 150, 50 );

        JFrame frm = new JFrame("Caption" );
        frm.setSize( windowSize );
        frm.setLocation(
                d.width/2 - windowSize.width/2, d.height/2 - windowSize.height/2 );
        frm.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frm.add( new JLabel("test", SwingConstants.CENTER) );
        frm.setVisible( true );
    }
}
