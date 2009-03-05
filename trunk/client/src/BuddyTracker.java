
import javax.microedition.location.LocationException;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gussoh
 */
public class BuddyTracker extends MIDlet {

    Positioning positioning;

    public BuddyTracker() {
        try {
            positioning = new Positioning();
        } catch (LocationException ex) {
            ex.printStackTrace();
        }
    }

    protected void startApp() throws MIDletStateChangeException {
        if (!positioning.isAlive()) {
            positioning.start();
        }
    }

    protected void pauseApp() {
        positioning.stop();

    }

    protected void destroyApp(boolean unconditional) throws MIDletStateChangeException {
        positioning.stop();
    }
}
