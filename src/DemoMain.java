/**
 * Created by Administrator on 12/5/2016.
 */
import java.awt.*;
import java.applet.*;

/**
 * My Demo Class
 *
 * <applet code="sim" width=300 height=300>
 * </applet>
 */
public class DemoMain extends Applet
{
    //test
    String msg=" hello world";
    public void init()
    {
        msg+="init()--->";
        setBackground(Color.green);
    }
    public void start()
    {
        msg+="start()--->";
        setForeground(Color.blue);

    }
    public void paint(Graphics g)
    {
        msg+="paint()--->";
        g.drawString(msg,200,50);
    }
}