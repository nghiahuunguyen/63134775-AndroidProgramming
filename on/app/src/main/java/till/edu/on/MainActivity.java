package till.edu.on;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottom=findViewById(R.id.bottomma);
        bottom.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId=item.getItemId();
                if(itemId==R.id.home){
                    LoadFragment(new HomeActivity(), false);
                } else if (itemId == R.id.cau1) {
                    LoadFragment(new Cau1Activity(), false);
                } else {
                    LoadFragment(new Cau2Activity(), false);
                }
                return true;
            }
        });
        LoadFragment(new HomeActivity(), true);
    }
    private void LoadFragment(Fragment fragment, boolean isAppInitialized) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if (isAppInitialized) {
            fragmentTransaction.add(R.id.fragment, fragment);
        } else {
            fragmentTransaction.replace(R.id.fragment, fragment);
        }
        fragmentTransaction.commit();
    }
}
