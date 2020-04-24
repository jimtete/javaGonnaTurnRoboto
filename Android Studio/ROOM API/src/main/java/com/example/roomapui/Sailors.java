package com.example.roomapui;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "sailor")
public class Sailors {

    @PrimaryKey @ColumnInfo (name="sid")
    private int id;

    @ColumnInfo (name = "sname")
    private String name;

    @ColumnInfo (name = "sage")
    private int age;

    @ColumnInfo(name = "srating")
    private int rating;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
