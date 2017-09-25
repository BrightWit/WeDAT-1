/**
 * Project: WeDAT (We Did a Thing)
 * Class: CSC 40... todo correct
 * Authors: Heather ?. Giotis & Charles T. Kirby
 */

package giotiskirby.wedat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.bluetooth.BluetoothAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    BluetoothAdapter ba = BluetoothAdapter.getDefaultAdapter();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

    }
    //Go to the main screen
    public void gotomain(View view) {setContentView(R.layout.main);}
    //Open the menu
    public void gotomenu(View view) {setContentView(R.layout.menu);}
    //Open connection screen
    public void gotoconnect(View view) {setContentView(R.layout.connect);}
    //Method that detects if bluetooth is on or off

    /**
     * Method designed to turn the bluetooth on/off and change the related icon accordingly
     *
     * Uses disable() line 932 from BluetoothAdapter.java
     * Uses enable() line 896 from BluetoothAdapter.java
     * Uses isEnabled() line 617 from BluetoothAdapter.java
     *
     * Target is an "ImageButton"
     * "ImageButton" extends "ImageView"
     * Uses setBackgroundResource() line 18254 from View.java
     *
     * @param view some parameter required for all methods used by XML
     */
    public void bluetoothonoff(View view) {
        //todo idk how to direct it to the image that's being changed
        //ImageButton thatbutton = (ImageButton)findViewById(R.id.btbutton);
        //If adaptor exists
        if (ba != null) {
            //If on then turn off & set to off image
            if (ba.isEnabled()) { view.setBackgroundResource(R.drawable.btbbase); ba.disable(); }
            //If off then turn on & set to on image
            else { view.setBackgroundResource(R.drawable.btbglowyblue); ba.enable(); }
        }
    }

    public void bluetoothonoff2(View view) {
        //todo idk how to direct it to the image that's being changed
        //ImageButton thatbutton = (ImageButton)findViewById(R.id.btbutton);
        //If adaptor exists
        if (ba != null) {
            //If on then turn off & set to off image
            if (ba.isEnabled()) { view.setBackgroundResource(R.drawable.btbbase); ba.disable(); }
            //If off then turn on & set to on image
            else { view.setBackgroundResource(R.drawable.btbglowyblue); ba.enable(); }
        }
    }

    /**
     * getState() line 796 from BluetoothAdapter.java
     * STATE_OFF            10  Red
     * STATE_ON             12  Blue
     * STATE_TURNING_OFF    13  Blinking Red
     * STATE_TURNING_ON     11  Blinking Blue
     */


}
