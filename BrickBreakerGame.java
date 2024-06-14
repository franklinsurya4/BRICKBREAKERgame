import java.util.*;
import javax.swing.*;
import java.awt.*;

public class BrickBreakerGame {
	public static void main(String[] args) {
		
		JFrame frame=new JFrame();
		
		GamePlay gp=new GamePlay();
		
		frame.setBounds(10,10,700,600);//10-top,10-left,700-bottom,600-right
		frame.setTitle("Breakout Ball");
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(gp);
	}

}

