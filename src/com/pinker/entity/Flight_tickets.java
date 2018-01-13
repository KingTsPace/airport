package com.pinker.entity;

import java.util.Date;

public class Flight_tickets {

    private Integer id;//机票id
    private Integer flight_id;//航班id
    private Date flight_date;//航班时间
    private double ticket_price;//票价
    private String sellCompany;//售票单位

    public Flight_tickets() {
    }

    @Override
    public String toString() {
        return "Flight_tickets{" +
                "id=" + id +
                ", flight_id=" + flight_id +
                ", flight_date=" + flight_date +
                ", ticket_price=" + ticket_price +
                ", sellCompany='" + sellCompany + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFlight_id() {
        return flight_id;
    }

    public void setFlight_id(Integer flight_id) {
        this.flight_id = flight_id;
    }

    public Date getFlight_date() {
        return flight_date;
    }

    public void setFlight_date(Date flight_date) {
        this.flight_date = flight_date;
    }

    public double getTicket_price() {
        return ticket_price;
    }

    public void setTicket_price(double ticket_price) {
        this.ticket_price = ticket_price;
    }

    public String getSellCompany() {
        return sellCompany;
    }

    public void setSellCompany(String sellCompany) {
        this.sellCompany = sellCompany;
    }

    public Flight_tickets(Integer id, Integer flight_id, Date flight_date, double ticket_price, String sellCompany) {

        this.id = id;
        this.flight_id = flight_id;
        this.flight_date = flight_date;
        this.ticket_price = ticket_price;
        this.sellCompany = sellCompany;
    }
}
