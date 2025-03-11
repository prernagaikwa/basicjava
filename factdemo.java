import java.awt.*;
import java.awt.event.*;
class Factdemo extends frame implements ActionListener{
    Button b1;
    Label l1,l2;
    TextField t1,t2;
    public Factdemo()
    {
        setTitle("Factorial");
        l1 = new Label ("enter the number");
        t1 = new Textfeield(20);
        l2 = new Label("factoril");
        t2 = new TextField(20);
        b1 =  new Button("click");
        setsize(400,400);
        setlayout(new flowlayout());
        add(l1);
        add (t1);
        add(l2);
        add(t2);
        add(b1);
        b1.addActionListener(this);
        setVisible(true);
    }
    public void ActionPerformed(Actionevent e){
        int num= integer.parsln(e1.getText());
        if(e.getSource ()== b1)
        {
            int fact = 1;
            for(i=num;j>=1;j--)
            fact = fact*i;
            t2setText(String value of (fact));
        }
    }
    public static void main(String[] args);
    factdemo f = new factdemo();
}
}