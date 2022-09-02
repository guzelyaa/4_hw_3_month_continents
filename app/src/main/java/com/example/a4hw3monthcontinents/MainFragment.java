package com.example.a4hw3monthcontinents;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MainFragment extends Fragment implements OnItemClickListener {
    private RecyclerView recyclerView;
    private ArrayList<Continent> continents;
    private ContinentAdapter continentAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recycler_view);
        loadData();
         continentAdapter = new ContinentAdapter(continents, this);
        recyclerView.setAdapter(continentAdapter);
    }

    @Override
    public void onItemClick(int position) {
//        switch (position){
//            case 0:
//                DetailContinentFragment.continentNumber = 0;
//                break;
//            case 1:
//                DetailContinentFragment.continentNumber = 1;
//                break;
//            case 2:
//                DetailContinentFragment.continentNumber = 2;
//                break;
//            case 3:
//                DetailContinentFragment.continentNumber = 3;
//                break;
//            case 4:
//                DetailContinentFragment.continentNumber = 4;
//                break;
//            case 5:
//                DetailContinentFragment.continentNumber = 5;
//                break;
//        }
        Bundle bundle = new Bundle();
        bundle.putInt("key1", position);
        DetailContinentFragment fragment = new DetailContinentFragment();
        fragment.setArguments(bundle);

        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,
                fragment).addToBackStack(null).commit();
    }

    private void loadData() {
        continents  = new ArrayList<>();
        continents.add(new Continent("South America", "https://www.nicepng.com/png/full/897-8970565_south-america-comments-south-america-black-and-white.png"));
        continents.add(new Continent("North America", "https://w7.pngwing.com/pngs/39/170/png-transparent-united-states-canada-haiti-earth-geography-of-north-america-north.png"));
        continents.add(new Continent("Africa", "https://w7.pngwing.com/pngs/16/565/png-transparent-africa-map-search-monochrome-world-black.png"));
        continents.add(new Continent("Australia", "https://w7.pngwing.com/pngs/799/34/png-transparent-australia-world-map-australia-monochrome-world-black.png"));
        continents.add(new Continent("Antarctica", "https://p.kindpng.com/picc/s/556-5561446_antarctica-vector-hd-png-download.png"));
        continents.add(new Continent("Eurasia", "https://png.pngitem.com/pimgs/s/207-2072023_simple-asia-map-hd-asia-map-black-png.png"));
    }


}