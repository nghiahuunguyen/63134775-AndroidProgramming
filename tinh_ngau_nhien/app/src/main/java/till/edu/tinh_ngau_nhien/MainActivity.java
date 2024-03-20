package till.edu.tinh_ngau_nhien;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtSo1;
    EditText edtSo2;
    TextView txtKQ;

    Button button;
    ImageView cong;
    ImageView tru;
    ImageView nhan;
    ImageView chia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtSo1 = findViewById(R.id.edtso1);
        edtSo2 = findViewById(R.id.edtso2);
        txtKQ = findViewById(R.id.edtkq);

        button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                taodulieu();
            }
        });

        cong = findViewById(R.id.cong);
        tru = findViewById(R.id.tru);
        nhan = findViewById(R.id.nhan);
        chia = findViewById(R.id.chia);

        cong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cong();
            }
        });

        tru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tru();
            }
        });

        nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nhan();
            }
        });

        chia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chia();
            }
        });
    }

    void taodulieu() {
        int randomNumber1 = (int) (Math.random() * 10) + 1;
        int randomNumber2 = (int) (Math.random() * 10) + 1;

        edtSo1.setText(String.valueOf(randomNumber1));
        edtSo2.setText(String.valueOf(randomNumber2));
    }

    void cong() {
        int so1 = Integer.parseInt(edtSo1.getText().toString());
        int so2 = Integer.parseInt(edtSo2.getText().toString());
        int ketQua = so1 + so2;
        txtKQ.setText("" + ketQua);
    }

    void tru() {
        int so1 = Integer.parseInt(edtSo1.getText().toString());
        int so2 = Integer.parseInt(edtSo2.getText().toString());
        int ketQua = so1 - so2;
        txtKQ.setText("" + ketQua);
    }

    void nhan() {
        int so1 = Integer.parseInt(edtSo1.getText().toString());
        int so2 = Integer.parseInt(edtSo2.getText().toString());
        int ketQua = so1 * so2;
        txtKQ.setText("" + ketQua);
    }

    void chia() {
        int so1 = Integer.parseInt(edtSo1.getText().toString());
        int so2 = Integer.parseInt(edtSo2.getText().toString());
        float ketQua = so1 / so2;
        txtKQ.setText("" + ketQua);
    }
}