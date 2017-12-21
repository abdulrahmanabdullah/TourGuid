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
        try{
           for (int i = 0 ; i < images.length ; i++){
               Foods food = new Foods();
               food.setImage(images[i]);
               mList.add(food);
           }
        }catch (ArrayIndexOutOfBoundsException e){
            e.fillInStackTrace();
        }
        return mList;
    }

    /**
     * @return All restaurant images in drawable folder  .
     */
    private int[] allImages() {

        int[] images = {
                R.drawable.abu_zaid_png, R.drawable.al_baik_png, R.drawable.al_taisj_png, R.drawable.blue_ocean_png, R.drawable.cheesecake_factory, R.drawable.ihop_png, R.drawable.payaya_cafe_restaurant_png, R.drawable.shacke_shack_png, R.drawable.texas_roadhouse_png
        };
        return images;
    }
    @Override
    public int hashCode() {
        return 3;
    }
}
