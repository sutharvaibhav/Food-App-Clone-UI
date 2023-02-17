package com.latlng.foodninja.models;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class Subject implements Parcelable {
    public Integer img;
    public String name;
    public String desc;
    public String price;

    public Subject(Integer img, String name, String desc, String price) {
        this.img = img;
        this.name = name;
        this.desc = desc;
        this.price = price;
    }

    public Integer getImg() {
        return img;
    }

    public void setImg(Integer img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    protected Subject(Parcel in) {
        if (in.readByte() == 0) {
            img = null;
        } else {
            img = in.readInt();
        }
        name = in.readString();
        desc = in.readString();
        price = in.readString();
    }

    public static final Creator<Subject> CREATOR = new Creator<Subject>() {
        @Override
        public Subject createFromParcel(Parcel in) {
            return new Subject(in);
        }

        @Override
        public Subject[] newArray(int size) {
            return new Subject[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        if (img == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(img);
        }
        parcel.writeString(name);
        parcel.writeString(desc);
        parcel.writeString(price);
    }
}
