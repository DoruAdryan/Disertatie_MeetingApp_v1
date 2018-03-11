package com.example.andreea.disertatie_meetingapp_v1.navigator.menu;

/**
 * Created by Andreea on 3/10/2018.
 */

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.andreea.disertatie_meetingapp_v1.R;

public class ManagementRecordsFragment extends Fragment{
    View managementRecordsView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        managementRecordsView = inflater.inflate(R.layout.management_records, container, false);
        return managementRecordsView;
    }
}
