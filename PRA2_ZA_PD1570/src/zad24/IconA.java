package zad24;

import javax.swing.*;
import java.awt.*;
import static javax.swing.SwingConstants.*;

class IconA implements Icon {

  private Color color;
  private int w = 30;
  //private boolean frame;

  IconA(Color c){
		  //, boolean frame) {
    color = c;
   // this.frame = frame;
  }

  public void paintIcon(Component c, Graphics g, int x, int y) {
    Color old = g.getColor();
    g.setColor(color);
    w = ((JComponent) c).getHeight() / 2;
    int p = w / 4, d = w / 2;
    g.fillOval(x + p, y + p, d, d);
   // if (frame) g.drawRect(x, y, w - 1, w - 1);
    //g.setColor(old);
  }

  public int getIconWidth() {
    return w;
  }

  public int getIconHeight() {
    return w;
  }

}