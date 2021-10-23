package com.example.aplikasimakanan;

import android.os.Parcel;
import android.os.Parcelable;

public class ModelMenu implements Parcelable {

    private int IMAGE_MAKANAN;
    private String NAMA_MAKANAN;
    private  String DESC_MAKANAN;
    private int HARGA_MAKANAN;

    public ModelMenu(int image_makanan, String nama_makanan, String desc_makanan, int harga_makanan){
        IMAGE_MAKANAN = image_makanan;
        NAMA_MAKANAN = nama_makanan;
        DESC_MAKANAN = desc_makanan;
        HARGA_MAKANAN = harga_makanan;

    }

    protected ModelMenu(Parcel in) {
        IMAGE_MAKANAN = in.readInt();
        NAMA_MAKANAN = in.readString();
        DESC_MAKANAN = in.readString();
        HARGA_MAKANAN = in.readInt();
    }

    public static final Creator<ModelMenu> CREATOR = new Creator<ModelMenu>() {
        @Override
        public ModelMenu createFromParcel(Parcel in) {
            return new ModelMenu(in);
        }

        @Override
        public ModelMenu[] newArray(int size) {
            return new ModelMenu[size];
        }
    };

    public int getIMAGE_MAKANAN() {
        return IMAGE_MAKANAN;
    }

    public void setIMAGE_MAKANAN(int IMAGE_MAKANAN) {
        this.IMAGE_MAKANAN = IMAGE_MAKANAN;
    }

    public String getNAMA_MAKANAN() {
        return NAMA_MAKANAN;
    }

    public void setNAMA_MAKANAN(String NAMA_MAKANAN) {
        this.NAMA_MAKANAN = NAMA_MAKANAN;
    }

    public String getDESC_MAKANAN() {
        return DESC_MAKANAN;
    }

    public void setDESC_MAKANAN(String DESC_MAKANAN) {
        this.DESC_MAKANAN = DESC_MAKANAN;
    }

    public int getHARGA_MAKANAN() {
        return HARGA_MAKANAN;
    }

    public void setHARGA_MAKANAN(int HARGA_MAKANAN) {
        this.HARGA_MAKANAN = HARGA_MAKANAN;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(IMAGE_MAKANAN);
        dest.writeString(NAMA_MAKANAN);
        dest.writeString(DESC_MAKANAN);
        dest.writeInt(HARGA_MAKANAN);
    }
}

