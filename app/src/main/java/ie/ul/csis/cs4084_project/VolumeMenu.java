package ie.ul.csis.cs4084_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class VolumeMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume_menu);
    }

    public void toInputPuzzle1(View view)
    {
        Intent startInputPuzzle1 = new Intent(this, VolumePuzzle1.class) ;

        startActivity(startInputPuzzle1) ;
    }
}
