package till.edu.tinh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void xulycong(View view){
        // tìm, tham chếu đến điều khiển trên tâp xml , mapping sang java file
        EditText editTextsoa =findViewById(R.id.edta);
        EditText editTextsob =findViewById(R.id.edtb);
        EditText editTextkq =findViewById(R.id.edtKQ);
        //lấy dữ liệu ở điều khiển a
        String stra =editTextsoa.getText().toString();
        //lấy dữ liệu ở điều khiển b
        String strb =editTextsob.getText().toString();
        //chuyển dữ liệu sang số
        int soa=Integer.parseInt(stra);
        int sob=Integer.parseInt(strb);
        //tính
        int tong =soa+sob;
        String strkq=String.valueOf(tong);//chuyển sang chuỗi
        //hiện kq
        editTextkq.setText(strkq);

    }
}