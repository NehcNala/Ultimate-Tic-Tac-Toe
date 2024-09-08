import java.util.Scanner;
public class Game {

    public Game(){
        Scanner scan = new Scanner(System.in);
        int gamePicked = scan.nextInt();
        if(gamePicked == 1) {
            TTTScreen gameScreen = new TTTScreen();
            gameScreen.addPanels();
            new TTTWindow(gameScreen, "Tic-Tac-Toe");
        }
        if(gamePicked == 2){
            TTTScreen gameScreen = new TTTScreen(3,3);
            gameScreen.addUltimatePanels();
            new TTTWindow(gameScreen, "Ultimate Tic-Tac-Toe");
        }
    }
}
