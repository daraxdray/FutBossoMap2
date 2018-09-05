package com.example.daraxeclat.futbossomap;

import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;
import java.util.ArrayList;
import java.util.zip.Inflater;

public class gallery extends AppCompatActivity {


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery_grid);

        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                startActivity( new Intent( getApplicationContext(), ViewImage.class));
            }
        });
    }}
   /** GridView gv;
    ArrayList<File> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

      /**  list = imageReader( Environment.getExternalStorageDirectory() );
    gv = (GridView) findViewById(R.id.gridview);
    gv.setAdapter(new GridAdapter());

    gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            startActivity( new Intent( getApplicationContext(), ViewImage.class).putExtra("img", list.get(i)));
        }
    });



    }

    public void nxt(View view){
        startActivity(new Intent(getApplicationContext(),seet.class) );
    }

    public void prev(View view) {
        startActivity(new Intent(getApplicationContext(),seet.class) );
    }

    class GridAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int i) {
            return list.get(i);
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            view = getLayoutInflater().inflate(R.layout.my_grid, viewGroup, false);
            ImageView iv = (ImageView) view.findViewById(R.id.imageView);
            iv.setImageURI(Uri.parse( getItem( i ).toString()   ));
            return view;
        }
    }

    ArrayList<File> imageReader(File root){
        ArrayList<File> a = new ArrayList();

        File[] files = root.listFiles();
        for(int i = 0; i <= files.length; i++){
            if(files[i].isDirectory()){

                a.addAll( imageReader( files[i] ) );

            }
            else
                if(files[i].getName().endsWith("jpg") ){
                a.add(files[i]);
                }
        }
        return a;

    }


}**/
