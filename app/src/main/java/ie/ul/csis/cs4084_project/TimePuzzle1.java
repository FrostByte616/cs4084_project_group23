package ie.ul.csis.cs4084_project;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AlertDialog;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TimePuzzle1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_puzzle1);
    }

    SimpleDateFormat simpleDateFormat;
    Calendar calander;

    public SimpleDateFormat getTime()
    {
        calander = Calendar.getInstance();
        simpleDateFormat = new SimpleDateFormat("HH:mm:ss");

        return simpleDateFormat ;
    }

    public boolean compareDate(SimpleDateFormat timeNow)
    {
        String winTime[] = {"12", "00", "00"} ;
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

    public void correctAnswer()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Congratulations!");
        builder.setMessage("You solved the puzzle - please continue to the menu.");
        builder.setPositiveButton("Great!", null);
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void incorrectAnswer()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Try Again!");
        builder.setMessage("You did not solve the puzzle - please try again.");
        builder.setPositiveButton("INCORRECT!", null);
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void checkIfCorrect(View view)
    {
        if(compareDate(getTime()) == true)
            correctAnswer();
        else
            incorrectAnswer();
    }


}
