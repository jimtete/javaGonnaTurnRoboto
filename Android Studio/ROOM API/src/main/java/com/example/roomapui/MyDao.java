package com.example.roomapui;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface MyDao {

    @Insert
    public void insertSailor(Sailors sailors);

    @Insert
    public void insertBoat(Boats boats);

    @Insert
    public void insertReservation(Reserves reserves);

    @Insert
    public void deleteSailor(Sailors sailors);

    @Insert
    public void deleteBoat(Boats boats);

    @Insert
    public void deleteReservation(Reserves reserves);

    @Update
    public void updateSailor(Sailors sailors);

    @Update
    public void updateBoat(Boats boats);

    @Update
    public void updateReservation(Reserves reserves);

    @Query("select * from sailor")
    public List<Sailors> getSailors();

    @Query("select * from boat")
    public List<Boats> getBoats();

    @Query("select * from reservation")
    public List<Reserves> getReserves();

    @Query("SELECT sname as field1, sage as field2 " +
            "FROM sailor")
    public List<ResultStringInt>getQuery4();

    @Query("SELECT * FROM SAILOR "+
    "WHERE srating>7")
    public List<Sailors> getQuery5();

    @Query("SELECT DISTINCT S.sname FROM SAILOR S "+
    "JOIN reservation r ON S.sid=R.rsid "+
    "WHERE r.rbid=103")
    public List<String> getQuery6();

    @Query("SELECT DISTINCT r.rsid FROM reservation r "+
    "JOIN boat b ON b.bid=r.rbid "+
    "WHERE b.bcolor='red'")
    public List<Integer> getQuery7();

    @Query("SELECT DISTINCT S.sname FROM Sailor S "+
    "JOIN reservation R ON S.sid=R.rsid INNER JOIN BOAT B ON R.rbid = B.bid WHERE B.bcolor='red'")
    public List<String> getQuery8();

    @Query("SELECT DISTINCT S.sage FROM SAILOR S WHERE S.sname LIKE 'B_%b'")
    public List<Integer> getQuery9();

    @Query("SELECT DISTINCT S.sname FROM Sailor S "+
    "JOIN reservation R ON S.sid=R.rsid JOIN boat B ON R.rbid = B.bid "+
    "WHERE B.bcolor='red' "+
    "INTERSECT "+
    "SELECT DISTINCT S.sname FROM Sailor S "+
    "JOIN reservation R ON S.sid=R.rsid JOIN boat B ON R.rbid = B.bid "+
    "WHERE B.bcolor='green' ")
    public List<String> getQuery10();


    @Query("SELECT DISTINCT S.sid FROM Sailor S "+
            "JOIN reservation R ON S.sid=R.rsid JOIN boat B ON R.rbid = B.bid "+
            "WHERE B.bcolor='red' "+
            "EXCEPT "+
            "SELECT DISTINCT S.sname FROM Sailor S "+
            "JOIN reservation R ON S.sid=R.rsid JOIN boat B ON R.rbid = B.bid "+
            "WHERE B.bcolor='green' ")
    public List<Integer> getQuery11();

    @Query("SELECT DISTINCT S.sname FROM Sailor S "+
    "WHERE S.sid IN (SELECT R.rsid FROM reservation R "+
    "WHERE R.rbid IN (SELECT B.bid FROM Boat B WHERE B.bcolor = 'red'))")
    public List<String> getQuery12();

    @Query("SELECT S.sname FROM Sailor S "+
    "WHERE EXISTS (SELECT * "+
    "FROM reservation R JOIN Boat B ON R.rbid = B.bid WHERE S.sid = R.rsid AND B.bcolor='red')")
    public List<String> getQuery13();

    @Query("SELECT sname as field1, Max(sage) as field2 FROM sailor GROUP BY sname")
    public List<ResultStringInt>getQuery14();

    @Query("SELECT DISTINCT S.sname FROM Sailor S JOIN "+
    "reservation R on S.sid=R.rsid JOIN boat B ON R.rbid=B.bid "+
    "WHERE B.bcolor= :inputcolor")
    public List<String> getQuery15(String inputcolor);


}
