package nghia63134775.thi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Cau1Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Cau1Fragment extends Fragment {



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
        View cau1= inflater.inflate(R.layout.fragment_cau1, container, false);
        EditText som,sokm;
        som=cau1.findViewById(R.id.edtso);
        sokm=cau1.findViewById(R.id.edtso2);
        Button button=cau1.findViewById(R.id.btnchuyen);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String so1= som.getText().toString();
                String so2=sokm.getText().toString();
                if(!so1.isEmpty()){
                    float so1t=Float.parseFloat(so1);

                    float kq=so1t/1000;
                    String kqua=String.valueOf(kq);
                    sokm.setText(kqua);
                }else{
                    float so2t=Float.parseFloat(so2);
                    float kq=so2t*1000;
                    String kqua=String.valueOf(kq);
                    som.setText(kqua);
                }
            }
        });
        return cau1;
    }
}