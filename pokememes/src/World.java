import javax.swing.*;
import java.awt.Color;

public class World extends JComponent
{
    private Tile[][] grid;
    private int width, height;
    private int gwidth, gheight;
    public World(int w, int h, int gw, int gh){        
        width = w;
        height = h;
        gwidth = gw;
        gheight = gh;
        this.setBounds(0,0,w,h);
        grid = new Tile[w][h];
        this.setBackground(Color.BLACK);
        fillGrid();
        displayGrid();
    }

    private void fillGrid(){
        for(int x=0; x<gwidth; x++){
            for(int y=0; y<gheight; y++){
                grid[x][y] = new Tile(x*64,y*64, 0, "Grass"); 
            }
        }
    }
    
    public void displayGrid(){
        for(int x=0; x<gwidth; x++){
            for(int y=0; y<gheight; y++){
                this.add(grid[x][y]);
                this.setVisible(true);
            }
        }
    }
    
    public void placeGridPoint(int x, int y, Tile t,JFrame win){
        grid[x][y].setVisible(false);
        grid[x][y] = t;
        t.setBounds(x * 64, y * 64, 64, 64);
        t.setVisible(true);
        win.add(t);
    }
    public Tile getGridPoint(int x, int y){
        return grid[x][y];
    }
    
    public static void main(String[]args){
        JFrame win = new JFrame();
        win.setBounds(0,0,500,500);
        win.setLayout(null);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        World map = new World(500,500,25,25);
        win.add(map);
        map.placeGridPoint(0,0,new Tile(0,0,0,"Grass", new Color(0,255,0)), win);
        map.placeGridPoint(0,2,new Tile(0,0,0,"Grass", new Color(0,255,0)), win);
        System.out.println(map.getGridPoint(0,0));
        win.setVisible(true);
        win.repaint();
        win.repaint();
    }
}





