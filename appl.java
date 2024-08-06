import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class appl extends Applet implements KeyListener{
    public static void main(String args[]){
    public void init(){
        setBackground(color.white);
        addKeyListener(this);
    }
    public void keyPressed(KeyEvent e){
        if(e.getKeyCode()==KeyEvent.VK_CONTROL){
            int R=(int)(Math.random()*100)%255;
            int G=(int)(Math.random()*100)%255;
            int B=(int)(Math.random()*100)%255;
            color mycolor=new color(R,G,B);
            this.setBackground(mycolor);
        }
    }
    public void keyReleased(KeyEvent e){}
    public void keyTyped(KeyEvent e){}


}
}