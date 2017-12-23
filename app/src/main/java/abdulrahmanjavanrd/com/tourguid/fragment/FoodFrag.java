package abdulrahmanjavanrd.com.tourguid.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import abdulrahmanjavanrd.com.tourguid.Interface.BaseData;
import abdulrahmanjavanrd.com.tourguid.R;
import abdulrahmanjavanrd.com.tourguid.adapter.MyAdapter;
import abdulrahmanjavanrd.com.tourguid.factory.DataFactory;

/**
 * @author abdulrahman.a
 */

public class FoodFrag extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.food_layout,container,false);
        addListView(container.getContext(),v);
        return v;
    }
    public void addListView(Context context , View v){
        /** Get Foods class Who? Create obj of {@link DataFactory} Then pass the class name into getDataType method
         * This method return new object of {@link BaseData},just that .
         *  then send  arrayList to  {@link MyAdapter} */
        DataFactory factory = new DataFactory();
        BaseData foodData = factory.getDataType("foods");
        ListView listView = v.findViewById(R.id.list_item);
        MyAdapter adapter = new MyAdapter(context,foodData.getAllData(),foodData);
        listView.setAdapter(adapter);
    }
}
