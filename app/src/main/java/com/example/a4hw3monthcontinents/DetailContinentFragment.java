package com.example.a4hw3monthcontinents;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailContinentFragment extends Fragment {

    public static int continentNumber;

    private RecyclerView recyclerView;
    public static ArrayList<Country> countries;

    private TextView tv_Country;
    private ImageView flag;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_detail_continent, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recycler_view);
        tv_Country = view.findViewById(R.id.continent);
        flag = view.findViewById(R.id.flag);

//        if(getArguments() != null) {
//            Country country = (Country) getArguments().getSerializable("key1");
//            tv_Country.setText(country.getName());
//        }

        loadData();
        CountryAdapter countryAdapter = new CountryAdapter(countries);
        recyclerView.setAdapter(countryAdapter);
    }

    static void loadData() {
        countries = new ArrayList<>();
        switch (continentNumber) {
            case 0:
                countries.add(new Country("Argentina", ""));
                countries.add(new Country("Brazil", ""));
                countries.add(new Country("Colombia", ""));
                countries.add(new Country("Ecuador", ""));
                countries.add(new Country("Panama", ""));
                break;

            case 1:
                countries.add(new Country("USA", ""));
                countries.add(new Country("Cuba", ""));
                countries.add(new Country("Barbados", ""));
                countries.add(new Country("Costa Rica", ""));
                countries.add(new Country("Canada", ""));
                break;
            case 2:
                countries.add(new Country("Nigeria", ""));
                countries.add(new Country("Mali", ""));
                countries.add(new Country("Ethiopia", ""));
                countries.add(new Country("Sudan", ""));
                countries.add(new Country("Egypt", ""));
                break;
            case 3:
                countries.add(new Country("Papua New Guinea", ""));
                countries.add(new Country("Victoria", ""));
                countries.add(new Country("Tasmania", ""));
                countries.add(new Country("Tonga", ""));
                countries.add(new Country("Cocos", ""));
                break;
            case 4:
                countries.add(new Country("", ""));
                countries.add(new Country("", ""));
                countries.add(new Country("", ""));
                countries.add(new Country("", ""));
                countries.add(new Country("", ""));
                break;
            case 5:
                countries.add(new Country("Kyrgyzstan", ""));
                countries.add(new Country("Georgia", ""));
                countries.add(new Country("Austria", ""));
                countries.add(new Country("Czech Republic", ""));
                countries.add(new Country("Belgium", ""));
                break;
        }
    }

}