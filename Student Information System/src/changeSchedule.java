import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class changeSchedule 
{
	static String ep = "";
	static String epg = "";
	static String bp = "";
	static String bpg = "";
	static String ap = "";
	static String apg = "";
	public static void changueSched(final int sng)
	{
	if (ImportTextFile.classArray.get(sng).getP1Class().equals("English")  &&  ImportTextFile.classArray.get(sng).getP2Class().equals("Biology")) 
		{
		ep = ImportTextFile.classArray.get(sng).getP1Class();
		epg = ImportTextFile.classArray.get(sng).getP1Grade();
		bp = ImportTextFile.classArray.get(sng).getP2Class();
		bpg = ImportTextFile.classArray.get(sng).getP2Grade();
		ap = ImportTextFile.classArray.get(sng).getP3Class();
		apg = ImportTextFile.classArray.get(sng).getP3Grade();
		}
	else if (ImportTextFile.classArray.get(sng).getP1Class().equals("English")  &&  ImportTextFile.classArray.get(sng).getP2Class().equals("Algebra")) 
		{
		ep = ImportTextFile.classArray.get(sng).getP1Class();
		epg = ImportTextFile.classArray.get(sng).getP1Grade();
		ap = ImportTextFile.classArray.get(sng).getP2Class();
		apg = ImportTextFile.classArray.get(sng).getP2Grade();
		bp = ImportTextFile.classArray.get(sng).getP3Class();
		bpg = ImportTextFile.classArray.get(sng).getP3Grade();
		}
	else if (ImportTextFile.classArray.get(sng).getP1Class().equals("Algebra")  &&  ImportTextFile.classArray.get(sng).getP2Class().equals("Biology")) 
		{
		ap = ImportTextFile.classArray.get(sng).getP1Class();
		apg = ImportTextFile.classArray.get(sng).getP1Grade();
		bp = ImportTextFile.classArray.get(sng).getP2Class();
		bpg = ImportTextFile.classArray.get(sng).getP2Grade();
		ep = ImportTextFile.classArray.get(sng).getP3Class();
		epg = ImportTextFile.classArray.get(sng).getP3Grade();
		}
	else if (ImportTextFile.classArray.get(sng).getP1Class().equals("Algebra")  &&  ImportTextFile.classArray.get(sng).getP2Class().equals("English")) 
		{
		ap = ImportTextFile.classArray.get(sng).getP1Class();
		apg = ImportTextFile.classArray.get(sng).getP1Grade();
		ep = ImportTextFile.classArray.get(sng).getP2Class();
		epg = ImportTextFile.classArray.get(sng).getP2Grade();
		bp = ImportTextFile.classArray.get(sng).getP3Class();
		bpg = ImportTextFile.classArray.get(sng).getP3Grade();
		}
	else if (ImportTextFile.classArray.get(sng).getP1Class().equals("Biology")  &&  ImportTextFile.classArray.get(sng).getP2Class().equals("Algebra")) 
		{
		bp = ImportTextFile.classArray.get(sng).getP1Class();
		bpg = ImportTextFile.classArray.get(sng).getP1Grade();
		ap = ImportTextFile.classArray.get(sng).getP2Class();
		apg = ImportTextFile.classArray.get(sng).getP2Grade();
		ep = ImportTextFile.classArray.get(sng).getP3Class();
		epg = ImportTextFile.classArray.get(sng).getP3Grade();
		}
	else if (ImportTextFile.classArray.get(sng).getP1Class().equals("Biology")  &&  ImportTextFile.classArray.get(sng).getP2Class().equals("English")) 
		{
		bp = ImportTextFile.classArray.get(sng).getP1Class();
		bpg = ImportTextFile.classArray.get(sng).getP1Grade();
		ep = ImportTextFile.classArray.get(sng).getP2Class();
		epg = ImportTextFile.classArray.get(sng).getP2Grade();
		ap = ImportTextFile.classArray.get(sng).getP3Class();
		apg = ImportTextFile.classArray.get(sng).getP3Grade();
		}
	String [] chStdArrW = new String[] {"English, Biology, Algebra", "English, Algebra, Biology", "Algebra, Biology, English", "Algebra, English, Biology", "Biology, Algebra, English", "Biology, English, Algebra"};
	final JComboBox<String> dropDowncS = new JComboBox<String>(chStdArrW);
	JButton buttoncS = new JButton("Enter"); 
	final JFrame framechan = new JFrame("Change Schedule");
	framechan.setSize(400, 100);
	framechan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	framechan.setResizable(false);
	framechan.setLocationRelativeTo(null); // Sets JPanel to center of screen
	final JPanel panelCeh = new JPanel();
	panelCeh.add(dropDowncS);
	panelCeh.add(buttoncS);
	framechan.add(panelCeh);
	buttoncS.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
				{
				framechan.dispose();
				int sssw = dropDowncS.getSelectedIndex();
				switchSch(sssw, sng);
				}
			
		});
	framechan.setVisible(true);
	}
	
	
