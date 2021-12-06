package com.example.hw5;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class SecondFragment extends Fragment{


    private RecyclerView recyclerView;
    private SecondAdapter adapter;
    private ArrayList<User> list = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        adapter = new SecondAdapter();
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recycler_second);


        createList();
        adapter.addList(list);
        setClick();

    }

    private void setClick() {
        adapter.setListiner(model1 -> {
            Intent in = new Intent(requireActivity(),secondactivity.class);
            in.putExtra("text", model1);
            startActivity(in);
        });
    }
            private void createList() {
                list = new ArrayList<>();
                list.add(new User("1", "Hiro", "Osobay", "4:20"));
                list.add(new User("2", "OXXXY", "pervyi klass", "5:32"));
                list.add(new User("3", "Basta", "rostov", "3:52"));
                list.add(new User("4", "morgen", "Cadilac", "3:24"));
                list.add(new User("5", "morgen", "pablo", "3:45"));
                list.add(new User("6", "morgen", "pablo2", "3:10"));
                list.add(new User("7", "morgen ", "ice", "2:40"));
                list.add(new User("8", "Miyagi", "i got love", "2:00"));
                list.add(new User("9", "Miyagi", "Angel", "3:50"));
                list.add(new User("10", "Instasamka", "pidor", "2:30"));
                recyclerView.setAdapter(adapter);
            }
        }
