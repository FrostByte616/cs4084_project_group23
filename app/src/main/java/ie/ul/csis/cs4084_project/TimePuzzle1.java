package ie.ul.csis.cs4084_project;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AlertDialog;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TimePuzzle1 extends AppCompatActivity {

    private Button time1Button;
    private TextView time1Correct;
    //private TextView time1Incorrect;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_puzzle1);

        time1Button = (Button) findViewById(R.id.Time1Button);
        time1Correct = (TextView) findViewById(R.id.Time1Correct);
       // time1Incorrect = (TextView) findViewById(R.id.Time1Incorrect);

        time1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(TimePuzzle1.this);


                if(compareDate(getTime()) != true)
                {
                    builder.setCancelable(true);
                    builder.setTitle("Incorrect!");
                    builder.setMessage("Please try again!");
                }
                else
                {
                    builder.setCancelable(true);
                    builder.setTitle("Correct!");
                    builder.setMessage("You've Solved the Puzzle!");
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
                        time1Correct.setVisibility(View.VISIBLE);
                    }
                });

                builder.show();
            }
        });

    }

   SimpleDateFormat simpleDateFormat;
    Calendar calender;

    public SimpleDateFormat getTime()
    {
        calender = Calendar.getInstance();
        simpleDateFormat = new SimpleDateFormat("HH:mm:ss");

        return simpleDateFormat ;
    }

    public boolean compareDate(SimpleDateFormat timeNow)
    {
        String winTime[] = {"13", "00", "00"} ;
        String currentTime[] = TextUtils.split(timeNow.toString(), ":") ;

        if (currentTime[0].equals(winTime[0]))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
