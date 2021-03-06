package abdulrahmanjavanrd.com.tourguid.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import abdulrahmanjavanrd.com.tourguid.Interface.BaseData;
import abdulrahmanjavanrd.com.tourguid.R;

/**
 * @author Abdulrahman.A on 21/12/2017.
 */

public class MyAdapter extends BaseAdapter {
    private Context context;
    private List<BaseData> mList;

    private String[] titlesCard; // get Title of Array String from Res file .
    private String[] descriptionCard; // get Description of array string from res file .

    /**
     * @param context getContext page .
     * @param list    of object {@link BaseData}
     * @param obj     to compare hashCode in parent of  {@link BaseData} objects
     *                if obj == 0  {Hotel Class}  call hotelTitle from string.xml -> array string
     *                if obj == 1  {Beach Class} call beachTitle from string.xml  -> array string
     *                if obj == 2  {Malls Class}call mallTitle from string.xml  -> array string
     *                if obj == 3  {Foods Class } call foodTitle from string.xml  -> array string
     */
    public MyAdapter(Context context, List<BaseData> list, BaseData obj) {
        this.context = context;
        this.mList = list;

        switch (obj.hashCode()) {
            case 0:
                titlesCard = context.getResources().getStringArray(R.array.hotelTitle);
                descriptionCard = context.getResources().getStringArray(R.array.hotelDescription);
                break;
            case 1:
                titlesCard = context.getResources().getStringArray(R.array.beachTitle);
                descriptionCard = context.getResources().getStringArray(R.array.beachDescription);
                break;
            case 2:
                titlesCard = context.getResources().getStringArray(R.array.mallTitle);
                descriptionCard = context.getResources().getStringArray(R.array.mallDescription);
                break;
            case 3:
                titlesCard = context.getResources().getStringArray(R.array.foodTitle);
                descriptionCard = context.getResources().getStringArray(R.array.foodDescription);
                break;
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
    public View getView(final int position, View convertView, ViewGroup parent) {
        MyViewHolder holder ;
        if (convertView == null ){
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item,null);
            holder = new MyViewHolder();
            holder.imgView = convertView.findViewById(R.id.imgView);
            holder.txvTitel = convertView.findViewById(R.id.txvTitle);
            holder.txvDesc = convertView.findViewById(R.id.txvDesc);
            holder.btnLocation = convertView.findViewById(R.id.btn_location);
            convertView.setTag(holder);
        }
        else {
            holder = (MyViewHolder) convertView.getTag();
        }
        holder.imgView.setImageResource(getItem(position).getImage());
        holder.txvTitel.setText(titlesCard[position]);
        holder.txvDesc.setText(descriptionCard[position]);
        holder.btnLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               showLocation(getItem(position).getUriData());
            }
        });
        return convertView;
    }

    /**
     * @param location of current obj in {@link #mList}
     */
    private void showLocation(Uri location) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(location);
        intent.setPackage("com.google.android.apps.maps");
        context.startActivity(intent);
    }

    static class MyViewHolder {
       ImageView imgView ;
       TextView txvTitel ;
       TextView txvDesc ;
       Button btnLocation ;

    }
}
