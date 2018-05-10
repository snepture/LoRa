package com.matthew.lora.mapper;

import com.matthew.lora.domian.Lora;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by shuiyu on 2017/6/6.
 */
@Mapper
public interface LoraMapper {
    int save(Lora account);
    List<Lora> search(Lora opt);
    int delete(long id);

}
