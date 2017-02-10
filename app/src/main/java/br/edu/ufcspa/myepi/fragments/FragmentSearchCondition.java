package br.edu.ufcspa.myepi.fragments;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.edu.ufcspa.myepi.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentSearchCondition extends Fragment {


    public FragmentSearchCondition() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_search_condition, container, false);
    }

}
