package com.matthew.lora.domian;

import javax.persistence.*;

/**
 * Created by shuiyu on 2017/6/5.
 */
public class Lora {
    private int id;
    private int sensorId;
    private String datetime;
    private float humidity;
    private float dewdrop;
    private float temperature;

   private float RSSI;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSensorId() {
        return sensorId;
    }

    public void setSensorId(int sensorId) {
        this.sensorId = sensorId;
    }



    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getDewdrop() {
        return dewdrop;
    }

    public void setDewdrop(float dewdrop) {
        this.dewdrop = dewdrop;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getRSSI() {
        return RSSI;
    }

    public void setRSSI(float RSSI) {
        this.RSSI = RSSI;
    }
}
