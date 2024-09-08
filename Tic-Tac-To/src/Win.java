import java.util.Arrays;
import javax.swing.JPanel;

public class Win {
    private int CurrentPanel;
    public void checkWin(){
        int[] TTTvalues = new int[9];
        CurrentPanel = 0;
        UltimatePanel s = TTTScreen.largerPanels[0];
        if (s.isUltimate) {
            for(UltimatePanel j :TTTScreen.largerPanels) {
                int i = 0;
                if(j == null){
                    return;
                }
                for (SmallerPanel ss : j.smallerPanels) {
                    TTTvalues[i] = ss.checkXO();
                    i++;
                }
                System.out.println(Arrays.toString(TTTvalues));
                WinningSide(TTTvalues);
                CurrentPanel++;
            }
        }
        else {
            int i = 0;
            for(UltimatePanel j :TTTScreen.largerPanels) {
                TTTvalues[i] = j.checkXO();
                i += 1;
            }
            System.out.println(Arrays.toString(TTTvalues));
            WinningSide(TTTvalues);
        }
    }

    private void WinningSide(int[] TTTvalues) {
        int[] winningNumbers = detectWin(TTTvalues);
        if (winningNumbers != null) {
            if (TTTvalues[winningNumbers[0]] == 1) {
                System.out.println("X wins");
                TTTScreen.largerPanels[CurrentPanel].won('X');
            }
            if (TTTvalues[winningNumbers[0]] == 2) {
                System.out.println("O wins");
                TTTScreen.largerPanels[CurrentPanel].won('O');
            }
        }
    }


    private int[] detectWin(int[] a){
        int[] winningNumbers = new int[3];
        if(a[0] == a[1] && a[0] == a[2] && a[0] != 0){
            System.out.println(1);
            winningNumbers[0] = 0;
            winningNumbers[1] = 1;
            winningNumbers[2] = 2;

            return winningNumbers;
        }
        if(a[3] == a[4] && a[3] == a[5] && a[3] != 0){
            System.out.println(2);
            winningNumbers[0] = 3;
            winningNumbers[1] = 4;
            winningNumbers[2] = 5;
            return winningNumbers;
        }
        if(a[6] == a[7] && a[6] == a[8] && a[6] != 0){
            System.out.println(3);
            winningNumbers[0] = 6;
            winningNumbers[1] = 7;
            winningNumbers[2] = 8;
            return winningNumbers;
        }
        if(a[0] == a[3] && a[0] == a[6] && a[0] != 0){
            System.out.println(4);
            winningNumbers[0] = 0;
            winningNumbers[1] = 3;
            winningNumbers[2] = 6;
            return winningNumbers;
        }if(a[1] == a[4] && a[1] == a[7] && a[1] != 0){
            System.out.println(5);
            winningNumbers[0] = 1;
            winningNumbers[1] = 4;
            winningNumbers[2] = 7;
            return winningNumbers;
        }if(a[2] == a[5] && a[2] == a[8] && a[2] != 0){
            System.out.println(6);
            winningNumbers[0] = 2;
            winningNumbers[1] = 5;
            winningNumbers[2] = 8;
            return winningNumbers;
        }if(a[0] == a[4] && a[0]== a[8] && a[0] != 0){
            System.out.println(7);
            winningNumbers[0] = 0;
            winningNumbers[1] = 4;
            winningNumbers[2] = 8;
            return winningNumbers;
        }
        if(a[2] == a[4] && a[2] == a[6] && a[2] != 0) {
            System.out.println(8);
            winningNumbers[0] = 2;
            winningNumbers[1] = 4;
            winningNumbers[2] = 6;
            return winningNumbers;
        }
        return null;
    }

}
