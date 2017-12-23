package abdulrahmanjavanrd.com.tourguid.model;

import android.net.Uri;

import java.util.ArrayList;
import java.util.List;

import abdulrahmanjavanrd.com.tourguid.Interface.BaseData;
import abdulrahmanjavanrd.com.tourguid.R;

/**
 * Created by nfs05 on 21/12/2017.
 */

public class Malls implements BaseData<Malls> {

    private int image ;
    private Uri uriData;

    public void setUriData(Uri uriData) {
        this.uriData = uriData;
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

    @Override
    public List<Malls> getAllData() {
        List<Malls> mList = new ArrayList<>();
        int[] images = allImages();
        List<Uri> list = fillUriData();
        try
        {
           for (int i = 0 ;i < images.length ;i++){
              Malls mall = new Malls();
              mall.setImage(images[i]);
              mall.setUriData(list.get(i));
              mList.add(mall);
           }
        }catch (ArrayIndexOutOfBoundsException e){
            e.getStackTrace();
        }
        return mList;
    }
    /**
     * Total Image = 10
     * @return All Mall images in drawable folder  .
     */
    private int[] allImages(){
        int[] images = {
                R.drawable.al_arabia_mall,R.drawable.al_yasmin_mall_png,R.drawable.alandalus_mall_png,
                R.drawable.aziaz_mall_png,R.drawable.boulevard_mall_png,R.drawable.jeddah_shopping_center_png,
                R.drawable.red_sea_mall_png,R.drawable.rushan_mall_png,R.drawable.salaam_mall,R.drawable.stars_avenue
        };
        return images ;
    }


    @Override
    public Uri getUriData() {
        return this.uriData;
    }
    private List<Uri> fillUriData(){
        List<Uri> list = new ArrayList<>() ;
        list.add(Uri.parse("geo:21.633041, 39.155882?q=al arabia mall")); // Al Arabia Mall
        list.add(Uri.parse("geo:21.593268, 39.228283?q=al yasmin mall")); // Al yasmin Mall
        list.add(Uri.parse("geo:21.507054, 39.217643?q=al andalus mall")); // Al Andalus Mall
        list.add(Uri.parse("geo:21.577169, 39.197273?q=Aziz mall")); // Aziaz Mall
        list.add(Uri.parse("geo:21.569767, 39.125088?q=Boulevard mall")); // Boulevard Mall
        list.add(Uri.parse("geo:21.550139, 39.148049?q=Tahlia Center")); // Tahlia Shopping
        list.add(Uri.parse("geo:21.627865, 39.110690?q=Red Sea Mall")); // Red Sea Mall
        list.add(Uri.parse("geo:21.665811, 39.109709?q=Rushan Mall jeddah")); //Stars Avenue Mall
        list.add(Uri.parse("geo:21.508222, 39.223295?q=Salaam Mall")); // Salaam Mall
        list.add(Uri.parse("geo:21.572986, 39.127952?q=Stars Avenue Mall")); //Stars Avenue Mall
        return list ;
    }
    @Override
    public int hashCode() {
        return 2;
    }
}
