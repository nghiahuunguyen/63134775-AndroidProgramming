package till.edu.addsubmuldiv_anynomous;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //khai báo các đối tượng gắn vs đk tương ứng
    EditText editTextso1;
    EditText editTextso2;
    EditText editTextkq;
    Button nutcong,nuttru,nutchia,nutnhan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timdieukhien();
        //gắn bộ lắng nghe sự kiện và code xử lý
        View.OnClickListener bolangnghecong = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sothu1 =editTextso1.getText().toString();
                String sothu2=editTextso2.getText().toString();
                float soa=Float.parseFloat(sothu1);
                float sob=Float.parseFloat(sothu2);
                float s=soa+sob;
                String kq= String.valueOf(s);
                editTextkq.setText(kq);
            }
        };
        nutcong.setOnClickListener(bolangnghecong);
        View.OnClickListener bolangnghetru = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sothu1 =editTextso1.getText().toString();
                String sothu2=editTextso2.getText().toString();
                float soa=Float.parseFloat(sothu1);
                float sob=Float.parseFloat(sothu2);
                float s=soa-sob;
                String kq= String.valueOf(s);
                editTextkq.setText(kq);
            }
        };
        nuttru.setOnClickListener(bolangnghetru);
        View.OnClickListener bolangnghenhan = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sothu1 =editTextso1.getText().toString();
                String sothu2=editTextso2.getText().toString();
                float soa=Float.parseFloat(sothu1);
                float sob=Float.parseFloat(sothu2);
                float s=soa*sob;
                String kq= String.valueOf(s);
                editTextkq.setText(kq);
            }
        };
        nutnhan.setOnClickListener(bolangnghenhan);
        View.OnClickListener bolangnghechia = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sothu1 =editTextso1.getText().toString();
                String sothu2=editTextso2.getText().toString();
                float soa=Float.parseFloat(sothu1);
                float sob=Float.parseFloat(sothu2);
                float s=soa/sob;
                String kq= String.valueOf(s);
                editTextkq.setText(kq);
            }
        };
        nutchia.setOnClickListener(bolangnghechia);
    }
    void timdieukhien(){
        editTextso1 =(EditText)findViewById(R.id.edtso1);
        editTextso2 =(EditText) findViewById(R.id.edtso2);
        editTextkq= (EditText)findViewById(R.id.edtKQ);
        nutcong = (Button) findViewById(R.id.btncong);
        nuttru = (Button) findViewById(R.id.btntru);
        nutnhan = (Button) findViewById(R.id.btnnhan);
        nutchia = (Button) findViewById(R.id.btnchia);
    }

}