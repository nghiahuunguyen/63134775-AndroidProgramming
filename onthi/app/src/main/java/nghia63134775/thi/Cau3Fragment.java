package nghia63134775.thi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Cau3Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Cau3Fragment extends Fragment {

    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape>list;
    RecyclerView recyclerViewLand;

    public Cau3Fragment() {
        // Required empty public constructor
    }


    public static Cau3Fragment newInstance(String param1, String param2) {
        Cau3Fragment fragment = new Cau3Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        list = new ArrayList<LandScape>(); // Khởi tạo list
        LandScape landScape = new LandScape("thaphanoi", "Cột cờ Hà Nội");
        list.add(landScape);
        list.add(new LandScape("thapeiffel", "Tháp Eiffel"));
        list.add(new LandScape("cungdien", "Cung điện Buckingham"));
        list.add(new LandScape("nuthantudo1", "Tượng nữ thần tự do"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewcau3 =inflater.inflate(R.layout.fragment_cau3, container, false);
        recyclerViewLand = viewcau3.findViewById(R.id.rycau3);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(viewcau3.getContext());
        recyclerViewLand.setLayoutManager(layoutManager);
        landScapeAdapter =new LandScapeAdapter(viewcau3.getContext(),list);
        recyclerViewLand.setAdapter(landScapeAdapter);
        return viewcau3;
    }
}