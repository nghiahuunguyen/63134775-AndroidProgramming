package com.example.lamlai;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class Cau2Fragment extends Fragment {

    LandSapceAdapter landScapeAdapter;
    ArrayList<LandSapce> list;
    RecyclerView recyclerViewLand;



    public Cau2Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Cau2Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Cau2Fragment newInstance(String param1, String param2) {
        Cau2Fragment fragment = new Cau2Fragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        list = new ArrayList<LandSapce>(); // Khởi tạo list
        LandSapce landScape = new LandSapce("thaphanoi", "Cột cờ Hà Nội");
        list.add(landScape);
        list.add(new LandSapce("thapeiffel", "Tháp Eiffel"));
        list.add(new LandSapce("cungdien", "Cung điện Buckingham"));
        list.add(new LandSapce("nuthantudo1", "Tượng nữ thần tự do"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewcau3 =inflater.inflate(R.layout.fragment_cau2, container, false);
        recyclerViewLand = viewcau3.findViewById(R.id.ry);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(viewcau3.getContext());
        recyclerViewLand.setLayoutManager(layoutManager);
        landScapeAdapter =new LandSapceAdapter(viewcau3.getContext(),list);
        recyclerViewLand.setAdapter(landScapeAdapter);
        return viewcau3;
    }
}