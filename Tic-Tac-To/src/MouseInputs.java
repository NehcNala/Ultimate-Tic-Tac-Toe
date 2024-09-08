import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class MouseInputs extends MouseAdapter {
    private static int clickNumber; SmallerPanel thisPanel;
    public MouseInputs(SmallerPanel jpanel){
        thisPanel = jpanel;
        clickNumber = 0;
    }
    public MouseInputs(){clickNumber = 0;}
    @Override
    public void mousePressed(MouseEvent e) {
        thisPanel.setClicked(true);
        if (!thisPanel.clickedBefore){
            incrementClickNumber();
        }
        thisPanel.Clicked();
    }
    public int getClickNumber(){
        return clickNumber;
    }
    public void incrementClickNumber(){ clickNumber += 1; }
}
