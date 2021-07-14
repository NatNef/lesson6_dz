package keyone.keytwo.lesson6_dz;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FragmentDescription extends Fragment {



        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
                View view =  inflater.inflate(R.layout.fragment_description, container, false);

                return view;
        }

        public static FragmentDescription newInstance() {
                FragmentDescription fragment = new FragmentDescription();
                Bundle args = new Bundle();
                fragment.setArguments(args);
                return fragment;
        }








        }