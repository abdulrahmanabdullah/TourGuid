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
    private String uriData ;

    /**
     * @param image to set image in current object .
     */
    public void setImage(int image) {
        this.image = image;
    }

    public void setUriData(String uriData) {
        this.uriData = uriData;
    }

    /**
     * This Method i call for pass adapter
     * @return ArrayList contain object of {@link Hotel}
     */
    @Override
    public List<Hotel> getAllData() {
        List<Hotel> mList = new ArrayList<>();
        int[] images = allImages();
        List<String> list = fillUriData();
        try{
           for ( int i = 0 ; i < images.length ; i++){
               Hotel hotel = new Hotel();
               hotel.setImage(images[i]);
               hotel.setUriData(list.get(i));
               mList.add(hotel);
           }
        }catch (ArrayIndexOutOfBoundsException e ){
            e.getStackTrace();
        }
        return mList;
    }


    private List<String> fillUriData(){
        List<String> list = new ArrayList<>() ;
        list.add("www.hotel-1.com");
        list.add("www.hotel-2.com");
        list.add("www.hotel-3.com");
        list.add("www.hotel-4.com");
        list.add("www.hotel-5.com");
        list.add("www.hotel-6.com");
        list.add("www.hotel-6.com");
        list.add("www.hotel-6.com");
        list.add("www.hotel-6.com");
        list.add("www.hotel-10.com");
        return list ;
    }
    @Override
    public String getUrlData() {
        return this.uriData;
    }

    /**
     * @return All Hotel images in drawable folder  .
     * Total image = 9
     */
    private int[] allImages() {
        int[] images = {
                R.drawable.rosewood_png,R.drawable.hilton_png,
                R.drawable.softie_png,
                R.drawable.redisson_blue_png,
                R.drawable.ritz_carlton_png,
                R.drawable.waldrof_png,
                R.drawable.al_roicea_png,
                R.drawable.jeddah_park_png ,
                R.drawable.intercontiental
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
