package ie.ul.csis.cs4084_project;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.widget.Toast;

public class TiltPuzzle1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tilt_puzzle1);
    }

    public boolean tp1 = false;

    public int getScreenOrientation()
    {
        Display screenOrientation = getWindowManager().getDefaultDisplay();
        int orientation = Configuration.ORIENTATION_UNDEFINED;
        if(screenOrientation.getWidth()==screenOrientation.getHeight()){
            orientation = Configuration.ORIENTATION_SQUARE;
            //Do something

        } else{
            if(screenOrientation.getWidth() < screenOrientation.getHeight()){
                orientation = Configuration.ORIENTATION_PORTRAIT;
                //Do something

            }else {
                orientation = Configuration.ORIENTATION_LANDSCAPE;
                //Do something

            }
        }
        return orientation;
    }

    @Override
    public void onConfigurationChanged(Configuration newOrientation) {
        super.onConfigurationChanged(newOrientation);

        if(getScreenOrientation() == Configuration.ORIENTATION_LANDSCAPE)
            tp1=true;

        if(tp1 == true)

        {
            // Creating alert Dialog with one Button
            AlertDialog alertDialog = new AlertDialog.Builder(
                    TiltPuzzle1.this).create();
            // Setting Dialog Title
            alertDialog.setTitle("Alert Dialog");
            // Setting Dialog Message
            alertDialog.setMessage("Welcome to AndroidHive.info");
            // Setting Icon to Dialog
            alertDialog.setIcon(R.drawable.tick);
            // Setting OK Button
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    // Write your code here to execute after dialog
                    // closed
                    Toast.makeText(getApplicationContext(), "You clicked on OK", Toast.LENGTH_SHORT).show();
                }
            });
            // Showing Alert Message
            alertDialog.show();
        }
    }
}
