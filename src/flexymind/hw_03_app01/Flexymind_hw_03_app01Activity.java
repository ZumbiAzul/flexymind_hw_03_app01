package flexymind.hw_03_app01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Flexymind_hw_03_app01Activity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    /** Called when the user clicks the Send button */
    public void newActivity(View view) {
        // Do something in response to button
    	Intent intent = new Intent(this, NewActivity.class);
    	startActivity(intent);
    }
    
    public void closeActivity(View view) {
        // Do something in response to button
        finish();
    }
}