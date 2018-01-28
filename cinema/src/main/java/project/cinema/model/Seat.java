package project.cinema.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Seat model
 * 
 * @author zelimirs
 * @since Jan 26, 2018
 *
 */
@Entity
@Table(name="seat")
public class Seat {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_seat")
    private int idSeat;
	
	@Column(name="rov_num", nullable = false,unique=false)
    private int rowNum;
	
	@Column(name="col_num", nullable = false,unique=false)
    private int colNum;
	
	@JsonIgnore
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_theater", nullable = false,unique=false) 
    private Theater theater;

    public Seat() {
    }

    public Seat(int idSeat, int rowNum, int colNum, Theater theater) {
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

}
