package com.hijraotji;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.hijraotji.fragmentlayout_f55121051.R;

public class FragmentAccount extends Fragment {
    View view;
    public FragmentAccount() {
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle saveInstanceState) {
        view = inflater.inflate(R.layout.account_fragment,container, false);
        return view;
    }
}
