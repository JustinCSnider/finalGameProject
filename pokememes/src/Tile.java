import java.awt.Color;
public class Tile extends Rectangle
{
    private static final int HEIGHT = 64, WIDTH = 64;
    private String type;
    private int chanceOfMeme;
    public Tile(int x, int y, int cm, String t){
        super(x,y,HEIGHT,WIDTH);
        type = t;
        chanceOfMeme = cm;
    }
    public Tile(int x, int y, int cm, String t, Color c){
        super(x,y,HEIGHT,WIDTH);
        type = t;
        chanceOfMeme = cm;
        this.setBackground(c);
    }
}
