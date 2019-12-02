import javax.swing.*;
/**
 * TextFieldFrame 클래스는 Frame을 구성하는 클래스입니다. 
 * 
 * @author (2018243087 정찬호/2017315056 이토아야카/2017605038 스피겔 크릴) 
 * @version (2019.12.02)
 */
public class TextFieldFrame extends JFrame
{
    public MyPanel mp;
    public TextFieldFrame(){
        this.setTitle("실습_4");
        this.setSize(260,350);
        
        mp = new MyPanel();
        this.add(mp);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
