package keyone.keytwo.lesson6_dz;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class FragmentOpenNote extends Fragment {

    // сделать кнопку активной
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_open_note, container, false);
        Button button = view.findViewById(R.id.buttonOpenNote);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, NoteFragment.newInstance()).commit();
            }
        });
        return view;
    }


    public static FragmentOpenNote newInstance() {
        FragmentOpenNote fragment = new FragmentOpenNote();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }


}