import javax.swing.JPanel;
import java.awt.GridLayout;
public class TTTScreen extends JPanel{
    public static final UltimatePanel[] largerPanels = new UltimatePanel[9];

    private int rows = 3; private int cols = 3;

    public TTTScreen(int rows, int cols)  {
        setLayout(new GridLayout(rows,cols));
        setVisible(true);
    }
    public TTTScreen(){
        setLayout(new GridLayout(1,1));
        setVisible(true);
    }
    public void addPanels(UltimatePanel a){
        for(int i = 0; i < rows; i += 1) {
            for (int j = 0; j < cols; j += 1) {
                System.out.println("hi");
                SmallerPanel sm = new SmallerPanel(i, j, false);
                a.smallerPanels[i * rows + j] = sm;
                a.add(sm);
            }
        }
    }
    public void addPanels(){
        UltimatePanel sm = new UltimatePanel(true);
        System.out.println("hi");
        sm.setSize(600,600);
        add(sm);
        sm.setLayout(new GridLayout(rows,cols));
        addPanels(sm);
        largerPanels[0] = sm;
    }
    public void addUltimatePanels(){
        for(int i = 0; i < rows; i += 1) {
            for (int j = 0; j < cols; j += 1) {
                UltimatePanel sm = new UltimatePanel(true);
                add(sm);
                sm.setLayout(new GridLayout(rows,cols));
                addPanels(sm);
                largerPanels[i * rows + j] = sm;
            }
        }

    }
}
