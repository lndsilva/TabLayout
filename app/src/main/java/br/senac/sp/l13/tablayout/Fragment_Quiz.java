package br.senac.sp.l13.tablayout;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by laercio.nsilva on 15/02/2018.
 */

public class Fragment_Quiz extends Fragment {

    View view;

    public Fragment_Quiz() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.quiz_fragment, container, false);

        return view;
    }
}
