package ie.ul.csis.cs4084_project;

import android.content.Context;
import android.content.DialogInterface;
import android.media.AudioManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VolumePuzzle1 extends AppCompatActivity {

    private Button volume1Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume_puzzle1);

        volume1Button = (Button) findViewById(R.id.Volume1Button);

        volume1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(VolumePuzzle1.this);

                if(checkVol1() == true)
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


                /*builder.setCancelable(true);
                builder.setTitle("Correct!");
                builder.setMessage("You've Solved the Puzzle!");*/

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


    public boolean checkVol1()
    {
        AudioManager audio = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
        int currentVolume = audio.getStreamVolume(AudioManager.STREAM_RING);
        int maxVolume = audio.getStreamMaxVolume(AudioManager.STREAM_RING);

        if(currentVolume == maxVolume)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
