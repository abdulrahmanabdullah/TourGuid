package abdulrahmanjavanrd.com.tourguid.model;

import android.net.Uri;

import java.util.ArrayList;
import java.util.List;

import abdulrahmanjavanrd.com.tourguid.Interface.BaseData;
import abdulrahmanjavanrd.com.tourguid.R;

/**
 * @author Abdulrahman.A
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


    /**
     * @param uriData to set uri from {@link #fillUriData()}
     */
    public void setUriData(Uri uriData) {
        this.uriData = uriData;
    }

    private List<Uri> fillUriData(){
        List<Uri> list = new ArrayList<>() ;
        list.add(Uri.parse("geo:21.177882, 39.171984?q=Al Saif Beach "));// AL Saif Beach .
        list.add(Uri.parse("geo:21.515828, 39.144850?q=Fountain"));// King Fahd Fountain .
        list.add(Uri.parse("geo:21.604883, 39.106749?q=Jeddah WaterFront"));//jw beach .
        list.add(Uri.parse("geo:21.515828, 39.144850?q=Fountain"));// King Fahd Fountain beach.
        list.add(Uri.parse("geo:22.272987, 39.086922?q=Thuawal Public Beach"));// Thuawal Beach.
        return list ;
    }
    /**
     * This Method when pass adapter
     * @return ArrayList contain object of {@link Beach}
     */
    @Override
    public List<Beach> getAllData() {
        List<Beach> mList = new ArrayList<>();
        int[] images = allImages();
        List<Uri> list = fillUriData();
        try{
            for ( int i = 0 ; i < images.length ; i++){
                Beach beach = new Beach();
                beach.setImage(images[i]);
                beach.setUriData(list.get(i));
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
     * @return All beach images in drawable folder  .
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
