import javax.swing.*;
/**
 * TextFieldFrame에 대한 클래스
 * 
 * @author (2017315056 이토아야카) 
 * @version (2019.12.02)
 */
public class TextFieldFrame extends JFrame
{
    public MyPanel mp;
    public TextFieldFrame(){
        this.setTitle("실습_4");
        this.setSize(250,350);
        
        mp = new MyPanel();
        this.add(mp);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
