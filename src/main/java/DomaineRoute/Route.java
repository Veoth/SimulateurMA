package DomaineRoute;

/**
 * Created by 21206989 on 27/03/2015.
 */
public class Route {
    private int x;
    private int y;
    private int longueurMetre;
    private int largeurMetre;

    public Route(int x, int y, int largeurMetre, int longueurMetre) {
        this.y = y;
        this.x = x;
        this.longueurMetre = longueurMetre;
        this.largeurMetre = largeurMetre;
    }

    public int getLargeurMetre() {
        return largeurMetre;
    }

    public int getLongueurMetre() {
        return longueurMetre;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }
}
