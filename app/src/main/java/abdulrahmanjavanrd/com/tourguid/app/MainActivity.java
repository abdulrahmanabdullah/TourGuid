package abdulrahmanjavanrd.com.tourguid.app;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TableLayout;

import abdulrahmanjavanrd.com.tourguid.R;
import abdulrahmanjavanrd.com.tourguid.pager.Pager;
import abdulrahmanjavanrd.com.tourguid.splash.SplashActivity;

public class MainActivity extends AppCompatActivity {

    // Toolbar
    Toolbar toolbar ;
    // ViewPager
    ViewPager viewPager ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        viewPager = findViewById(R.id.pager);
        TabLayout tabLayout = findViewById(R.id.tabs);
        Pager pager = new Pager(getSupportFragmentManager());

        viewPager.setAdapter(pager);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(viewPager));
    }
}
