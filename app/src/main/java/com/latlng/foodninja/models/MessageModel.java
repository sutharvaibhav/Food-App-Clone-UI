package com.latlng.foodninja.models;

import android.os.Parcel;
import android.os.Parcelable;

public class MessageModel implements Parcelable {
    public Integer img;
    public String name;
    public String desc;
    public String time;

    public MessageModel(Integer img, String name, String desc, String time) {
        this.img = img;
        this.name = name;
        this.desc = desc;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    protected MessageModel(Parcel in) {
        if (in.readByte() == 0) {
            img = null;
        } else {
            img = in.readInt();
        }
        name = in.readString();
        desc = in.readString();
        time = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        if (img == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(img);
        }
        dest.writeString(name);
        dest.writeString(desc);
        dest.writeString(time);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<MessageModel> CREATOR = new Creator<MessageModel>() {
        @Override
        public MessageModel createFromParcel(Parcel in) {
            return new MessageModel(in);
        }

        @Override
        public MessageModel[] newArray(int size) {
            return new MessageModel[size];
        }
    };
}
