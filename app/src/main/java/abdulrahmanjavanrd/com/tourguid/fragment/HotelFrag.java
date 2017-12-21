package abdulrahmanjavanrd.com.tourguid.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import abdulrahmanjavanrd.com.tourguid.Interface.BaseData;
import abdulrahmanjavanrd.com.tourguid.R;
import abdulrahmanjavanrd.com.tourguid.factory.DataFactory;

/**
 * Created by nfs05 on 21/12/2017.
 */

public class HotelFrag extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.hotel_layout,container,false);

        return v;
    }

    public void addListView(Context context ,View v){
        /** First get Hotel class from {@link DataFactory} And get
         *  then send  arrayList to  {@link MyAdapter} */
        DataFactory factory = new DataFactory();
        BaseData  hotelData = factory.getDataType("hotel");
    }
}
