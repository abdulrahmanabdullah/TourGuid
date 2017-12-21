package abdulrahmanjavanrd.com.tourguid.model;

import java.util.ArrayList;
import java.util.List;

import abdulrahmanjavanrd.com.tourguid.Interface.BaseData;
import abdulrahmanjavanrd.com.tourguid.R;

/**
 * Created by nfs05 on 21/12/2017.
 */

public class Hotel implements BaseData<Hotel> {

    private int image ;

    /**
     * @param image to set image in current object .
     */
    public void setImage(int image) {
        this.image = image;
    }

    /**
     * This Method i call for pass adapter
     * @return ArrayList contain object of {@link Hotel}
     */
    @Override
    public List<Hotel> getAllData() {
        List<Hotel> mList = new ArrayList<>();
        int[] images = allImages();
        try{
           for ( int i = 0 ; i < images.length ; i++){
               Hotel hotel = new Hotel();
               hotel.setImage(images[i]);
               mList.add(hotel);
           }
        }catch (ArrayIndexOutOfBoundsException e ){
            e.getStackTrace();
        }
        return mList;
    }
    /**
     * @return All Hotel images in drawable folder  .
     * Total image = 9
     */
    private int[] allImages() {
        int[] images = {
                R.drawable.al_roicea_png, R.drawable.hilton_png, R.drawable.intercontiental,
                R.drawable.jeddah_park_png, R.drawable.redisson_blue_png, R.drawable.ritz_carlton_png,
                R.drawable.rosewood_png, R.drawable.softie_png, R.drawable.waldrof_png
        };
        return images;
    }
    @Override
    public int getImage() {
        return image;
    }
    @Override
    public int hashCode() {
        return 0;
    }
}
