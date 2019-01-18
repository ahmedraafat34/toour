package com.example.ahamed.tours;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import java.util.ArrayList;;
import java.util.List;

public class MainActivity extends AppCompatActivity  implements Food_Fragment.OnFragmentInteractionListener , Night_fragment.OnFragmentInteractionListener, Places_fragment.OnFragmentInteractionListener ,transportaion_Fragment.OnFragmentInteractionListener{
private Toolbar toolbar;
private TabLayout tabLayout;
private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar =(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpager);

        setupViewPager(viewPager);

        tabLayout =(TabLayout)findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Food_Fragment(),"food");
        adapter.addFragment(new transportaion_Fragment(),"trasport");
        adapter.addFragment(new Places_fragment(),"places");
        adapter.addFragment(new Night_fragment(),"Night");
 viewPager.setAdapter(adapter);
    }
    @Override
    public void onFragmentInteraction(Uri uri) {

    }
    class ViewPagerAdapter extends FragmentPagerAdapter{
        private final List<Fragment>mFragmentlist = new ArrayList<>();
        private final List<String>mFragmentTitlList= new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager){
            super(manager);
        }
        @Override
        public Fragment getItem(int position){
            return mFragmentlist.get(position);
        }
        @Override
        public int getCount() {
            return mFragmentlist.size();
        }

        public void addFragment(Fragment fragment , String title){

            mFragmentlist.add(fragment);
            mFragmentTitlList.add(title);
        }
        @Override
        public CharSequence getPageTitle(int position){
            return  mFragmentTitlList.get(position);
        }
    }
}
