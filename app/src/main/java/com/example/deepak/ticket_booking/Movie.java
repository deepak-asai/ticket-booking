package com.example.deepak.ticket_booking;

/**
 * Created by deepak on 9/7/16.
 */
public class Movie {

    private  int mid;
    private String mname;
    private int nseats;
    private String seats;

    public Movie(String mname, int nseats, String seats ){
        this.mname = mname;
        this.nseats = nseats;
        this.seats = seats;

    }

    public int getMid() {
        return mid;
    }

    public String getMname() {
        return mname;
    }

    public int getNseats() {
        return nseats;
    }

    public String getSeats() {
        return seats;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public void setNseats(int nseats) {
        this.nseats = nseats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }
}
