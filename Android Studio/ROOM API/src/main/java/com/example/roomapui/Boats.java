package com.example.roomapui;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity (tableName = "boat")
public class Boats {

    @PrimaryKey @ColumnInfo (name = "bid")
    private int id;

    @ColumnInfo (name = "bname")
    private String name;

    @ColumnInfo (name = "bcolor")
    private String color;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
