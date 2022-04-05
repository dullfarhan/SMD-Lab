package com.example.lab_work_smd_section_bscs_6c.static_fargmanet_Example;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.lab_work_smd_section_bscs_6c.R;

public class DetailFragment extends Fragment {
    TextView textView;
    int currentIndex = -1;
    int arrayLength;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.contactdetails, container, false);
    }

    public int getShownIndex() {
        return currentIndex;
    }

    public void contactIndex(int position) {
        if (position < 0 || position >= arrayLength) {
            return;
        }
        currentIndex = position;
        textView.setText(myConstactsMainActivity.contactDetailArray[position]);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        textView = getActivity().findViewById(R.id.contactdetailtextview);
        super.onActivityCreated(savedInstanceState);
        arrayLength = myConstactsMainActivity.contactDetailArray.length;

    }
}
