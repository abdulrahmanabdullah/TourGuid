package abdulrahmanjavanrd.com.tourguid.model;

import java.util.ArrayList;
import java.util.List;

import abdulrahmanjavanrd.com.tourguid.Interface.BaseData;
import abdulrahmanjavanrd.com.tourguid.R;

/**
 * Created by nfs05 on 21/12/2017.
 */

public class Foods implements BaseData<Foods> {
    private int image ;
    private String urlData ;


    /** Create new array string length = {@link #allImages()}.length*/
    public void setUrlData(String urlData) {
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
        List<String> list = fillUriData();
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
    public String getUrlData() {
        return this.urlData;
    }
    /**
     * Total images = 9
     * @return All restaurant images in drawable folder  .
     */
    private int[] allImages() {

        int[] images = {
                R.drawable.ihop_png,R.drawable.cheesecake_factory,R.drawable.payaya_cafe_restaurant_png,R.drawable.blue_ocean_png,R.drawable.shacke_shack_png,R.drawable.texas_roadhouse_png,R.drawable.al_baik_png,R.drawable.al_taisj_png,
                R.drawable.abu_zaid_png
        };
        return images;
    }
    private List<String> fillUriData(){
        List<String> list = new ArrayList<>() ;
        list.add("www.food-1.com");
        list.add("www.food-2.com");
        list.add("www.hhhh-3.com");
        list.add("www.hhhh-4.com");
        list.add("www.hhhh-5.com");
        list.add("www.hhhh-6.com");
        list.add("www.hhhhl-6.com");
        list.add("www.hotel-6.com");
        list.add("www.hotel-6.com");
        list.add("www.hotel-10.com");
        return list ;
    }
    @Override
    public int hashCode() {
        return 3;
    }
}
