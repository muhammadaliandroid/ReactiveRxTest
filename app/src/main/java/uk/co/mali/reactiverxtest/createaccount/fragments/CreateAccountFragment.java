package uk.co.mali.reactiverxtest.createaccount.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import uk.co.mali.reactiverxtest.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class CreateAccountFragment extends Fragment {


    public CreateAccountFragment() {}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_create_account, container, false);
    }

}
