package com.example.ap_10_12_firebase_demo;

import com.google.firebase.firestore.DocumentReference;

public class Reserves {
    private String resDay;
    private DocumentReference sid,bid;

    public String getResDay() {
        return resDay;
    }

    public void setResDay(String resDay) {
        this.resDay = resDay;
    }

    public DocumentReference getSid() {
        return sid;
    }

    public void setSid(DocumentReference sid) {
        this.sid = sid;
    }

    public DocumentReference getBid() {
        return bid;
    }

    public void setBid(DocumentReference bid) {
        this.bid = bid;
    }
}
