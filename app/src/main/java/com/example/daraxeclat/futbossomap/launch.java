package com.example.daraxeclat.futbossomap;

import android.Manifest;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.support.v4.app.ActivityCompat;
import android.widget.ZoomButtonsController;
import android.widget.ZoomControls;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.data.kml.KmlLayer;
import com.google.maps.android.ui.IconGenerator;

import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;

public class launch extends MapsActivity {
    @Override
    public void startIcon() {

        IconGenerator iconFactory = new IconGenerator(this);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory, "Gry." +
                " Lab.", new LatLng(9.655223,6.527966));

        iconFactory.setStyle(IconGenerator.STYLE_DEFAULT);
        iconFactory.setContentRotation(80);
        addIcon(iconFactory,"PG"  +
                " School", new LatLng(9.655507,6.528554));

        iconFactory.setStyle(IconGenerator.STYLE_BLUE);
        addIcon(iconFactory,"FUT " +
                "Library Bosso", new LatLng(9.654619,6.528425));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        addIcon(iconFactory,"Girls Hostel" +
                "N & O ", new LatLng(9.653935, 6.528508));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        addIcon(iconFactory,"Girls hostel " +
                "L & M", new LatLng(9.653880, 6.527953));

        addIcon(iconFactory,"Dept. LIT", new LatLng(9.654886,6.528475));


        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory, "D-block" , new LatLng(9.654700,6.527685));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"Bio  " +
                "Lab.", new LatLng(9.654917,6.527766));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"BS", new LatLng(9.655945,6.527533));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"Central Mosque", new LatLng(9.656461,6.527875));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"SET", new LatLng( 9.655229,6.528411));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"CHSUD", new LatLng(9.654681,6.528791));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"GIS " +
                "Lab.", new LatLng( 9.654797,6.527443));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"Dept." +
                "Stats.", new LatLng(9.654397,6.528478));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"Uni. " +
                "Clinic", new LatLng(9.653450,6.528617));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"Staff Quarter", new LatLng(9.652815,6.528747));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"Shops", new LatLng(9.653311,6.527924));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"Biochem" +
                " Lab.1", new LatLng(9.655143,6.527585));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"Chem. " +
                "Lab 1", new LatLng(9.655200,6.527309));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"Chem. " +
                "Lab 2", new LatLng(9.655181,6.527016));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"MicroBio" +
                "Lab. 1", new LatLng(9.654798,6.527030));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"Profs." +
                "Office", new LatLng(9.654965,6.526840));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"Front " +
                "gate", new LatLng(9.656010,6.528705));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"LT 1", new LatLng(9.654144,6.526088));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"LT 2", new LatLng(9.654351,6.525936));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"Science " +
                "complex", new LatLng(9.654037,6.525574));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"Dept. Maths", new LatLng(9.653797,6.525717));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"FUT Model" +
                "school", new LatLng(9.654206,6.525274));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"NLH 2", new LatLng(9.653906,6.525096));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"NLH 1", new LatLng( 9.653609,6.525243));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"Physics" +
                " lab. 1", new LatLng(9.653937,6.526673));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"Physics" +
                "Lab. 2", new LatLng(9.653642,6.526121));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"Centre for Genetic" +
                " Engineering and " +
                "Biotechnology", new LatLng(9.653532,6.526514));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"ITE" +
                " Workshop", new LatLng(9.653387,6.526871));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"Gel." +
                "Lab.", new LatLng(9.653176,6.526385));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"Dept. " +
                "Geology", new LatLng(9.653471,6.525943));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"Dept. " +
                "Physics", new LatLng(9.653095,6.526188));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"SET", new LatLng(9.652945,6.525919));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"Dept. " +
                "ITE", new LatLng(9.652702,6.526238));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"DH", new LatLng(9.652605,6.526595));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"Cafeteria", new LatLng(9.652440,6.526376));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"Works & " +
                "Maintenance", new LatLng(9.652588,6.527635));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"Boys hostel" +
                "Q Block", new LatLng(9.652031,6.526899));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"Boys hostel " +
                "P block", new LatLng(9.651707,6.527133));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"Shops", new LatLng(9.652171,6.526554));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"Shops", new LatLng(9.651472,6.527480));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"Old teaching " +
                "research farm", new LatLng(9.651179,6.527835));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"love garden", new LatLng(9.653830,6.527397));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"SLS", new LatLng(9.653361,6.524805));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"CPES" +
                "hall", new LatLng(9.653497,6.524287));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"IJMB" +
                "hall", new LatLng( 9.653190,6.524551));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"CPES" +
                "Library", new LatLng(9.652940,6.524470));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"Ibrahim" +
                "Umar Lab.", new LatLng( 9.653223,6.523996));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"Bus park", new LatLng(9.653656,6.523816));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"FUT" +
                "Bakery", new LatLng(9.653675,6.523187));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"FUT" +
                "Ventures", new LatLng( 9.654510,6.522583));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"St. Malachy" +
                "Catholic church", new LatLng(9.655303,6.523080));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"Chapel of" +
                " Grace church", new LatLng(9.655900,6.523325));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"FUT" +
                "staff school", new LatLng(9.657183,6.524363));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"Football" +
                "field", new LatLng(9.654820,6.525017));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"Sports", new LatLng(9.655850,6.527228));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"Back" +
                " gate", new LatLng(9.653214,6.523749));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"Met. Enclosure", new LatLng(9.654420,6.527492));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"Dept.Geography", new LatLng( 9.654529,6.527951));

        iconFactory.setStyle(IconGenerator.STYLE_WHITE);
        iconFactory.setContentRotation(45);
        addIcon(iconFactory,"Man O " +
                "war " +
                "outpost", new LatLng(9.655586,6.526609));



        retrieveFileFromResource();

        }

        private void addIcon(IconGenerator iconFactory, String text, LatLng position) {
            MarkerOptions markerOptions = new MarkerOptions().
                    icon(BitmapDescriptorFactory.fromBitmap(iconFactory.makeIcon(text))).
                    position(position).
                    anchor(iconFactory.getAnchorU(), iconFactory.getAnchorV());

            getMap().addMarker(markerOptions);
        }

    private void retrieveFileFromResource() {
        try {
            KmlLayer bgLayer = new KmlLayer(mMap, R.raw.background, getApplicationContext());
            KmlLayer roadLayer = new KmlLayer(mMap, R.raw.road, getApplicationContext());
            KmlLayer campusLayer = new KmlLayer(mMap, R.raw.building, getApplicationContext());
            KmlLayer drainageLayer = new KmlLayer(mMap, R.raw.drainage, getApplicationContext());
            KmlLayer parkLayer = new KmlLayer(mMap, R.raw.car_park, getApplicationContext());
            KmlLayer bridgeLayer = new KmlLayer(mMap, R.raw.bridge, getApplicationContext());
            KmlLayer sportLayer = new KmlLayer(mMap, R.raw.sport_facility, getApplicationContext());
            //KmlLayer treeLayer = new KmlLayer(mMap, R.raw.tree, getApplicationContext());
            // adding layer to map
            //treeLayer.addLayerToMap();

            sportLayer.addLayerToMap();
            parkLayer.addLayerToMap();
            campusLayer.addLayerToMap();
            drainageLayer.addLayerToMap();
            roadLayer.addLayerToMap();
            bridgeLayer.addLayerToMap();
            bgLayer.addLayerToMap();

            LatLng bosso = new LatLng(9.65462, 6.52804);
            if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                // TODO: Consider calling
                //    ActivityCompat#requestPermissions
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for ActivityCompat#requestPermissions for more details

                return;
            }
            mMap.setMyLocationEnabled(true);
            mMap.getUiSettings().setZoomControlsEnabled(true);
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(bosso, 19));
            // moveCameraToKml(bgLayer);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        }


    }

    }

