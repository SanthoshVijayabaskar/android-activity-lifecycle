package lifecycle.activity.com.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    Button btnGotoSecondActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGotoSecondActivity=(Button)findViewById(R.id.btnSecondActivity);

        btnGotoSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(myIntent);
            }
        });

        //Toast.LENGTH_LONG - 3.5 Seconds
        //Toast.LENGTH_SHORT - 2 Seconds
        Toast.makeText(getApplicationContext(),"Executing onCreate",Toast.LENGTH_LONG).show();
        Log.i(TAG,"OnCreate()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(),"Executing onRestart",Toast.LENGTH_LONG).show();
        Log.i(TAG,"onRestart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(),"Executing onStart",Toast.LENGTH_LONG).show();
        Log.i(TAG,"onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(),"Executing onResume",Toast.LENGTH_LONG).show();
        Log.i(TAG,"onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(),"Executing onPause",Toast.LENGTH_LONG).show();
        Log.i(TAG,"onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(),"Executing onStop",Toast.LENGTH_LONG).show();
        Log.i(TAG,"onStop()");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"Executing onDestroy",Toast.LENGTH_LONG).show();
        Log.i(TAG,"onDestroy()");
    }
}
