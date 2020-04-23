package com.example.myroom;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity (tableName = "sailors")
public class Sailors {

    @PrimaryKey
    private int code;

    @ColumnInfo(name = "users_name")
    private String name;

    @ColumnInfo(name="boat_color")
    private String color;

    @ColumnInfo(name = "sailors_rating")
    private int rating;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
