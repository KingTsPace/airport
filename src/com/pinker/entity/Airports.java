package com.pinker.entity;

public class Airports {
    private Integer id;//机场id
    private String airport_name;//机场名称
    private String city_name;//所属城市

    public Airports() {
    }

    @Override
    public String toString() {
        return "Airports{" +
                "id=" + id +
                ", airport_name='" + airport_name + '\'' +
                ", city_name='" + city_name + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAirport_name() {
        return airport_name;
    }

    public void setAirport_name(String airport_name) {
        this.airport_name = airport_name;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public Airports(Integer id, String airport_name, String city_name) {

        this.id = id;
        this.airport_name = airport_name;
        this.city_name = city_name;
    }
}
