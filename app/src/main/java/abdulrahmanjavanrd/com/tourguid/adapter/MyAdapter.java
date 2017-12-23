package abdulrahmanjavanrd.com.tourguid.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import abdulrahmanjavanrd.com.tourguid.Interface.BaseData;
import abdulrahmanjavanrd.com.tourguid.R;

/**
 * Created by nfs05 on 21/12/2017.
 */

public class MyAdapter extends BaseAdapter {
    private Context context ;
    private List<BaseData> mList ;

    private String[] titlesCard ; // get Title of Array String from Res file .
    private String[] descriptionCard ; // get Description of array string from res file .
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
//       switch (obj.hashCode()){
//           case 0:
//               titlesCard = context.getResources().getStringArray(R.array.hotelTitle);
//               descriptionCard = context.getResources().getStringArray(R.array.hotelDescription);
//               break;
//           case 1 :
//               titlesCard = context.getResources().getStringArray(R.array.beachTitle);
//               descriptionCard = context.getResources().getStringArray(R.array.beachDescription);
//               break;
//           case 2 :
//               titlesCard = context.getResources().getStringArray(R.array.mallTitle);
//               descriptionCard = context.getResources().getStringArray(R.array.mallDescription);
//               break;
//           case 3 :
//               titlesCard = context.getResources().getStringArray(R.array.foodTitle);
//               descriptionCard = context.getResources().getStringArray(R.array.foodDescription);
//               break;
//       }
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
    public View getView(final int position, View convertView, ViewGroup parent) {
        View v = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false);
        ImageView imgView = v.findViewById(R.id.imgView);
        TextView txvTitle = v.findViewById(R.id.txvTitle);
        TextView txvDesc = v.findViewById(R.id.txvDesc);
        Button btn = v.findViewById(R.id.btn_location);
        imgView.setImageResource(getItem(position).getImage());
        txvTitle.setText(titlesCard[position]);
        txvDesc.setText(descriptionCard[position]);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:21.604747,39.109195");
//                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
//                mapIntent.setPackage("com.google.android.apps.maps");
//                context.startActivity(mapIntent);
                showLocation(gmmIntentUri);
//                Toast.makeText(context,getItem(position).getUrlData(),Toast.LENGTH_SHORT).show();
            }
        });

        return v;
    }

    private void showLocation(Uri location){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(location);
        context.startActivity(intent);
    }

}