public static void switchSch(int sswr, int s)
	{
	switch (sswr)
		{
		case 0:
			{
			ImportTextFile.classArray.get(s).setP1Class(ep);
			ImportTextFile.classArray.get(s).setP1Grade(epg);
			ImportTextFile.classArray.get(s).setP2Class(bp);
			ImportTextFile.classArray.get(s).setP2Grade(bpg);
			ImportTextFile.classArray.get(s).setP3Class(ap);
			ImportTextFile.classArray.get(s).setP3Grade(apg);
			break;
			}
		case 1:
			{
			ImportTextFile.classArray.get(s).setP1Class(ep);
			ImportTextFile.classArray.get(s).setP1Grade(epg);
			ImportTextFile.classArray.get(s).setP2Class(ap);
			ImportTextFile.classArray.get(s).setP2Grade(apg);
			ImportTextFile.classArray.get(s).setP3Class(bp);
			ImportTextFile.classArray.get(s).setP3Grade(bpg);
			break;
			}
		case 2:
			{
			ImportTextFile.classArray.get(s).setP1Class(ap);
			ImportTextFile.classArray.get(s).setP1Grade(apg);
			ImportTextFile.classArray.get(s).setP2Class(bp);
			ImportTextFile.classArray.get(s).setP2Grade(bpg);
			ImportTextFile.classArray.get(s).setP3Class(ep);
			ImportTextFile.classArray.get(s).setP3Grade(epg);
			break;
			}
		case 3:
			{
			ImportTextFile.classArray.get(s).setP1Class(ap);
			ImportTextFile.classArray.get(s).setP1Grade(apg);
			ImportTextFile.classArray.get(s).setP2Class(ep);
			ImportTextFile.classArray.get(s).setP2Grade(epg);
			ImportTextFile.classArray.get(s).setP3Class(bp);
			ImportTextFile.classArray.get(s).setP3Grade(bpg);
			break;
			}
		case 4:
			{
			ImportTextFile.classArray.get(s).setP1Class(bp);
			ImportTextFile.classArray.get(s).setP1Grade(bpg);
			ImportTextFile.classArray.get(s).setP2Class(ap);
			ImportTextFile.classArray.get(s).setP2Grade(apg);
			ImportTextFile.classArray.get(s).setP3Class(ep);
			ImportTextFile.classArray.get(s).setP3Grade(epg);
			break;
			}
		case 5:
			{
			ImportTextFile.classArray.get(s).setP1Class(bp);
			ImportTextFile.classArray.get(s).setP1Grade(bpg);
			ImportTextFile.classArray.get(s).setP2Class(ep);
			ImportTextFile.classArray.get(s).setP2Grade(epg);
			ImportTextFile.classArray.get(s).setP3Class(ap);
			ImportTextFile.classArray.get(s).setP3Grade(apg);
			break;
			}
		}
	General.printSIS();
	}
}
