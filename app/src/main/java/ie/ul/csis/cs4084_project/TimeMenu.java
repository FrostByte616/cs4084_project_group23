package ie.ul.csis.cs4084_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TimeMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_menu);
    }

    public void toTimePuzzle1(View view)
    {
        Intent startTimePuzzle1 = new Intent(this, TimePuzzle1.class) ;

        startActivity(startTimePuzzle1) ;
    }
}
