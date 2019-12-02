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
        
        JLabel mlName = new JLabel("이름");
        JLabel mlDept = new JLabel("학과");
        JLabel mlAddress = new JLabel("주소");
        
        JTextField tfName = new JTextField();
        JTextField tfDept = new JTextField();
        JTextField tfAddress = new JTextField();
        
        this.add(mlName);
        this.add(tfName);
        
        this.add(mlDept);
        this.add(tfDept);
        
        this.add(mlAddress);
        this.add(tfAddress);
    }
}
