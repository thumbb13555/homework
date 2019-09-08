package com.postbox;

public class BoxSize {
    float   length;
    float   width;
    int     height;

    public BoxSize(float length, float width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public boolean validate(float inLength,float inWidth,int inHeight){
        return (length>=inLength && width >=inWidth && height >=inHeight);
    }
}
