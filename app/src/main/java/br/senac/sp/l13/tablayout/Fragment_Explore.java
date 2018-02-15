package br.senac.sp.l13.tablayout;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;

/**
 * Created by laercio.nsilva on 15/02/2018.
 */

public class Fragment_Explore extends Fragment {

    View view;
    public Fragment_Explore() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.explore_fragment,container, false);
        return view;
    }
}
