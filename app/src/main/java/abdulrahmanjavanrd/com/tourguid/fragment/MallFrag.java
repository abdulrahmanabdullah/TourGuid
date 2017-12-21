package abdulrahmanjavanrd.com.tourguid.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import abdulrahmanjavanrd.com.tourguid.R;

/**
 * @author  Abdulrahman.A
 * @sinc 21/12/2017.
 */

public class MallFrag extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.mall_layout,container,false);
        return v;
    }
}
