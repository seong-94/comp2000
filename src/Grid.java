import java.awt.*;

public class Grid {
    // fields
    Cell[][] cells = new Cell[20][20];

    // constructor
    public Grid() {
        for (int i = 0; i < cells.length; i++) { // this is for x,y position
            for (int j = 0; j < cells[i].length; j++) {
                cells[i][j] = new Cell(10 + (35 * i), 10 + (35 * j));
            }
        }
    }

    // method
    public void paint(Graphics g,Point mousePos) {
        for (int i = 0; i < cells.length; i++) { // this is for x,y position
            for (int j = 0; j < cells[i].length; j ++) {
                cells[i][j].paint(g, mousePos);
            }
        }
    }
    public Cell cellAtLocation(int a, int b){
        return cells[a][b];
    }

} 
