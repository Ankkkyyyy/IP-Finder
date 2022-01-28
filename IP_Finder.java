import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class IP_Finder extends JFrame implements ActionListener {
    JTextField t;
    JButton b1, b2;
    JLabel l1;

    public IP_Finder()
    {
        super("IP Finder");
        t = new JTextField();
        t.setBounds(100, 100, 200, 20);
        b1 = new JButton("Search IP ");
        b1.setBounds(100, 200, 100, 30);
        b2 = new JButton("Exit");
        b2.setBounds(220, 200, 80, 30);
        l1 = new JLabel("IP Finder");
        l1.setBounds(120, 40, 300, 20);

        l1.setFont(new Font("Times New Roman", Font.BOLD, 28));
        b1.addActionListener(this);
        b2.addActionListener(this);
        add(t);
        add(b1);
        add(b2);
        add(l1);
        setSize(430, 400);
        setLayout(null);
        setVisible(true);
        setTitle("Ankkkyyyy will find you Searching IP");
        setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    public static void main(String[] args) {
        new IP_Finder();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String str = e.getActionCommand();
            if (str.equals("Search IP")) ;
           {
            try {
                String url = t.getText();
                InetAddress inet = InetAddress.getByName(url);
                String ip = inet.getHostAddress();
                JOptionPane.showMessageDialog(this, ip);
                if (str.equals("Exit"))
                {
                    JOptionPane.showMessageDialog(this, "You sure you want to exit ?","Warning",JOptionPane.WARNING_MESSAGE);
                    dispose();
                    repaint();
                }
            }
            catch (UnknownHostException ex)
            {
                JOptionPane.showMessageDialog(this, "Enter a valid URL", "Alert", JOptionPane.WARNING_MESSAGE);
            }

           }

    }

}





