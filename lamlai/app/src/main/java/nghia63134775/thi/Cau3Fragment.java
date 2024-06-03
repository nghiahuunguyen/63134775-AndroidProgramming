package nghia63134775.thi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class Cau3Fragment extends Fragment {

    LandAdapter landScapeAdapter;
    ArrayList<Land>list;
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
        list = new ArrayList<Land>(); // Khởi tạo list
        Land landScape = new Land("thaphanoi", "Cột cờ Hà Nội");
        list.add(landScape);
        list.add(new Land("thapeiffel", "Tháp Eiffel"));
        list.add(new Land("cungdien", "Cung điện Buckingham"));
        list.add(new Land("nuthantudo1", "Tượng nữ thần tự do"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewcau3 =inflater.inflate(R.layout.fragment_cau3, container, false);
        recyclerViewLand = viewcau3.findViewById(R.id.rcycau3);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(viewcau3.getContext());
        recyclerViewLand.setLayoutManager(layoutManager);
        landScapeAdapter =new LandAdapter(viewcau3.getContext(),list);
        recyclerViewLand.setAdapter(landScapeAdapter);
        return viewcau3;
    }
}