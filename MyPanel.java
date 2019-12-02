import javax.swing.*;
import java.awt.*;
/**
 * 여기에 MyPanel 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class MyPanel extends JPanel
{
    public MyPanel(){
        String[] schoolYear=new String[]{"1학년","2학년","3학년","4학년"};
        JLabel mlName = new JLabel("이름");
        JLabel mlDept = new JLabel("학과");
        JLabel mlAddress = new JLabel("주소");
        JLabel mlSchoolYear=new JLabel("학년");
        
        JTextField tfName = new JTextField(18);
        JTextField tfDept = new JTextField(18);
        JTextField tfAddress = new JTextField(18);
        
        JComboBox cbSchoolYear=new JComboBox(schoolYear);
        
        JButton mbAdd=new JButton("추가");
        JButton mbClear=new JButton("Clear");
        
        JTextArea ta=new JTextArea(20,20);
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
}
