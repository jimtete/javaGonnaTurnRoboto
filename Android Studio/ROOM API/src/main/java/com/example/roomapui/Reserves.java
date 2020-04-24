package com.example.roomapui;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;

@Entity (tableName = "reservation",
primaryKeys = {"rsid","rbid","rdate"},
foreignKeys = {
        @ForeignKey(entity = Sailors.class,
        parentColumns = "sid",
        childColumns = "rsid",
        onDelete = ForeignKey.CASCADE,
        onUpdate = ForeignKey.CASCADE),
        @ForeignKey(entity = Boats.class,
                parentColumns = "bid",
                childColumns = "rbid",
                onDelete = ForeignKey.CASCADE,
                onUpdate = ForeignKey.CASCADE)
})

public class Reserves {

    @ColumnInfo (name="rsid") @NonNull
    private int sid;

    @ColumnInfo (name="rbid") @NonNull
    private int bid;

    @ColumnInfo (name="rdate") @NonNull
    private String res_day;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getRes_day() {
        return res_day;
    }

    public void setRes_day(String res_day) {
        this.res_day = res_day;
    }
}
