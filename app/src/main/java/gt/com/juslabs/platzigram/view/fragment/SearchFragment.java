package gt.com.juslabs.platzigram.view.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import gt.com.juslabs.platzigram.R;
import gt.com.juslabs.platzigram.adapter.PictureAdapterRecyclerView;
import gt.com.juslabs.platzigram.model.Picture;

/**
 * A simple {@link Fragment} subclass.
 */
public class SearchFragment extends Fragment {


    public SearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_search, container, false);
        RecyclerView picturesRecycler = (RecyclerView) view.findViewById(R.id.recycler_fragmentsearch);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2, GridLayoutManager.VERTICAL, false);
        picturesRecycler.setLayoutManager(gridLayoutManager);

        PictureAdapterRecyclerView pictureAdapterRecyclerView =
                new PictureAdapterRecyclerView(buildPictures(), R.layout.cardview_picture, getActivity());
        picturesRecycler.setAdapter(pictureAdapterRecyclerView);
        return view;
    }

    public ArrayList<Picture> buildPictures(){
        ArrayList<Picture> pictures = new ArrayList<>();
        pictures.add(new Picture("https://www.guatemala.com/fotos/201704/Lago-de-Atitlan1-540x305.jpg","Daniel Juarez", "2 dias", "10 Me Gusta"));
        pictures.add(new Picture("https://www.guatemala.com/fotos/201705/Parque-Nacional-Volcan-De-Pacaya2-885x500.jpg","Juan Perez", "6 dias", "5 Me Gusta"));
        pictures.add(new Picture("https://www.guatemala.com/fotos/201705/Laguna-Lachua3-885x500.jpg","Carlos Perez", "8 dias", "3 Me Gusta"));
        pictures.add(new Picture("https://www.guatemala.com/fotos/201705/Laguna-Lachua4-885x500.jpg","Jose Perez", "10 dias", "25 Me Gusta"));
        return pictures;
    }

}
