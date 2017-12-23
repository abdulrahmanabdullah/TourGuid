package abdulrahmanjavanrd.com.tourguid.model;

import android.net.Uri;

import java.util.ArrayList;
import java.util.List;

import abdulrahmanjavanrd.com.tourguid.Interface.BaseData;
import abdulrahmanjavanrd.com.tourguid.R;

/**
 *@author abdulrahman abdullah
 */

public class Foods implements BaseData<Foods> {
    private int image ;
    private Uri urlData ;

    /**
     *
     * @param urlData set location for each items in
     */
    public void setUrlData(Uri urlData) {
        this.urlData = urlData;
    }

    /**
     * @param image to set image in current object .
     */
    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public int getImage() {
        return image;
    }

    /**
     * This Method i call for pass adapter
     * @return ArrayList contain object of {@link Foods}
     */
    @Override
    public List<Foods> getAllData() {
        List<Foods> mList = new ArrayList<>();
        int[] images = allImages();
        List<Uri> list = fillUriData();
        try{
           for (int i = 0 ; i < images.length ; i++){
               Foods food = new Foods();
               food.setImage(images[i]);
               food.setUrlData(list.get(i));
               mList.add(food);
           }
        }catch (ArrayIndexOutOfBoundsException e){
            e.fillInStackTrace();
        }
        return mList;
    }


    @Override
    public Uri getUriData() {
        return this.urlData;
    }
    /**
     * Total images = 9
     * @return All restaurant images in drawable folder  .
     */
    private int[] allImages() {

        int[] images = {
                R.drawable.cheesecake_factory,R.drawable.ihop_png,R.drawable.payaya_cafe_restaurant_png,R.drawable.blue_ocean_png,R.drawable.shacke_shack_png,R.drawable.texas_roadhouse_png,R.drawable.al_baik_png,R.drawable.al_taisj_png,
                R.drawable.abu_zaid_png
        };
        return images;
    }
    private List<Uri> fillUriData(){
        List<Uri> list = new ArrayList<>() ;
        list.add(Uri.parse("geo:21.553674, 39.166799?q=cheesecake factory jeddah"));
        list.add(Uri.parse("geo:21.553714, 39.167732?q=ihope"));
        list.add(Uri.parse("geo:21.582923, 39.130666?q=payaya cafe"));
        list.add(Uri.parse("geo:21.572239, 39.109176?q=Blue ocean "));
        list.add(Uri.parse("geo:21.553817, 39.167718?q=Shake Shack"));
        list.add(Uri.parse("geo:21.553706, 39.167652?q=Texas RoadHouse"));
        list.add(Uri.parse("geo:21.553688, 39.162395?q=Al Baik"));
        list.add(Uri.parse("geo:21.550974, 39.155494?q=Al Tazaj"));
        list.add(Uri.parse("geo:21.569069, 39.183211?q=Abu Zaid Restaurant"));
        return list ;
    }
    @Override
    public int hashCode() {
        return 3;
    }
}
