package com.pinker.entity;

import java.util.Date;

public class Flights {
    private Integer id;//航班id
    private String light_code;//航班编号
    private Date flight_date;//航班日期
    private String airline;//所属航空公司
    private String type;//机型
    private Integer tak_airport_id;//起飞机场id
    private int landing_airport_id;//降落机场id
    private Date take_time;//起飞时间
    private Date landing_time;//降落时间
    private String flight_time;//飞行时长
    private String stop_airport;//经停机场
    private double reference_pric;//参考报价

    @Override
    public String toString() {
        return "flights{" +
                "id=" + id +
                ", light_code='" + light_code + '\'' +
                ", flight_date=" + flight_date +
                ", airline='" + airline + '\'' +
                ", type='" + type + '\'' +
                ", tak_airport_id=" + tak_airport_id +
                ", landing_airport_id=" + landing_airport_id +
                ", take_time=" + take_time +
                ", landing_time=" + landing_time +
                ", flight_time='" + flight_time + '\'' +
                ", stop_airport='" + stop_airport + '\'' +
                ", refrence_pric=" + reference_pric +
                '}';
    }

    public double getReference_pric() {
        return reference_pric;
    }

    public void setReference_pric(double refrence_pric) {
        this.reference_pric = refrence_pric;
    }

    public Flights(Integer id, String light_code, Date flight_date, String airline, String type, Integer tak_airport_id, int landing_airport_id, Date take_time, Date landing_time, String flight_time, String stop_airport, double refrence_pric) {

        this.id = id;
        this.light_code = light_code;
        this.flight_date = flight_date;
        this.airline = airline;
        this.type = type;
        this.tak_airport_id = tak_airport_id;
        this.landing_airport_id = landing_airport_id;
        this.take_time = take_time;
        this.landing_time = landing_time;
        this.flight_time = flight_time;
        this.stop_airport = stop_airport;
        this.reference_pric = refrence_pric;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLight_code() {
        return light_code;
    }

    public void setLight_code(String light_code) {
        this.light_code = light_code;
    }

    public Date getFlight_date() {
        return flight_date;
    }

    public void setFlight_date(Date flight_date) {
        this.flight_date = flight_date;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getTak_airport_id() {
        return tak_airport_id;
    }

    public void setTak_airport_id(Integer tak_airport_id) {
        this.tak_airport_id = tak_airport_id;
    }

    public int getLanding_airport_id() {
        return landing_airport_id;
    }

    public void setLanding_airport_id(int landing_airport_id) {
        this.landing_airport_id = landing_airport_id;
    }

    public Date getTake_time() {
        return take_time;
    }

    public void setTake_time(Date take_time) {
        this.take_time = take_time;
    }

    public Date getLanding_time() {
        return landing_time;
    }

    public void setLanding_time(Date landing_time) {
        this.landing_time = landing_time;
    }

    public String getFlight_time() {
        return flight_time;
    }

    public void setFlight_time(String flight_time) {
        this.flight_time = flight_time;
    }

    public String getStop_airport() {
        return stop_airport;
    }

    public void setStop_airport(String stop_airport) {
        this.stop_airport = stop_airport;
    }

    public Flights() {

    }

    public Flights(Integer id, String light_code, Date flight_date, String airline, String type, Integer tak_airport_id, int landing_airport_id, Date take_time, Date landing_time, String flight_time, String stop_airport) {

        this.id = id;
        this.light_code = light_code;
        this.flight_date = flight_date;
        this.airline = airline;
        this.type = type;
        this.tak_airport_id = tak_airport_id;
        this.landing_airport_id = landing_airport_id;
        this.take_time = take_time;
        this.landing_time = landing_time;
        this.flight_time = flight_time;
        this.stop_airport = stop_airport;
    }
}
