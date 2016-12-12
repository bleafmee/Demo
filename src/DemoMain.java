/**
 * Created by Administrator on 12/5/2016.
 */
import java.awt.*;
import java.applet.*;

/**
 * My Demo Class
 *
 * <applet code="sim" width=300 height=350>
 * </applet>
 */
public class DemoMain extends Applet
{
    //test
    String msg=" hello world 123";
    public void init()
    {
        msg+="init()--->";
        setBackground(Color.yellow);
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