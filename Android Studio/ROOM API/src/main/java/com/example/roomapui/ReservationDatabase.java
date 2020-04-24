package com.example.roomapui;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Sailors.class,Boats.class,Reserves.class},version = 1)
public abstract class ReservationDatabase extends RoomDatabase {
    public abstract MyDao myDao();
}
