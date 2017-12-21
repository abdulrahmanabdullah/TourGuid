package abdulrahmanjavanrd.com.tourguid.app;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import abdulrahmanjavanrd.com.tourguid.R;

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

    }
}
