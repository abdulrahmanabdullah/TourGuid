package abdulrahmanjavanrd.com.tourguid.model;

import java.util.ArrayList;
import java.util.List;

import abdulrahmanjavanrd.com.tourguid.Interface.BaseData;
import abdulrahmanjavanrd.com.tourguid.R;

/**
 * Created by nfs05 on 21/12/2017.
 */

public class Malls implements BaseData<Malls> {

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

    @Override
    public List<Malls> getAllData() {
        List<Malls> mList = new ArrayList<>();
        int[] images = allImages();
        try
        {
           for (int i = 0 ;i < images.length ;i++){
              Malls mall = new Malls();
              mall.setImage(images[i]);
              mList.add(mall);
           }
        }catch (ArrayIndexOutOfBoundsException e){
            e.getStackTrace();
        }
        return mList;
    }
    /**
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
    public int hashCode() {
        return 2;
    }
}