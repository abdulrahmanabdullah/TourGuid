package abdulrahmanjavanrd.com.tourguid.pager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import abdulrahmanjavanrd.com.tourguid.fragment.BeachFrag;
import abdulrahmanjavanrd.com.tourguid.fragment.FoodFrag;
import abdulrahmanjavanrd.com.tourguid.fragment.HotelFrag;
import abdulrahmanjavanrd.com.tourguid.fragment.MallFrag;

/**
 * Created by nfs05 on 21/12/2017.
 */

public class Pager extends FragmentPagerAdapter {
    public Pager(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 :
                return new HotelFrag();
            case 1 :
                return new BeachFrag();
            case 2 :
                return new MallFrag();
            case 3 :
                return new FoodFrag();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
