package com.example.lab_work_smd_section_bscs_6c.googleMap;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.example.lab_work_smd_section_bscs_6c.R;
import com.example.lab_work_smd_section_bscs_6c.databinding.ActivityMapsBinding;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
//import com.example.lab_work_smd_section_bscs_6c.googleMap.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

        // Add a marker in Sydney and move the camera
        LatLng Loonaywala = new LatLng(31.601682785185805, 73.0356017143405);
        LatLng Loonaywala2= new LatLng(41.601682785185805, 83.0356017143405);
        mMap.addMarker(new MarkerOptions().position(Loonaywala).title("Marker in Sydney").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
//        PolylineOptions options= new PolylineOptions()
//                .add(Loonaywala).add(Loonaywala2);
//        Polyline polyline = mMap.addPolyline(options);
//        CircleOptions options = new CircleOptions().center(Loonaywala).fillColor(Color.BLUE)
//                .strokeColor(Color.GREEN).strokeWidth(20).radius(4450);
//        Circle circle = mMap.addCircle(options);
        Polygon polygon =mMap.addPolygon(new PolygonOptions().add(new LatLng(-27,153),new LatLng(-33,151),new LatLng(-37,154),new LatLng(-34,137)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Loonaywala));
    }
}