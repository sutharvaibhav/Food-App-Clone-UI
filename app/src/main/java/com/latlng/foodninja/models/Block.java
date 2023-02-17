package com.latlng.foodninja.models;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Block implements Parcelable {
    public Integer img;
    public String name;
    public String time;

    public Block(Integer img, String name, String time) {
        this.img = img;
        this.name = name;
        this.time = time;
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    protected Block(Parcel in) {
        if (in.readByte() == 0) {
            img = null;
        } else {
            img = in.readInt();
        }
        name = in.readString();
        time = in.readString();
    }

    public static final Creator<Block> CREATOR = new Creator<Block>() {
        @Override
        public Block createFromParcel(Parcel in) {
            return new Block(in);
        }

        @Override
        public Block[] newArray(int size) {
            return new Block[size];
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
        parcel.writeString(time);
    }
}
