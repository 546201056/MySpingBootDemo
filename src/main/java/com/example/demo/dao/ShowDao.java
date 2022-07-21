package com.example.demo.dao;


import com.example.demo.domain.Info;

import java.util.List;

/**
 * Created by mickjoust on 2016/6/8.
 * com.hjf.boot.demo.boot_mybatis_mvc.dao
 */
@Mapper
public interface ShowDao {

    List<Info> findByAge(Integer age);
}
