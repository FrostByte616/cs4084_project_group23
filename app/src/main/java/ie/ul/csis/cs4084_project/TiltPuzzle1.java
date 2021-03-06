package ie.ul.csis.cs4084_project;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TiltPuzzle1 extends AppCompatActivity {

    private Button tilt1Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tilt_puzzle1);

        tilt1Button = (Button) findViewById(R.id.Tilt1Button);

        tilt1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                android.support.v7.app.AlertDialog.Builder builder = new android.support.v7.app.AlertDialog.Builder(TiltPuzzle1.this);

                if(checkTilt1() == true)
                {
                    builder.setCancelable(true);
                    builder.setTitle("Correct!");
                    builder.setMessage("You've Solved the Puzzle!");
                }
                else
                {
                    builder.setCancelable(true);
                    builder.setTitle("Incorrect!");
                    builder.setMessage("Please try again!");
                }


                //builder.setCancelable(true);
                //builder.setTitle("Correct!");
                //builder.setMessage("You've Solved the Puzzle!");

                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });

                builder.show();
            }
        });
    }

    public boolean checkTilt1()
    {
        Display screenOrientation = getWindowManager().getDefaultDisplay();
        int orientation ;

        if(screenOrientation.getWidth() < screenOrientation.getHeight())
            orientation = Configuration.ORIENTATION_PORTRAIT;
        else
            orientation = Configuration.ORIENTATION_LANDSCAPE;

        if(orientation == 2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
