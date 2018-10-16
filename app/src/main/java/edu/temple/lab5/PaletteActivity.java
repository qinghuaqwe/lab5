package edu.temple.lab5;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.widget.GridView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;


public class PaletteActivity extends Activity {

    GridView gridview;
    public static final String EXTRA_MESSAGE = "Color";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette);

        gridview = findViewById(R.id.gridview);

        final String [] colorname = getResources().getStringArray(R.array.grid_array);
        
        //Resources res = getResources();
        //String[] grid_array = res.getStringArray(/*R.array.grid_array*/R.array.grid_array);

        ColorAdapter adapter = new ColorAdapter(PaletteActivity.this, colorname);
        gridview.setAdapter(adapter);


        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d("my", "here");
                String selectedColor = parent.getItemAtPosition(position).toString();
                Fragment canvasFragment = new CanvasFragment();
                Bundle bundle = new Bundle();
                bundle.putString("color", selectedColor);
                canvasFragment.setArguments(bundle);
                FragmentManager ft = getFragmentManager();
                ft.beginTransaction()
                        .replace(R.id.Container_2, canvasFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });






    }
}
