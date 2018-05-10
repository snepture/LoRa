package com.matthew.lora.controller;

import com.google.gson.Gson;
import com.matthew.lora.domian.Lora;
import com.matthew.lora.mapper.LoraMapper;
import com.matthew.lora.utils.DataParse;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by shuiyu on 2017/6/5.
 */
@RestController
@RequestMapping(value = "/lora")
public class LoRaController {
    @Autowired
    private LoraMapper loraMapper;
    @RequestMapping(value = "/save",method = {RequestMethod.GET, RequestMethod.POST})
    public String save(HttpServletRequest request) throws IOException {
        String result = request.getQueryString();
        new DataParse();
        Lora LoRa = DataParse.data2Lora(result);
        loraMapper.save(LoRa);
        //这里写解析数据，解析完的数据用loramapper.save(lora)就好了
        //大概样子就是先从request里面获取数据，比如叫data，然后调用dataparse的解析数据方法，得到lora，然后save
        return "ok";
    }
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(HttpServletRequest request){
        //这个是helloworl测试
        return "helloworld";
    }
    @RequestMapping(value="/all",method = RequestMethod.GET)
    public Object getAll(){
        Lora lora = new Lora();
        lora.setSensorId(1);
        List<Lora> loras = loraMapper.search(lora);
       //这里写查询方法，查询方法是loraMapper.search();参数是lora
        return new Gson().toJson(loras);
    }
}
