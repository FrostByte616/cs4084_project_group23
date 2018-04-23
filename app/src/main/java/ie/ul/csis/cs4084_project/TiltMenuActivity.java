package ie.ul.csis.cs4084_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TiltMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tilt_menu);
    }

    public void toTiltPuzzle1(View view)
    {
        Intent startTiltPuzzle1 = new Intent(this, TiltPuzzle1.class) ;

        startActivity(startTiltPuzzle1) ;
    }

    public void toTiltPuzzle2(View view)
    {
        Intent startTiltPuzzle2 = new Intent(this, TiltPuzzle2.class) ;

        startActivity(startTiltPuzzle2) ;
    }
}
