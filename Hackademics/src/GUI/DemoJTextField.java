
package GUI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DemoJTextField {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setBounds(200,200,500,200);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        JPanel jPanel = new JPanel();
        JTextField jTextField =  new JTextField(20);
        jTextField.setText("Hello");
        
        JLabel jLabel = new JLabel();
        jLabel.setText("<html><font color = 'blue'>Username</font></html>");//set màu chữ 
        jPanel.add(jLabel);
        
        jTextField.setFont(new Font("Arial", Font.PLAIN,14));
        jPanel.add(jTextField);
 
        JButton jButton = new JButton("OK");
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Tên bạn là: " + jTextField.getText());
            }
        });
        jPanel.add(jButton);
        
        jFrame.add(jPanel);
        jFrame.setVisible(true);
    }
}
