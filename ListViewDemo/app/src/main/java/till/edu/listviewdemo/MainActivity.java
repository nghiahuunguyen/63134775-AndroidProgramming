package till.edu.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> dsTenTinhThanhVN;
    ArrayAdapter<String> adapterTinhThanh;
    ListView lvTenTinhThanh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dsTenTinhThanhVN = new ArrayList<String>();
        dsTenTinhThanhVN.add("Hà Nội");
        dsTenTinhThanhVN.add("Thành phố Hồ Chí Minh");
        dsTenTinhThanhVN.add("Đồng Nai");
        dsTenTinhThanhVN.add("Ninh Thuận");
        dsTenTinhThanhVN.add("Nha Trang");

        adapterTinhThanh = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dsTenTinhThanhVN);

        ListView lvTenTinhThanh = findViewById(R.id.lvDanhSachTT);
        lvTenTinhThanh.setAdapter(adapterTinhThanh);
        lvTenTinhThanh.setOnItemClickListener(Bolangnghe);
    }

    AdapterView.OnItemClickListener Bolangnghe = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            String strTentinhchon = dsTenTinhThanhVN.get(i);
            Toast.makeText(MainActivity.this, strTentinhchon, Toast.LENGTH_LONG).show();
        }
    };

    public void them(View view) {
        EditText tenmoi = findViewById(R.id.txtthem);
        String tennhap = tenmoi.getText().toString();
        dsTenTinhThanhVN.add(tennhap);
        Collections.sort(dsTenTinhThanhVN);
        adapterTinhThanh.notifyDataSetChanged();
        tenmoi.setText("");
    }
    public void xoa(View view) {
        EditText tenXoa = findViewById(R.id.txtthem);
        String tenCanXoa = tenXoa.getText().toString();

        int position = -1;
        for (int i = 0; i < dsTenTinhThanhVN.size(); i++) {
            if (dsTenTinhThanhVN.get(i).equals(tenCanXoa)) {
                position = i;
                break;
            }
        }

        if (position != -1) {
            dsTenTinhThanhVN.remove(position);
            adapterTinhThanh.notifyDataSetChanged();
            tenXoa.setText("");
        } else {
            Toast.makeText(MainActivity.this, "Không tìm thấy tên cần xóa", Toast.LENGTH_SHORT).show();
        }
    }
    public void chinh(View view) {
        EditText tenChinhSua = findViewById(R.id.txtthem);
        String tenCanChinhSua = tenChinhSua.getText().toString();

        int position = dsTenTinhThanhVN.indexOf(tenCanChinhSua);
        if (position != -1) {
            EditText tenmoi = findViewById(R.id.txtchinh);
            String tenMoiValue = tenmoi.getText().toString();

            dsTenTinhThanhVN.set(position, tenMoiValue);
            adapterTinhThanh.notifyDataSetChanged();
            tenChinhSua.setText("");
            tenmoi.setText("");

            Toast.makeText(MainActivity.this, "Đã chỉnh sửa thành công", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "Không tìm thấy tên cần chỉnh sửa", Toast.LENGTH_SHORT).show();
        }
    }
}