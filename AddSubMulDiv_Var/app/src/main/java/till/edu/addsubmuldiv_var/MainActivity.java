package till.edu.addsubmuldiv_var;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //khai báo các đối tượng tướng ứng các điều khiển
    EditText edtsoa;
    EditText edtsob;
    Button btncong,btntru,btnnhan,btnchia;
    TextView tvkq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //tim view
        timview();
        //gắn các bộ lắng nghe
        btncong.setOnClickListener(bolangnghe_XulyCong);
        btntru.setOnClickListener(bolangnghe_Xulytru);
        btnnhan.setOnClickListener(bolangnghe_Xulynhan);
        btnchia.setOnClickListener(bolangnghe_XulyChia);
    }
    //tạo ra bộ lắng nghe
    View.OnClickListener bolangnghe_XulyCong = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String sothu1 =edtsoa.getText().toString();
            String sothu2=edtsob.getText().toString();
            float soa=Float.parseFloat(sothu1);
            float sob=Float.parseFloat(sothu2);
            float s=soa+sob;
            String kq= String.valueOf(s);
            tvkq.setText(kq);
        }
    };
    View.OnClickListener bolangnghe_Xulytru = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String sothu1 =edtsoa.getText().toString();
            String sothu2=edtsob.getText().toString();
            float soa=Float.parseFloat(sothu1);
            float sob=Float.parseFloat(sothu2);
            float s=soa+sob;
            String kq= String.valueOf(s);
            tvkq.setText(kq);
        }
    };
    View.OnClickListener bolangnghe_Xulynhan = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String sothu1 =edtsoa.getText().toString();
            String sothu2=edtsob.getText().toString();
            float soa=Float.parseFloat(sothu1);
            float sob=Float.parseFloat(sothu2);
            float s=soa*sob;
            String kq= String.valueOf(s);
            tvkq.setText(kq);
        }
    };
    View.OnClickListener bolangnghe_XulyChia = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String sothu1 =edtsoa.getText().toString();
            String sothu2=edtsob.getText().toString();
            float soa=Float.parseFloat(sothu1);
            float sob=Float.parseFloat(sothu2);
            float s=soa/sob;
            String kq= String.valueOf(s);
            tvkq.setText(kq);
        }
    };
    void timview(){
        edtsoa = (EditText) findViewById(R.id.edtso1);
        edtsob = (EditText) findViewById(R.id.edtso2);
        btncong = (Button) findViewById(R.id.btncong);
        btntru = (Button) findViewById(R.id.btntru);
        btnnhan = (Button) findViewById(R.id.btnnhan);
        btnchia = (Button) findViewById(R.id.btnchia);
        tvkq = (TextView) findViewById(R.id.edtKQ);
    }

}