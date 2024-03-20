package till.edu.bai1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button dk =findViewById(R.id.button);
        dk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });
    }
    void login(){
        EditText name =findViewById(R.id.edtname);
        EditText pass= findViewById(R.id.edtpass);
        String namee=name.getText().toString();
        String mk=pass.getText().toString();
        if (namee.equals("maicuongtho") && mk.equals("Cntt60ntu!")) {
            // Username and password are correct
            Toast.makeText(this, "User and Password are correct", Toast.LENGTH_SHORT).show();
        } else {
            // Username or password is wrong
            Toast.makeText(this, "User and Password are wrong", Toast.LENGTH_SHORT).show();
        }

    }
}