package abdulrahmanjavanrd.com.tourguid.model;

import android.net.Uri;

import java.util.ArrayList;
import java.util.List;

import abdulrahmanjavanrd.com.tourguid.Interface.BaseData;
import abdulrahmanjavanrd.com.tourguid.R;

/**
 * Created by nfs05 on 21/12/2017.
 */

public class Beach implements BaseData<Beach> {
    private int image ;
    private Uri uriData ;
    /**
     * @param image to set image in current object .
     */
    public void setImage(int image) {
        this.image = image;
    }


    public void setUriData(Uri uriData) {
        this.uriData = uriData;
    }


    private List<String> fillUriData(){
        List<String> list = new ArrayList<>() ;
        list.add("www.beach-1.com");
        list.add("www.beach-2.com");
        list.add("www.beach-3.com");
        list.add("www.beach-4.com");
        list.add("www.beach-5.com");
        list.add("www.beach-6.com");
        return list ;
    }
    /**
     * This Method i call for pass adapter
     * @return ArrayList contain object of {@link Hotel}
     */
    @Override
    public List<Beach> getAllData() {
        List<Beach> mList = new ArrayList<>();
        int[] images = allImages();
        List<String> list = fillUriData();
        try{
            for ( int i = 0 ; i < images.length ; i++){
                Beach beach = new Beach();
                beach.setImage(images[i]);
//                beach.setUriData(list.get(i));
                mList.add(beach);
            }
        }catch (ArrayIndexOutOfBoundsException e ){
            e.getStackTrace();
        }
        return mList;
    }

    @Override
    public Uri getUriData() {
        return this.uriData;
    }

    /**
     * @return All restaurant images in drawable folder  .
     */
    private int[] allImages(){
        int[] images = {
                R.drawable.al_saif_beach_png,
                R.drawable.jeddah_fountain_png,
                R.drawable.jeddah_waterfront_png,
                R.drawable.jeddah_north_beach_png,
                R.drawable.thuwal_jeddah_beach_png
        };
        return images ;
    }
    @Override
    public int getImage() {
        return image;
    }
    @Override
    public int hashCode() {
        return 1;
    }
}
