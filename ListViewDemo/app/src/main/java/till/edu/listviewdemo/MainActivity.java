package till.edu.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> dsTenTinhThanhVN;//khai báo
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //hiển thị dữ liệu trên listview
        //b1 cần có dữ liệu
        //?? từ đâu có từ ccsdl(sql,nosql)
        //ở bài này dùng hardcode lấy dữ liệu trực tiếp
        //cần biến phù hợp để chứa dữ liệu

        dsTenTinhThanhVN = new ArrayList<String>();//tạo thể hiện cụ thể, xin mới
        //thêm dữ liệu ở đây(đúng ra, ta phải đọc từ một nguồn
        //nhưng ta hard code (cho sẵn để demo)
        dsTenTinhThanhVN.add("Hà Nội");
        dsTenTinhThanhVN.add("Thành phố Hồ Chí Minh");
        dsTenTinhThanhVN.add("Đồng Nai");
        dsTenTinhThanhVN.add("Ninh Thuận");
        dsTenTinhThanhVN.add("Nhan Trang");
        //B2 Tạo adapter
        ArrayAdapter<String> adapterTinhThanh;
        adapterTinhThanh = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,dsTenTinhThanhVN);
        //b3 gắn vào đk hiện thị listview
        //3.1 tìm
        ListView lvTenTinhThanh = findViewById(R.id.lvDanhSachTT);
        //3.2 gắn
        lvTenTinhThanh.setAdapter(adapterTinhThanh);
        //3.2 lắng nghe và xử lý sự kiện user tương tác
        //gắn bộ lắng nghe vào
        lvTenTinhThanh.setOnItemClickListener(Bolangnghe);
    }
    //tạp bộ lắng nghe và xử lý sự kiến onitemclick
    //vd bolangnghevaxl
    AdapterView.OnItemClickListener Bolangnghe = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            //i là vị trị phần tử vừa đc click
            // là hiện lên màn hình thông báo nhanh về vị trị cửa phần tử vừa đc choc
            // Toast.makeText(MainActivity.this,"Bạn vừa chọn"+String.valueOf(i),Toast.LENGTH_LONG).show();
            //vd khác thay vì hiện vị trí ta hiện giá trị
            //lấy giá trị của phần tử thứ i
            String  strTentinhchon=dsTenTinhThanhVN.get(i);
            Toast.makeText(MainActivity.this,strTentinhchon,Toast.LENGTH_LONG).show();
        }
    };

}