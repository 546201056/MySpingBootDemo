package com.example.demo.dao;

import com.example.demo.entity.PhoneConts;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<PhoneConts,Integer> {
//    /**
//     *  通过参数查询
//     * @param sdk
//     * @return
//     */
//    public List<PhoneConts> findByAndANDROID_ID(String id);

}
