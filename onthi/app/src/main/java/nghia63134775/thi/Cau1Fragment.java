package nghia63134775.thi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Cau1Fragment extends Fragment {

    EditText editText_m;
    EditText editText_km;
    Button btnchuyen;

    public Cau1Fragment() {
        // Required empty public constructor
    }

    public static Cau1Fragment newInstance(String param1, String param2) {
        Cau1Fragment fragment = new Cau1Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewcau1 = inflater.inflate(R.layout.fragment_cau1, container, false);
        editText_m = viewcau1.findViewById(R.id.edtso);
        editText_km = viewcau1.findViewById(R.id.edtso2);
        btnchuyen = viewcau1.findViewById(R.id.btnchuyen);

        btnchuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dlmet = editText_m.getText().toString();
                String dlkm = editText_km.getText().toString();

                if (!dlmet.isEmpty()) { // m->km
                    float somet = Float.parseFloat(dlmet);
                    float tinh = somet / 1000;
                    String kq = String.valueOf(tinh);
                    editText_km.setText(kq);
                    Toast.makeText(viewcau1.getContext(), "m->km", Toast.LENGTH_SHORT).show();
                } else {
                    float sokm = Float.parseFloat(dlkm);
                    float tinh = sokm * 1000;
                    String kq = String.valueOf(tinh);
                    editText_m.setText(kq);
                    Toast.makeText(viewcau1.getContext(), "km->m", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return viewcau1;
    }
}