package ntu.nghia63134775;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text = findViewById(R.id.edt);
        Button btn = findViewById(R.id.btn);
        TextView t =findViewById(R.id.edt1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = "Email:nghia.nhu.63cntt@ntu.edu.vn" ;
                String txt="SĐT:0366541719";
                text.setText(inputText);
                t.setText(txt);

            }
        });
    }
}