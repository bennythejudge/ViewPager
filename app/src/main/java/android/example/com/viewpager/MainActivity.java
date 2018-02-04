package android.example.com.viewpager;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // use the activity_main.xml
        setContentView(R.layout.activity_main);

        // find the view pager
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // create an adapter that knows which fragment should be shown on each page
        SimpleFragmentPagerAdapter adapter = new SimpleFragmentPagerAdapter(
                getSupportFragmentManager());

        // set the adapter onto the view pager
        viewPager.setAdapter(adapter);
    }
}
