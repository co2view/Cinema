package project.cinema.model;

/**
 * 
 * Ticket model
 * 
 * @author zelimirs
 * @since Jan 26, 2018
 *
 */
public class Ticket {

    private int idTicket;
    private Projection projection;
    private Seat seat;
    private TicketStatus ticketStatus;

    public Ticket() {
        super();
    }

    public Ticket(int idTicket, Projection projection, Seat seat, TicketStatus ticketStatus) {
        super();
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

    @Override
    public String toString() {
        return "Ticket [idTicket=" + idTicket + ", projection=" + projection + ", seat=" + seat + ", ticketStatus=" + ticketStatus + "]";
    }

}
