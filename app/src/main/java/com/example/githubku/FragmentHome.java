package com.example.githubku;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.githubku.model.*;
import com.example.githubku.api.*;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentHome#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentHome extends Fragment {
    private RecyclerView recyclerView;
    RecyclerView.Adapter recyclerViewAdapter;
    LinearLayout listdata;
    TextView Judul;
    List<repository> mRepository =  new ArrayList<>();
    List<repository> RepositoryList = new ArrayList<>();
    apiInterface mapiInterface;
    public static FragmentHome fh;





    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentHome() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentHome.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentHome newInstance(String param1, String param2) {
        FragmentHome fragment = new FragmentHome();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);



        List<repository> RepositoryList = new ArrayList<>();

        // Add the following lines to create RecyclerView
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

        recyclerViewAdapter = new AdapterRecyclerView(getContext(),mRepository);

        mapiInterface = apiClient.getClient().create(apiInterface.class);

        recyclerView.setAdapter(recyclerViewAdapter);

        refresh();






        return view;
    }

    public void refresh() {

        Call<getRepository> repositoryCall= mapiInterface.getRepository();
        repositoryCall.enqueue(new Callback<getRepository>() {
            @Override
            public void onResponse(Call<getRepository> call, Response<getRepository>
                    response) {

                 List<repository> RepositoryList = response.body().getListRepository();
                Log.d("Retrofit Get", "Jumlah data Kontak: " +
                        String.valueOf(RepositoryList.size()));


                recyclerViewAdapter= new AdapterRecyclerView(getContext(),RepositoryList);
                recyclerView.setAdapter(recyclerViewAdapter);
            }

            @Override
            public void onFailure(Call<getRepository> call, Throwable t) {
                Log.e("Retrofit Get", t.toString());
            }
        });
    }
}