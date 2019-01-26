package heheXD;

import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Oh {

	public static void main(String[] args) throws MalformedURLException {
		
		
		for(int i = 0; i < 40; i++){
			
			URL url = Oh.class.getResource("tumblr_oqjxlk0ucw1v0vumko1_500.gif");
			Icon icon = new ImageIcon(url);
			JLabel label = new JLabel(icon);
			JFrame f = new JFrame("WITH THE BOYS");
			f.getContentPane().add(label);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.pack();
			f.setLocation((int)(Math.random() * 1000), (int) (Math.random() * 1000));
			f.setResizable(false);
			f.setVisible(true);
			
			
		}
		
		
	}
	
}
