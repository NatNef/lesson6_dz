package keyone.keytwo.lesson6_dz;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class FragmentActivityContainer extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_activity_container, container, false);
        Button button = view.findViewById(R.id.buttonZametka);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_activity_container, FragmentDescription.newInstance()).commit();
            }
        });
        return view;
    }

    public static FragmentActivityContainer newInstance() {
        FragmentActivityContainer fragment = new FragmentActivityContainer();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }
}