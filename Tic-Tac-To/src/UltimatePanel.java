import javax.swing.JPanel;
import java.awt.*;

public class UltimatePanel extends JPanel {
    Dimension boxSize; int UltimateOx1; int UltimateOy1; int UltimateXx1; int UltimateXx2;
    int UltimateXy1; int UltimateXy2;
    boolean isUltimate;
    public final SmallerPanel[] smallerPanels = new SmallerPanel[9];
    private char XO;
    protected UltimatePanel(boolean isUltimate){
        setSize(60,60);
        this.isUltimate = isUltimate;
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        boxSize = getSize();
        drawO(g, UltimateOx1, UltimateOy1);
        drawX(g, UltimateXx1, UltimateXy1, UltimateXx2, UltimateXy2);
        repaint();
    }
    public void drawO(Graphics g, int drawOx, int drawOy){
        g.drawOval(boxSize.width / 4,boxSize.height / 4, drawOx, drawOy);
    }
    public void drawX(Graphics g, int drawXx1, int drawXy1, int drawXx2, int drawXy2){
        g.drawLine(drawXx1, drawXy1, drawXx2, drawXy2);
        g.drawLine(drawXx1 + boxSize.width / 2, drawXy1, drawXx2 - boxSize.width / 2, drawXy2);
    }
    public void won(char win){
        if(win == 'X'){
            UltimateXx2 = boxSize.width / 4 * 3;
            UltimateXy2 = boxSize.height / 4  * 3;
            UltimateXx1 = boxSize.width / 4;
            UltimateXy1 = boxSize.height / 4;
            XO = 'X';
            repaint();
        }
        if(win == 'O'){
            UltimateOx1 = boxSize.width / 2;
            UltimateOy1 = boxSize.height / 2;
            XO = 'O';
            repaint();
        }
    }
    public int checkXO(){
        if(XO == 'X'){
            return 1;
        }
        else if(XO =='O'){
            return 2;
        }
        return 0;
    }

}
