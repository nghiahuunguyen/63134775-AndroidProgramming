package till.edu.lwnc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Conutry>dsqg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dsqg=new ArrayList<Conutry>();
        dsqg.add(new Conutry("VietNam",99000000,"vn"));
        dsqg.add(new Conutry("Russia",300000000,"russia"));
        dsqg.add(new Conutry("VietNam",2000000,"US"));
        ListView listView = findViewById(R.id.lvQG);
        ContryAdapter adapter = new ContryAdapter(this,dsqg);
        listView.setAdapter(adapter);
    }
}