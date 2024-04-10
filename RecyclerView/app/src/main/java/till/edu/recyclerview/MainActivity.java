package till.edu.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape>recylerViewDatas;
    RecyclerView recyclerViewLand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //3
        recylerViewDatas=getRecylerViewDatas();
        //4
        recyclerViewLand=findViewById(R.id.recyclerLand);
        //5
//        RecyclerView.LayoutManager layoutLinear=new LinearLayoutManager(this);
//        recyclerViewLand.setLayoutManager(layoutLinear);
//        RecyclerView.LayoutManager layoutLinearHorizon=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
//        recyclerViewLand.setLayoutManager(layoutLinearHorizon);
        RecyclerView.LayoutManager layoutLinearGrid=new GridLayoutManager(this,2);
        recyclerViewLand.setLayoutManager(layoutLinearGrid);
        //6
        landScapeAdapter=new LandScapeAdapter(this,recylerViewDatas);
        //7
        recyclerViewLand.setAdapter(landScapeAdapter);
    }
    ArrayList<LandScape>getRecylerViewDatas(){
        ArrayList<LandScape>dsdulieu=new ArrayList<LandScape>();
        LandScape landScape=new LandScape("thaphanoi","Cột cờ Hà Nội");
        dsdulieu.add(landScape);
        dsdulieu.add(new LandScape("thapeiffel","Tháp Eiffel"));
        dsdulieu.add(new LandScape("cungdien","Cung điện Bckingham"));
        dsdulieu.add(new LandScape("nuthantudo1","Tượng nhữ thần tự do"));
        return dsdulieu;
    }
}