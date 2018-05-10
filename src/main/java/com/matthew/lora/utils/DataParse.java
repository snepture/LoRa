package com.matthew.lora.utils;

import com.matthew.lora.domian.Lora;

/**
 * Created by shuiyu on 2017/6/6.
 */
public class DataParse {

    public static Lora data2Lora(String data) {
        Lora LoRa = new Lora();
        String[] str = data.split(",");
        String[] str1 = str[0].split("=");
        String[] datas = str[2].split(":");
        String time = str1[1];
        LoRa.setDatetime(time);
        String id = str[1];
        int ID = Integer.parseInt(id);
        LoRa.setSensorId(ID);
        String temperature = datas[0]+datas[1]+datas[2]+datas[3];
        Float Temperature = Float.intBitsToFloat(Integer.valueOf(temperature.trim(), 16));
        LoRa.setTemperature(Temperature);
        String humidity = datas[4]+datas[5]+datas[6]+datas[7];
        Float Humidity = Float.intBitsToFloat(Integer.valueOf(humidity.trim(), 16));
        LoRa.setHumidity(Humidity);
        String dewdrop = datas[8]+datas[9]+datas[10]+datas[11];
        Float Dewdrop = Float.intBitsToFloat(Integer.valueOf(dewdrop.trim(), 16));
        LoRa.setDewdrop(Dewdrop);
        String rssi = str[3].substring(0,2);
        Float RSSI = Float.intBitsToFloat(Integer.valueOf(rssi.trim(), 16));
        LoRa.setRSSI(RSSI);
        //这里写解析规则，返回实体
        return LoRa;
    }
}
