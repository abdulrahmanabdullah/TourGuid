package abdulrahmanjavanrd.com.tourguid.model;

import android.net.Uri;

import java.util.ArrayList;
import java.util.List;

import abdulrahmanjavanrd.com.tourguid.Interface.BaseData;
import abdulrahmanjavanrd.com.tourguid.R;

/**
 * @author Abdulrahman.A
 * @since on 21/12/2017.
 */

public class Hotel implements BaseData<Hotel> {

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

    /**
     * This Method i call for pass adapter
     * @return ArrayList contain object of {@link Hotel}
     */
    @Override
    public List<Hotel> getAllData() {
        List<Hotel> mList = new ArrayList<>();
        int[] images = allImages();
        List<Uri> list = fillUriData();
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


    /**
     * @return location for all hotel
     */
    private List<Uri> fillUriData(){
        List<Uri> uri = new ArrayList<>();
        uri.add(Uri.parse("geo:21.576524, 39.110135?q=jeddah rosewood hotel"));//Jeddah RoseWood hotel
        uri.add(Uri.parse("geo:21.604747,39.109195?q=jeddah hilton hotel"));//Jeddah Hilton
        uri.add(Uri.parse("geo:21.601903, 39.107995?q=jeddah sofitel hotel"));//Jeddah Sofitel
        uri.add(Uri.parse("geo:21.594588, 39.149301?q=Redisson Blue hotel"));//Redisson Blue hotel
        uri.add(Uri.parse("geo:21.524921, 39.151676?q=jeddah ritz carlton hotel"));//Ritz Carlton
        uri.add(Uri.parse("geo:21.603796, 39.109033?q=jeddah waldrof Astoria hotel"));//Waldrof Astoria
        uri.add(Uri.parse("geo:21.568257, 39.149824?q=jeddah Al Rawasi  hotel"));//Al Rawasi Hotel
        uri.add(Uri.parse("geo:21.514208, 39.154141?q=jeddah park Hyatt"));//Park Hyatt hotel
        uri.add(Uri.parse("geo:21.614357, 39.108368?q=jeddah Sheraton hotel"));//Sheraton hotel
        return uri ;
    }
    @Override
    public Uri getUriData() {
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
