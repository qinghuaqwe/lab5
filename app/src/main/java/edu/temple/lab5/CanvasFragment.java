package edu.temple.lab5;


import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CanvasFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CanvasFragment extends Fragment {

    private static final String COLOR_KEY = "color";

    String color;


    public CanvasFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            Bundle bundle = getArguments();
            this.color = bundle.getString(COLOR_KEY);
        }
    }

    public static CanvasFragment newInstance(String color) {
        CanvasFragment canvasFragment = new CanvasFragment();
        Bundle bundle = new Bundle();

        bundle.putString(CanvasFragment.COLOR_KEY, color);
        canvasFragment.setArguments(bundle);

        return canvasFragment;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d("my", "there");
        View v = inflater.inflate(R.layout.fragment_canvas, container, false);
        View qwe = v.findViewById(R.id.layout);
        qwe.setBackgroundColor(Color.parseColor(color));

        //return inflater.inflate(R.layout.fragment_canvas, container, false);
        return v;
    }

}
