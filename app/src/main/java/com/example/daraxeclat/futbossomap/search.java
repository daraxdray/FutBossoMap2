package com.example.daraxeclat.futbossomap;

import android.graphics.Color;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.mancj.materialsearchbar.MaterialSearchBar;
import com.miguelcatalan.materialsearchview.MaterialSearchView;

import java.util.ArrayList;
import java.util.List;

import static android.webkit.ConsoleMessage.MessageLevel.LOG;

public class search extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, MaterialSearchBar.OnSearchActionListener  {

    private List<String> lastSearches;
    private MaterialSearchBar searchBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        searchBar = (MaterialSearchBar) findViewById(R.id.searchBar);
        searchBar.setHint("Custom hint");
        searchBar.setSpeechMode(true);
        //enable searchbar callbacks
        searchBar.setOnSearchActionListener(this);
        //restore last queries from disk
        //lastSearches = loadSearchSuggestionFromDisk();
        searchBar.setLastSuggestions(list);
        //Inflate menu and setup OnMenuItemClickListener
        //searchBar.inflateMenu(R.menu.main);
       // searchBar.getMenu().setOnMenuItemClickListener(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //save last queries to disk
    //    saveSearchSuggestionToDisk(searchBar.getLastSuggestions());

    }

    @Override
    public void onSearchStateChanged(boolean enabled) {
        String s = enabled ? "enabled" : "disabled";
      //  Toast.makeText(MainActivity.this, "Search " + s, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSearchConfirmed(CharSequence text) {
        startSearch(text.toString(), true, null, true);
    }

    @Override
    public void onButtonClicked(int buttonCode) {
        switch (buttonCode){
            case MaterialSearchBar.BUTTON_NAVIGATION:
          //      drawer.openDrawer(Gravity.LEFT);
                break;
            case MaterialSearchBar.BUTTON_SPEECH:
        //        openVoiceRecognizer();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }

    /*
    MaterialSearchView searchView;
    ListView listView;
    String[] lstSource = {
            "DH",
            "PostGraduate School",
            "LT"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setActionBar(toolbar);
        getSupportActionBar().setTitle("Search the school areas");
        toolbar.setTitleTextColor(Color.parseColor("#FFFFFF"));
        listView = (ListView) findViewById(R.id.listView);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, lstSource);
        listView.setAdapter(adapter);


        searchView = findViewById(R.id.search_view);
        searchView.setOnSearchViewListener(new MaterialSearchView.SearchViewListener() {
            @Override
            public void onSearchViewShown() {

            }

            @Override
            public void onSearchViewClosed() {
                //if search view closes listView becomes default



            }
        });
        searchView.setOnQueryTextListener(new MaterialSearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                if (newText != null && !newText.isEmpty()) {
                    List<String> listFound = new ArrayList<String>();
                    for (String item : lstSource) {
                        if (item.contains(newText)) {
                            listFound.add(item);
                        }

                    }
                    ArrayAdapter adapter = new ArrayAdapter(search.this, android.R.layout.simple_list_item_1, listFound);
                    listView.setAdapter(adapter);
                } else {
                    //if search text is null
                    // return default
                    ArrayAdapter adapter = new ArrayAdapter(search.this, android.R.layout.simple_list_item_1, lstSource);
                    listView.setAdapter(adapter);
                }

                return true;
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item, menu);
        MenuItem item = menu.findItem(R.id.action_search);

        searchView.setMenuItem(item);
        return true;
    }
**/

    LOG.
}