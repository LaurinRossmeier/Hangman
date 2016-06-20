package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import java.awt.Component;

public class HangFrame extends JFrame {
	JLabel lblUsedchars;
	JLabel lblGebenSieDen = new JLabel("Geben sie den zu erratenden Begriff ein und dr\u00FCcken sie \"Start\"");
	JPanel panel_1;
	JButton btnStart;
	JLabel lblWord;
	
	String hiddenWord = "";
	String word = "";
	String message = "bisher verwendet: ";
	boolean gamestarted = false;
	int tries = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HangFrame frame = new HangFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HangFrame() {
		setBounds(100, 100, 447, 380);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);

		btnStart = new JButton("Start");
		btnStart.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				startgame();
			}
		});
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		
		lblGebenSieDen.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(lblGebenSieDen);
		panel.add(btnStart);

		JPanel inputPanel = new JPanel();
		getContentPane().add(inputPanel, BorderLayout.SOUTH);
		inputPanel.setLayout(new MigLayout("", "[][][][][][][][][][]", "[][][]"));

		JButton btnA = new JButton("A");
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				appendLetter("A");

			}
		});
		inputPanel.add(btnA, "cell 0 0");

		JButton btnB = new JButton("B");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				appendLetter("B");
			}
		});
		inputPanel.add(btnB, "cell 1 0");

		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				appendLetter("C");
			}
		});
		inputPanel.add(btnC, "cell 2 0");

		JButton btnD = new JButton("D");
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				appendLetter("D");
			}
		});
		inputPanel.add(btnD, "cell 3 0");

		JButton btnE = new JButton("E");
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				appendLetter("E");
			}
		});
		inputPanel.add(btnE, "cell 4 0");

		JButton btnF = new JButton("F");
		btnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				appendLetter("F");
			}
		});
		inputPanel.add(btnF, "cell 5 0");

		JButton btnG = new JButton("G");
		btnG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				appendLetter("G");
			}
		});
		inputPanel.add(btnG, "cell 6 0");

		JButton btnH = new JButton("H");
		btnH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				appendLetter("H");
			}
		});
		inputPanel.add(btnH, "cell 7 0");

		JButton btnI = new JButton("I");
		btnI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				appendLetter("I");
			}
		});
		inputPanel.add(btnI, "cell 8 0");

		JButton btnJ = new JButton("J");
		btnJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				appendLetter("J");
			}
		});
		inputPanel.add(btnJ, "cell 0 1");

		JButton btnK = new JButton("K");
		btnK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				appendLetter("K");
			}
		});
		inputPanel.add(btnK, "cell 1 1");

		JButton btnL = new JButton("L");
		btnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				appendLetter("L");
			}
		});
		inputPanel.add(btnL, "cell 2 1");

		JButton btnM = new JButton("M");
		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				appendLetter("M");
			}
		});
		inputPanel.add(btnM, "cell 3 1");

		JButton btnN = new JButton("N");
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				appendLetter("N");
			}
		});
		inputPanel.add(btnN, "cell 4 1");

		JButton btnO = new JButton("O");
		btnO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				appendLetter("O");
			}
		});
		inputPanel.add(btnO, "cell 5 1");

		JButton btnP = new JButton("P");
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				appendLetter("P");
			}
		});
		inputPanel.add(btnP, "cell 6 1");

		JButton btnQ = new JButton("Q");
		btnQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				appendLetter("Q");
			}
		});
		inputPanel.add(btnQ, "cell 7 1");

		JButton btnR = new JButton("R");
		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				appendLetter("R");
			}
		});
		inputPanel.add(btnR, "cell 8 1");

		JButton btnS = new JButton("S");
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				appendLetter("S");
			}
		});
		inputPanel.add(btnS, "cell 0 2");

		JButton btnT = new JButton("T");
		btnT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				appendLetter("T");
			}
		});
		inputPanel.add(btnT, "cell 1 2");

		JButton btnU = new JButton("U");
		btnU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				appendLetter("U");
			}
		});
		inputPanel.add(btnU, "cell 2 2");

		JButton btnV = new JButton("V");
		btnV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				appendLetter("V");
			}
		});
		inputPanel.add(btnV, "cell 3 2");

		JButton btnW = new JButton("W");
		btnW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				appendLetter("W");
			}
		});
		inputPanel.add(btnW, "cell 4 2");

		JButton btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				appendLetter("X");
			}
		});
		inputPanel.add(btnX, "cell 5 2");

		JButton btnY = new JButton("Y");
		btnY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				appendLetter("Y");
			}
		});
		inputPanel.add(btnY, "cell 6 2");

		JButton btnZ = new JButton("Z");
		btnZ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				appendLetter("Z");
			}
		});
		inputPanel.add(btnZ, "cell 7 2");

		JButton button = new JButton("<");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				deleteLastLetter();
			}
		});
		inputPanel.add(button, "cell 8 2");

		JPanel panel_2 = new JPanel();
		getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.Y_AXIS));

		lblWord = new JLabel("");
		lblWord.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblWord.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_2.add(lblWord);

		lblUsedchars = new JLabel("");
		lblUsedchars.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		lblUsedchars.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_2.add(lblUsedchars);

		panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.EAST);

	}

	public Character[] toCharacterArray(String s) {

		if (s == null) {
			return null;
		}

		int len = s.length();
		Character[] array = new Character[len];
		for (int i = 0; i < len; i++) {
			array[i] = new Character(s.charAt(i));
		}
		return array;
	}

	public void appendLetter(String l) {
		if (!gamestarted) {
			word = word + l;
			lblWord.setText(word);
		}

		if (gamestarted) {
			message=message+l+",";
			lblUsedchars.setText(message);
			System.out.println("Buchstabe" + l.charAt(0));
			if (word.contains(l)) {
				Character[] charword = toCharacterArray(word);
				for (int i = 0; i < charword.length; i++) {
					if (charword[i] == l.charAt(0)) {
						System.out.println("Buchstabe an Stelle:" + i + "wurde erraten und ist " + charword[i]);
						StringBuilder myName = new StringBuilder(hiddenWord);
						myName.setCharAt(i, l.charAt(0));
						hiddenWord = myName.toString();
						lblWord.setText(hiddenWord);
					}

				}

			} else {
				tries++;
				System.out.println("versuche:" + tries);
				if (tries < 7) {
					setimage(String.valueOf(tries + 1));
				}
			}
			if(tries>5){
				lblWord.setText(word);
				lblUsedchars.setText("Sie Haben Verloren!");
				newRound(); 
			}
			if(word.equals(hiddenWord)){
				
				lblUsedchars.setText("Sie Haben Gewonnen!");
				btnStart.setEnabled(true);
				newRound();
			}

		}

	}

	private void deleteLastLetter() {
		if (!gamestarted) {
			word = word.substring(0, word.length() - 1);
			lblWord.setText(word);
		}

	}

	public void setimage(String name) {

		ImageIcon image = new ImageIcon(name + ".png");
		JLabel lblImage = new JLabel("", image, JLabel.CENTER);
		panel_1.removeAll();
		panel_1.add(lblImage);
	}

	private void startgame() {
		if(!gamestarted){
			if (word.isEmpty()) {
				lblUsedchars.setText("Bitte Text eingeben!");
			} else {
				tries = 0;
				gamestarted = true;
				btnStart.setEnabled(false);
				for (int i = 0; i < word.length(); i++) {
					hiddenWord = hiddenWord + "-";
				}
				
				lblWord.setText(hiddenWord);
			}
		}else if(gamestarted){
			btnStart.setText("Start");
			word="";
			hiddenWord="";
			message = "bisher verwendet: ";
			panel_1.removeAll();
			lblWord.setText("");
			lblUsedchars.setText("");
			lblGebenSieDen.setText("Geben sie den zu erratenden Begriff ein und dr\u00FCcken sie \"Start\"");
			gamestarted=false;
		}
		

	}
	
	public void newRound(){
		btnStart.setText("neue Runde");
		btnStart.setEnabled(true);
		lblGebenSieDen.setText("");
		
	}

}
