package abdulrahmanjavanrd.com.tourguid.factory;

import abdulrahmanjavanrd.com.tourguid.Interface.BaseData;
import abdulrahmanjavanrd.com.tourguid.model.Beach;
import abdulrahmanjavanrd.com.tourguid.model.Foods;
import abdulrahmanjavanrd.com.tourguid.model.Hotel;
import abdulrahmanjavanrd.com.tourguid.model.Malls;

/**
 * @author  Abdulrahman.A
 * @sinc 21/12/2017.
 */

public class DataFactory {

    public BaseData getDataType(String choice){
       if (choice == null)
           return null ;
       if (choice.equalsIgnoreCase("hotel"))
           return new Hotel();
       if (choice.equalsIgnoreCase("beach"))
           return new Beach();
       if (choice.equalsIgnoreCase("mall"))
           return new Malls();
       if (choice.equalsIgnoreCase("foods"))
           return new Foods();

        return null ;
    }
}
