package com.postbox;

import java.util.Scanner;

public class PostBox {
    public static void main(String[] args) {

        float mLength;
        float mWidth;
        int mHeight;

        Scanner sc = new Scanner(System.in);
        Box3 box3  = new Box3(23f, 14f, 13);
        Box5 box5  = new Box5(39.5f, 27.5f, 23);

        System.out.println("Please enter object's length: ");
        mLength = sc.nextFloat();
        System.out.println("Please enter object's width: ");
        mWidth  = sc.nextFloat();
        System.out.println("Please enter object's height: ");
        mHeight = sc.nextInt();

        if (box3.validate(mLength,mWidth,mHeight)){
            System.out.println("Box3");
        }else if(box5.validate(mLength,mWidth,mHeight)){
            System.out.println("Box5");
        }
    }
}
