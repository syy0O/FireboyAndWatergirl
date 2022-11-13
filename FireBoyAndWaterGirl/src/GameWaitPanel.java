import java.awt.Color;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameWaitPanel extends JPanel{
	private JLabel watergirlLabel = new JLabel();
	private Icon watergirlIcon;
	private String watergirlImgPath = "src/static/image/character/water girl_run right.gif";

	private JLabel fireboyLabel = new JLabel();
	private Icon fireboyIcon;
	private String fireboyImgPath = "src/static/image/character/fire boy_run right.gif";
	
	private JLabel waitLabel = new JLabel();
	private Icon waitIcon;
	private String waitImgPath = "src/static/image/text/wait.gif";
	
	private JLabel waitPlayerLabel = new JLabel();
	private ImageIcon waitPlayerIcon;
	private String oneImgPath = "src/static/image/text/1.png";
	private String twoImgPath = "src/static/image/text/2.png";
	
	private JLabel slashLabel = new JLabel();
	private ImageIcon slashIcon;
	private String slashImgPath = "src/static/image/text/slash.png";
	
	private JLabel totalPlayerLabel = new JLabel();
	private ImageIcon totalPlayerIcon;
	private String totalPlayerImgPath = "src/static/image/text/2.png";
	 
	public GameWaitPanel() {
		setSize(717, 563); 
		setLayout(null);
		setVisible(true);
		setBackground(Color.BLACK);
		
		watergirlLabel.setBounds(232,214,100,100);
	    watergirlIcon = new ImageIcon(new ImageIcon(watergirlImgPath).getImage().getScaledInstance(watergirlLabel.getWidth(),watergirlLabel.getHeight(),Image.SCALE_DEFAULT));
	    watergirlLabel.setIcon(watergirlIcon);
		this.add(watergirlLabel);
		
		fireboyLabel.setBounds(360,214,100,100);
	    fireboyIcon = new ImageIcon(new ImageIcon(fireboyImgPath).getImage().getScaledInstance(fireboyLabel.getWidth(),fireboyLabel.getHeight(),Image.SCALE_DEFAULT));
	    fireboyLabel.setIcon(fireboyIcon);
		this.add(fireboyLabel);
		
		waitLabel.setBounds(239,308,284,100);
		waitIcon = new ImageIcon(new ImageIcon(waitImgPath).getImage().getScaledInstance(waitLabel.getWidth(),waitLabel.getHeight(),Image.SCALE_DEFAULT));
		waitLabel.setIcon(waitIcon);
		this.add(waitLabel);
		
		// player 입장 정보
		waitPlayerLabel.setBounds(285, 155, 50, 50);
		
		slashLabel.setBounds(340,157,50,50);
		slashIcon = new ImageIcon(new ImageIcon(slashImgPath).getImage().getScaledInstance(slashLabel.getWidth(),slashLabel.getHeight(),Image.SCALE_SMOOTH));
		slashLabel.setIcon(slashIcon);
		
		totalPlayerLabel.setBounds(387,155,50,50);
		totalPlayerIcon  = new ImageIcon(new ImageIcon(totalPlayerImgPath).getImage().getScaledInstance(totalPlayerLabel.getWidth(),totalPlayerLabel.getHeight(),Image.SCALE_SMOOTH));
		totalPlayerLabel.setIcon(totalPlayerIcon);
		
		add(slashLabel);
		add(totalPlayerLabel);
	}
	
	public void changePlayerNum(int waitingPlayerNum) { // 참여한 플레이어 수 이미지 변경
		switch (waitingPlayerNum) {
		case 1: {
			waitPlayerIcon = new ImageIcon(new ImageIcon(oneImgPath).getImage().getScaledInstance(waitPlayerLabel.getWidth(),waitPlayerLabel.getHeight(),Image.SCALE_SMOOTH));
			break;
		}
		case 2:
			waitPlayerIcon = new ImageIcon(new ImageIcon(twoImgPath).getImage().getScaledInstance(waitPlayerLabel.getWidth(),waitPlayerLabel.getHeight(),Image.SCALE_SMOOTH));
			break;
		}
		waitPlayerLabel.setIcon(waitPlayerIcon);
		add(waitPlayerLabel);
	}
}
