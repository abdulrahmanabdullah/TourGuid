package abdulrahmanjavanrd.com.tourguid.Interface;

import android.net.Uri;

import java.util.List;

/**
 * @author Abdulrahman.A
 */
public interface BaseData<T> {
    int getImage(); // To get all images for each class implement this interface

    List<T> getAllData(); // To return all Data for each Class implement this interface

    Uri getUriData(); // To get Uri,Then get this uri in MyAdapter class when click button.
}
