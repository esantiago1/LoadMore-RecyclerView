package com.esantiago.pagination.entity;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by edwin on 19/03/16.
 */
public class Item  {

    private String item;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }


    public Item(String item) {
        this.item=item;
    }

}
