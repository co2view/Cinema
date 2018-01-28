package project.cinema.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * Ticket model
 * 
 * @author zelimirs
 * @since Jan 26, 2018
 *
 */
@Entity
@Table(name="ticket")
public class Ticket {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_ticket")
    private int idTicket;
	
	@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="id_projection", nullable = false, unique=false) 
    private Projection projection;
	
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="id_seat", nullable = false,unique=false) 
    private Seat seat;
    
    @Enumerated(EnumType.STRING)
	@Column(name="ticket_status", nullable = false,unique=false)
    private TicketStatus ticketStatus;

    public Ticket() {
    }

    public Ticket(int idTicket, Projection projection, Seat seat, TicketStatus ticketStatus) {
        this.idTicket = idTicket;
        this.projection = projection;
        this.seat = seat;
        this.ticketStatus = ticketStatus;
    }

    public int getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    public Projection getProjection() {
        return projection;
    }

    public void setProjection(Projection projection) {
        this.projection = projection;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public TicketStatus getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(TicketStatus ticketStatus) {
        this.ticketStatus = ticketStatus;
    }


}
