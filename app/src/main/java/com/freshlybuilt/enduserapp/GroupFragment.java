package com.freshlybuilt.enduserapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.freshlybuilt.enduserapp.adapters.GroupListAdapter;
import com.freshlybuilt.enduserapp.adapters.PostsListAdapter;

public class GroupFragment extends Fragment {


    RecyclerView mPostsListView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.group_fragment,container,false);
        mPostsListView = view.findViewById(R.id.posts_listview);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mPostsListView.setLayoutManager(new GridLayoutManager(getContext(),2));
        mPostsListView.setAdapter(new GroupListAdapter());
    }
}
