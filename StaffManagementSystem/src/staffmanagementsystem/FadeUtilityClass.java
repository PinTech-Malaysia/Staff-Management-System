/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staffmanagementsystem;

/**
 *
 * @author User
 */
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;

//this class if for the animation of one frame to other frame
public class FadeUtilityClass {

    private static final int TIME = 200;
    private static final int MILLIS_PER_FRAME = 20;
    private static final float DELTA = MILLIS_PER_FRAME / (float) TIME; //how much the opacity will change on each tick

    /**
     * @param frame the frame to fade in or out
     * @param in true if you are fading in, false if you're fading out
     */
    public static void fade(final JFrame frame, final boolean in) {
        frame.setOpacity(in ? 0f : 1f); //if we're fading in, make sure our opacity is 0, and 1 if we're fading out
        if (in) //set the state back to normal because we might have been minimized
        {
            frame.setState(JFrame.NORMAL);
        }
        final Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            float opacity = in ? 0f : 1f;
            float delta = in ? DELTA : -DELTA;

            @Override
            public void run() {
                opacity += delta; //tweak the opacity
                if (opacity < 0) //we're invisible now
                {
                    frame.setState(JFrame.ICONIFIED); //hide frame
                    frame.setOpacity(1f); //then make it opaque again, so it'll reappear properly if they click the taskbar 
                    timer.cancel(); //stop the timer
                } else if (opacity > 1) //we're fully visible now
                {
                    frame.setOpacity(1f); //make the opacity an even 1.0f
                    timer.cancel(); //stop the timer
                } else {
                    frame.setOpacity(opacity);
                }
            }
        };
        timer.scheduleAtFixedRate(timerTask, MILLIS_PER_FRAME, MILLIS_PER_FRAME);
    }
}
