import javax.swing.JFrame;
public class TTTWindow {
    private JFrame jframe;
    public TTTWindow(TTTScreen gameScreen, String Title){
        jframe = new JFrame(Title);
        jframe.setSize(600,600);
        jframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jframe.add(gameScreen);
        jframe.setVisible(true);
    }
}
