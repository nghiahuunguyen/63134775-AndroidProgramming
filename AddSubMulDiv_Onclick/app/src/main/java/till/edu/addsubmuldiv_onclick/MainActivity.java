package till.edu.addsubmuldiv_onclick;

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
    public void xulycong(View view){
        String sothu1 =editTextso1.getText().toString();
        String sothu2=editTextso2.getText().toString();
        float soa=Float.parseFloat(sothu1);
        float sob=Float.parseFloat(sothu2);
        float s=soa+sob;
        String kq= String.valueOf(s);
        editTextkq.setText(kq);
    }
    public void xulytru(View view){
        String sothu1 =editTextso1.getText().toString();
        String sothu2=editTextso2.getText().toString();
        float soa=Float.parseFloat(sothu1);
        float sob=Float.parseFloat(sothu2);
        float s=soa-sob;
        String kq= String.valueOf(s);
        editTextkq.setText(kq);
    }
    public void xulynhan(View view){
        String sothu1 =editTextso1.getText().toString();
        String sothu2=editTextso2.getText().toString();
        float soa=Float.parseFloat(sothu1);
        float sob=Float.parseFloat(sothu2);
        float s=soa*sob;
        String kq= String.valueOf(s);
        editTextkq.setText(kq);
    }
    public void xulychia(View view){
        String sothu1 =editTextso1.getText().toString();
        String sothu2=editTextso2.getText().toString();
        float soa=Float.parseFloat(sothu1);
        float sob=Float.parseFloat(sothu2);
        float s=soa/sob;
        String kq= String.valueOf(s);
        editTextkq.setText(kq);
    }
}