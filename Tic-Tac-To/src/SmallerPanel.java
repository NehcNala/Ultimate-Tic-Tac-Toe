import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class SmallerPanel extends UltimatePanel{
    int drawOx1; int drawOy1;
    int drawXx2; int drawXy2; int drawXx1; int drawXy1;
    private Boolean isClicked;
    Boolean clickedBefore; Win winChecker;
    private char XO;
    MouseInputs clickNumberGetter = new MouseInputs();
    protected SmallerPanel(int i, int j, boolean isUltimate){
        super(isUltimate);
        winChecker = new Win();
        addMouseListener(new MouseInputs(this) {});
        setSize(60,60);
        setBorder(new LineBorder(Color.BLACK,2));
        clickedBefore = false;
        this.isUltimate = isUltimate;
    }

    public void paintComponent(Graphics g) {
        //super.paintComponent(g);
        boxSize = this.getSize();
        drawX(g, drawXx1, drawXy1, drawXx2, drawXy2);
        drawO(g, drawOx1, drawOy1);
    }
    public void Clicked(){
        if(isClicked() && !clickedBefore){
            if(clickNumberGetter.getClickNumber() % 2 == 0){
                drawOx1 = boxSize.width / 2;
                drawOy1 = boxSize.height / 2;
                clickedBefore = true;
                XO = 'O';
                repaint();
            }
            if(clickNumberGetter.getClickNumber() % 2 == 1){
                drawXx2 = boxSize.width / 4 * 3;
                drawXy2 = boxSize.height / 4  * 3;
                drawXx1 = boxSize.width / 4;
                drawXy1 = boxSize.height / 4;
                clickedBefore = true;
                XO = 'X';
                repaint();
            }
        }
        winChecker.checkWin();
    }
    public Boolean isClicked(){return isClicked;}
    public void setClicked(boolean a){isClicked = a;}
    public int checkXO(){
        if(XO == 'X'){
            return 1;
        }
        else if(XO =='O'){
            return 2;
        }
        return 0;
    }
    public void SubWin(){

    }

}
