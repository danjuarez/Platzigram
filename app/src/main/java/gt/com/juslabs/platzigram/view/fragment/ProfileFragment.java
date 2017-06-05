package gt.com.juslabs.platzigram.view.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
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
public class ProfileFragment extends Fragment {


    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        showToolbar("",false,view);

        RecyclerView picturesRecycler = (RecyclerView) view.findViewById(R.id.pictureProfileRecycler);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(linearLayoutManager.VERTICAL);
        picturesRecycler.setLayoutManager(linearLayoutManager);

        PictureAdapterRecyclerView pictureAdapterRecyclerView =
                new PictureAdapterRecyclerView(buildPictures(), R.layout.cardview_picture, getActivity());
        picturesRecycler.setAdapter(pictureAdapterRecyclerView);
        return view;
    }

    public ArrayList<Picture> buildPictures(){
        ArrayList<Picture> pictures = new ArrayList<>();
        pictures.add(new Picture("https://www.guatemala.com/fotos/201704/Lago-de-Atitlan1-540x305.jpg","Daniel Juarez", "2 dias", "10 Me Gusta"));
        pictures.add(new Picture("https://www.guatemala.com/fotos/201705/Parque-Nacional-Volcan-De-Pacaya2-885x500.jpg","Juan Perez", "6 dias", "5 Me Gusta"));
        pictures.add(new Picture("https://www.guatemala.com/fotos/201705/Laguna-Lachua3-885x500.jpg","Oscar Perez", "8 dias", "3 Me Gusta"));
        pictures.add(new Picture("https://www.guatemala.com/fotos/201705/Laguna-Lachua4-885x500.jpg","Sergio Perez", "10 dias", "25 Me Gusta"));
        return pictures;
    }
    public void showToolbar(String title, boolean upButton, View view){
        Toolbar toolbar= (Toolbar) view.findViewById(R.id.toolbar);  //encontramos la vista del toolbar
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(title); //pone titulo en el action bar
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }

}
