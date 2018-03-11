package com.example.andreea.disertatie_meetingapp_v1.navigator.menu;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.andreea.disertatie_meetingapp_v1.R;

/**
 * Created by Andreea on 3/10/2018.
 */

public class TranslatorRecordsFragment extends Fragment {
    View translatorRecordsView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        translatorRecordsView = inflater.inflate(R.layout.translator_records, container, false);
        return translatorRecordsView;
    }
}
