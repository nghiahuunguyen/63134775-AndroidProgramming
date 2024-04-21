package till.edu.explicitintents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Lấy giá trị tên đăng nhập từ Intent
        String username = getIntent().getStringExtra("username");

        // Hiển thị tên đăng nhập trong TextView
        TextView textViewUsername = findViewById(R.id.tvten);
        textViewUsername.setText("" + username);
    }
}