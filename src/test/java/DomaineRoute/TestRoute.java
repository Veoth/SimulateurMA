package DomaineRoute;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by 21206989 on 27/03/2015.
 */
public class TestRoute {
    private Route maRoute;

    @Before
    public void setUp(){
    }

    @Test
    public void  testCreationRoute() {

        maRoute = new Route(200, 300, 20, 500);
        assertEquals(200, maRoute.getX());
        assertEquals(300, maRoute.getY());
        assertEquals(20, maRoute.getLargeurMetre());
        assertEquals(500, maRoute.getLongueurMetre());
    }
}
