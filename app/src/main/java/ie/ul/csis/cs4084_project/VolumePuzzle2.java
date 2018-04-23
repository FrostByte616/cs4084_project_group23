package ie.ul.csis.cs4084_project;

import android.content.Context;
import android.content.DialogInterface;
import android.media.AudioManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VolumePuzzle2 extends AppCompatActivity {

    private Button volume2Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume_puzzle2);

        volume2Button = (Button) findViewById(R.id.Volume2Button);

        volume2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(VolumePuzzle2.this);

                if(checkVol2() == true)
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

    public boolean checkVol2()
    {
        AudioManager audio = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
        int currentVolume = audio.getStreamVolume(AudioManager.STREAM_RING);
        int maxVolume = audio.getStreamMaxVolume(AudioManager.STREAM_RING);

        if(currentVolume == (maxVolume-maxVolume))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
