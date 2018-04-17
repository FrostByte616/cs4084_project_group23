package ie.ul.csis.cs4084_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void toTiltMenu(View view)
    {
        Intent startNewActivity = new Intent(this, TiltMenuActivity.class) ;

        startActivity(startNewActivity) ;
    }

    public void toInputMenu(View view)
    {
        Intent startNewActivity = new Intent(this, InputMenu.class) ;

        startActivity(startNewActivity) ;
    }

    public void toVolumeMenu(View view)
    {
        Intent startNewActivity = new Intent(this, VolumeMenu.class) ;

        startActivity(startNewActivity) ;
    }

    public void toTimeMenu(View view)
    {
        Intent startNewActivity = new Intent(this, TimeMenu.class) ;

        startActivity(startNewActivity) ;
    }
}
