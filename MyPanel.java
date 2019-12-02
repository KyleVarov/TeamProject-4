import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * 여기에 MyPanel 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class MyPanel extends JPanel implements ActionListener
{
    JButton mbAdd;
    JButton mbClear;
    
    JTextField tfName;
    JTextField tfDept;
    JTextField tfAddress;
    
    JComboBox cbSchoolYear;
    
    JTextArea ta;
    public MyPanel(){
        String[] schoolYear=new String[]{"1학년","2학년","3학년","4학년"};
        JLabel mlName = new JLabel("이름");
        JLabel mlDept = new JLabel("학과");
        JLabel mlAddress = new JLabel("주소");
        JLabel mlSchoolYear=new JLabel("학년");
        
        tfName = new JTextField(18);
        tfDept = new JTextField(18);
        tfAddress = new JTextField(18);
        
        cbSchoolYear=new JComboBox(schoolYear);
        
        mbAdd = new JButton("추가");
        mbClear=new JButton("Clear");
        
        mbAdd.addActionListener(this);
        ta=new JTextArea(20,20);
        this.add(mlName);
        this.add(tfName);
        
        this.add(mlDept);
        this.add(tfDept);
        
        this.add(mlAddress);
        this.add(tfAddress);
        
        this.add(mlSchoolYear);
        this.add(cbSchoolYear);
        this.add(mbAdd);
        this.add(mbClear);
        
        this.add(ta);
    }
    
    public void actionPerformed(ActionEvent e){
        JButton bt = (JButton)e.getSource();
        if(bt.equals(mbAdd)){
            String text = "" + tfName.getText() + "\n" + "" + tfDept.getText() + 
            "\n" + "" + cbSchoolYear.getSelectedItem()+ "\n"+ ""+ tfAddress.getText();
            
            ta.append(text);
        }
    }
}
