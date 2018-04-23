package ie.ul.csis.cs4084_project;

import android.content.DialogInterface;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;

public class TiltPuzzle2 extends AppCompatActivity {

    private Button tilt2Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tilt_puzzle2);

        tilt2Button = (Button) findViewById(R.id.Tilt2Button);

        tilt2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                android.support.v7.app.AlertDialog.Builder builder = new android.support.v7.app.AlertDialog.Builder(TiltPuzzle2.this);

                if(checkTilt2() == true)
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

    public boolean checkTilt2()
    {
        Display screenOrientation = getWindowManager().getDefaultDisplay();
        int orientation ;

        if(screenOrientation.getWidth() < screenOrientation.getHeight())
            orientation = Configuration.ORIENTATION_PORTRAIT;
        else
            orientation = Configuration.ORIENTATION_LANDSCAPE;

        if(orientation == 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
