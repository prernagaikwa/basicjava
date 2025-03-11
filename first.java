import java.awt.*;
import java.util.*;
class first extends Frame
{
first()
{
Button b=new Button ("click me");
b.setBounds(30,100,80,30);
add(b);
setSize(300,300);
setLayout(null);
//SetVisible(true);
setVisible(true);
setDefaultCloserOpration(JFrame.EXIST_ON_CN)
}
public static void main(String[] args)
{
first firstFrame = new first();
}
}
