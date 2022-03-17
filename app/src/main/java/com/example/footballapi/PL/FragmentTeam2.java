package com.example.footballapi.PL;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.footballapi.R;

import java.util.ArrayList;
import java.util.List;

public class FragmentTeam2 extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<Data> lstData;

    public FragmentTeam2() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.team2_fragment, container, false);
        myrecyclerview = (RecyclerView) v.findViewById(R.id.rcvTeams2);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(), lstData);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerViewAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstData = new ArrayList<>();
        lstData.add(new Data("MU", "1222"));
        lstData.add(new Data("MU", "1222"));
        lstData.add(new Data("MU", "1222"));
        lstData.add(new Data("MU", "1222"));
        lstData.add(new Data("MU", "1222"));

    }
}
