package com.example.lab_work_smd_section_bscs_6c.cardView;

public class myModel {
    public String Name;
    public int totalDownlaods,thumbnails;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getTotalDownlaods() {
        return totalDownlaods;
    }

    public void setTotalDownlaods(int totalDownlaods) {
        this.totalDownlaods = totalDownlaods;
    }

    public int getThumbnails() {
        return thumbnails;
    }

    public void setThumbnails(int thumbnails) {
        this.thumbnails = thumbnails;
    }

    public myModel(String name, int totalDownlaods, int thumbnails) {
        Name = name;
        this.totalDownlaods = totalDownlaods;
        this.thumbnails = thumbnails;
    }
}
