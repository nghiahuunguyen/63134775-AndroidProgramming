package till.edu.explicitintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void chuyenmanhinh(View view) {
        Intent manhinhkhac = new Intent(MainActivity.this, ActivityLogin.class);
        startActivity(manhinhkhac);
    }

}