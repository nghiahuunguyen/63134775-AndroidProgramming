package till.edu.bai3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> ds;
    ArrayAdapter<String> adapterds;
    ListView danhsach;
    EditText edtChon;
    EditText edtGiaTri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ds = new ArrayList<String>();
        ds.add("Contect");
        ds.add("Graphics");
        ds.add("Hardware");
        ds.add("Media");
        ds.add("NFC");
        ds.add("OS");
        ds.add("Preference");

        adapterds = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, ds);

        danhsach = findViewById(R.id.dsach);
        danhsach.setAdapter(adapterds);

        danhsach.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = adapterds.getItem(position);
                edtChon.setText(String.valueOf(position));
                edtGiaTri.setText(selectedItem);
            }
        });

        edtChon = findViewById(R.id.edtchon);
        edtGiaTri = findViewById(R.id.edtgiatri);
    }

    public void sua(View view) {
        String chon = edtChon.getText().toString();
        String giaTri = edtGiaTri.getText().toString();

        if (!chon.isEmpty() && !giaTri.isEmpty()) {
            int position = Integer.parseInt(chon);
            if (position >= 0 && position < ds.size()) {
                ds.set(position, giaTri);
                adapterds.notifyDataSetChanged();
                Toast.makeText(this, "Đã lưu sửa", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Vị trí không hợp lệ", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Vui lòng nhập chỉ số và giá trị", Toast.LENGTH_SHORT).show();
        }
    }

    public void them(View view) {
        String giaTri = edtGiaTri.getText().toString();

        if (!giaTri.isEmpty()) {
            ds.add(giaTri);
            adapterds.notifyDataSetChanged();
            Toast.makeText(this, "Đã lưu thêm", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Vui lòng nhập giá trị", Toast.LENGTH_SHORT).show();
        }
    }

    public void xoa(View view) {
        String chon = edtChon.getText().toString();

        if (!chon.isEmpty()) {
            int position = Integer.parseInt(chon);
            if (position >= 0 && position < ds.size()) {
                ds.remove(position);
                adapterds.notifyDataSetChanged();
                Toast.makeText(this, "Đã xóa", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Vị trí không hợp lệ", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Vui lòng nhập chỉ số", Toast.LENGTH_SHORT).show();
        }
    }
}