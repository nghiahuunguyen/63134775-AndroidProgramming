package till.edu.explicitintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void xuly(View view) {
        EditText edtten = findViewById(R.id.edtten);
        EditText edtmatkhau = findViewById(R.id.editTextTextPassword);

        String username = edtten.getText().toString();
        String password = edtmatkhau.getText().toString();

        if (username.equals("nguyenhuunghia") && password.equals("123")) {
            Intent intent = new Intent(this, ActivityHome.class);
            intent.putExtra("username", username);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Thông tin đăng nhập không hợp lệ", Toast.LENGTH_SHORT).show();
        }
    }
}