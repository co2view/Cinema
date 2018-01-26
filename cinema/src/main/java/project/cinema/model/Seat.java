package project.cinema.model;

/**
 * Seat model
 * 
 * @author zelimirs
 * @since Jan 26, 2018
 *
 */
public class Seat {

    private int idSeat;
    private int rowNum;
    private int colNum;
    private Theater theater;

    public Seat() {
        super();
    }

    public Seat(int idSeat, int rowNum, int colNum, Theater theater) {
        super();
        this.idSeat = idSeat;
        this.rowNum = rowNum;
        this.colNum = colNum;
        this.theater = theater;
    }

    public int getIdSeat() {
        return idSeat;
    }

    public void setIdSeat(int idSeat) {
        this.idSeat = idSeat;
    }

    public int getRowNum() {
        return rowNum;
    }

    public void setRowNum(int rowNum) {
        this.rowNum = rowNum;
    }

    public int getColNum() {
        return colNum;
    }

    public void setColNum(int colNum) {
        this.colNum = colNum;
    }

    public Theater getTheater() {
        return theater;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }

    @Override
    public String toString() {
        return "Seat [idSeat=" + idSeat + ", rowNum=" + rowNum + ", colNum=" + colNum + ", theater=" + theater + "]";
    }

}
