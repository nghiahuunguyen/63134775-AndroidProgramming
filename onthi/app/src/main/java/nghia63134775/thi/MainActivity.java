package nghia63134775.thi;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottom=findViewById(R.id.bottomNavigationView);
        bottom.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment selectedFragmet= null;
                int itemId =menuItem.getItemId();
                if(itemId==R.id.home){
                    selectedFragmet=new HomeFragment();
                }else if(itemId==R.id.cau1){
                    selectedFragmet=new Cau1Fragment();
                } else if(itemId==R.id.cau2){
                    selectedFragmet=new Cau2Fragment();
                }else if(itemId==R.id.cau3){
                    selectedFragmet=new Cau3Fragment();
                }else if(itemId==R.id.cau4) {
                    selectedFragmet = new Cau4Fragment();
                }
                if(selectedFragmet!=null){
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragmentSpace,selectedFragmet).commit();
                }
                    return false;
            }
        });
        Fragment homeFragment = new HomeFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentSpace, homeFragment).commit();
    }
}