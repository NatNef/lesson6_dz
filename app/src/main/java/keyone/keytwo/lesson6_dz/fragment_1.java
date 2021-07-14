package keyone.keytwo.lesson6_dz;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class fragment_1 extends Fragment {



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_1);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, NoteFragment.newInstance()).commit();
    }

    private FragmentManager getSupportFragmentManager() {
        return null;
    }


    private void setContentView(int fragment_1) {
    }
}