package com.example.myroom;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity (tableName = "users")
public class User {

    @PrimaryKey
    private int id;

    @ColumnInfo(name = "users_name")
    private String name;

    @ColumnInfo(name = "users_surname")
    private String surname;

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
