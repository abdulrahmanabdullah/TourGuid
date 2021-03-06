package abdulrahmanjavanrd.com.tourguid.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import abdulrahmanjavanrd.com.tourguid.Interface.BaseData;
import abdulrahmanjavanrd.com.tourguid.R;
import abdulrahmanjavanrd.com.tourguid.adapter.MyAdapter;
import abdulrahmanjavanrd.com.tourguid.factory.DataFactory;

/**
 *@author abdurlahman.a
 */

public class HotelFrag extends Fragment  {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.hotel_layout,container,false);
        addListView(container.getContext(),v);
        return v;
    }

    public void addListView(final Context context , View v){
        /** Get Hotel class Who? Create obj of {@link DataFactory} Then pass the class name into getDataType method
         * This method return new object of {@link BaseData},just that .
         *  then send  arrayList to  {@link MyAdapter} */
        DataFactory factory = new DataFactory();
        BaseData  hotelData = factory.getDataType("hotel");//Here Create new object of Hotel Class .
        ListView listView = v.findViewById(R.id.list_item);
        MyAdapter adapter = new MyAdapter(context,hotelData.getAllData(),hotelData);
        listView.setAdapter(adapter);
    }

}
