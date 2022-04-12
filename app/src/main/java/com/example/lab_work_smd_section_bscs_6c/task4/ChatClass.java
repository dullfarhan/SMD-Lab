package com.example.lab_work_smd_section_bscs_6c.task4;

import android.media.Image;

public class ChatClass {
        String Name,Message;
        int  Images;

    public String getName() {
        return Name;
    }

    public void setName(String city) {
        Name = city;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String visitors) {
        Message = visitors;
    }

    public int getImage() {
        return Images;
    }

    public void setLikes(int image) {
        Images = image;
    }

    public ChatClass(String name, String message, int image) {
        Name = name;
        Images = image;
        Message = message;
    }
    public ChatClass() {
    }
}
