package ie.ul.csis.cs4084_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by tjbow on 21/03/2018.
 */

public class TiltMenu extends MainMenu {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void toTiltPuzzle1(View view)
    {
        Intent startNewActivity = new Intent(this, TiltMenuActivity.class) ;

        startActivity(startNewActivity) ;
    }
}
