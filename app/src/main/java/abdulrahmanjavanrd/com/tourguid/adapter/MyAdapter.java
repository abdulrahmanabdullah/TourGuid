package abdulrahmanjavanrd.com.tourguid.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

import abdulrahmanjavanrd.com.tourguid.Interface.BaseData;
import abdulrahmanjavanrd.com.tourguid.R;

/**
 * Created by nfs05 on 21/12/2017.
 */

public class MyAdapter extends BaseAdapter {
    private Context context ;
    private List<BaseData> mList ;

    private String[] titlesCard ; // get Title Array String from Res file .
    private String[] descriptionCard ; // get Description array string from res file .
    /**
     * @param context getContext page .
     * @param list of object {@link BaseData}
     * @param obj to compare hashCode in parent of  {@link BaseData} objects
     *            if obj == 0  {Hotel Class}  call hotelTitle from string.xml -> array string
     *            if obj == 1  {Beach Class} call beachTitle from string.xml  -> array string
     *            if obj == 2  {Malls Class}call mallTitle from string.xml  -> array string
     *            if obj == 3  {Foods Class } call foodTitle from string.xml  -> array string
     */
    public MyAdapter(Context context , List<BaseData> list , BaseData obj){
       this.context = context ;
       this.mList = list ;
       if (obj.hashCode() == 0){
          titlesCard = context.getResources().getStringArray(R.array.hotelTitle);
          descriptionCard = context.getResources().getStringArray(R.array.hotelDescription);
       }
        if (obj.hashCode() == 1){
            titlesCard = context.getResources().getStringArray(R.array.beachTitle);
            descriptionCard = context.getResources().getStringArray(R.array.beachDescription);
        }
        if (obj.hashCode() == 2){
            titlesCard = context.getResources().getStringArray(R.array.mallTitle);
            descriptionCard = context.getResources().getStringArray(R.array.mallDescription);
        }
        if (obj.hashCode() == 3){
            titlesCard = context.getResources().getStringArray(R.array.foodTitle);
            descriptionCard = context.getResources().getStringArray(R.array.foodDescription);
        }
    }
    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public BaseData getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
