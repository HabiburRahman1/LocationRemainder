package com.employeeinformation.io.respay.locationremainder.models;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by Habib on 19/10/18.
 */

public class LatitudeLongitude {

    LatLng currentLatLng;
    LatLng RemainderLatLng;

    public LatLng getCurrentLatLng() {
        return currentLatLng;
    }

    public void setCurrentLatLng(LatLng currentLatLng) {
        this.currentLatLng = currentLatLng;
    }

    public LatLng getRemainderLatLng() {
        return RemainderLatLng;
    }

    public void setRemainderLatLng(LatLng remainderLatLng) {
        RemainderLatLng = remainderLatLng;
    }
}
