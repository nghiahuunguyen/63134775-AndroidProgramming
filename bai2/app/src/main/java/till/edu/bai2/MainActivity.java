package till.edu.bai2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button tinh= findViewById(R.id.button);
        tinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tinh();
            }
        });
    }
    void tinh(){
        EditText nhap=findViewById(R.id.edtnhap);
        Button so13=findViewById(R.id.radioButton13);
        Button so15=findViewById(R.id.radioButton15);
        Button so18=findViewById(R.id.radioButton18);
        TextView KQ=findViewById(R.id.edtkq);
        int nhapmoi =Integer.parseInt(nhap.getText().toString());
        if (so13.createAccessibilityNodeInfo().isChecked()){
            float kq=nhapmoi*13/100;
            KQ.setText(String.format("Your tip will be %.2f",kq));

        }
        if (so15.createAccessibilityNodeInfo().isChecked()){
            float kq=nhapmoi*15/100;
            KQ.setText(String.format("Your tip will be %.2f",kq));

        }
        if (so18.createAccessibilityNodeInfo().isChecked()){
            float kq=nhapmoi*18/100;
            KQ.setText(String.format("Your tip will be %.2f",kq));

        }
    }
}