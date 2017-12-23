package abdulrahmanjavanrd.com.tourguid.Interface;

import java.util.List;

/**
 * Created by nfs05 on 21/12/2017.
 */

public interface BaseData<T> {
    int getImage(); // To get all images for each class implement this interface
    List<T> getAllData(); // To return all Data for each Class implement this interface
    String getUrlData(); // To get Uri,Then get this uri in MyAdapter class when click button.
}
