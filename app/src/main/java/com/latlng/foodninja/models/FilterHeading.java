package com.latlng.foodninja.models;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class FilterHeading implements Parcelable {

    private String heading;
    private ArrayList<FilterModel> data;

    public FilterHeading(String heading, ArrayList<FilterModel> data) {
        this.heading = heading;
        this.data = data;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public ArrayList<FilterModel> getData() {
        return data;
    }

    public void setData(ArrayList<FilterModel> data) {
        this.data = data;
    }

    protected FilterHeading(Parcel in) {
        heading = in.readString();
        data = in.createTypedArrayList(FilterModel.CREATOR);
    }

    public static final Creator<FilterHeading> CREATOR = new Creator<FilterHeading>() {
        @Override
        public FilterHeading createFromParcel(Parcel in) {
            return new FilterHeading(in);
        }

        @Override
        public FilterHeading[] newArray(int size) {
            return new FilterHeading[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeString(heading);
        parcel.writeTypedList(data);
    }
}
