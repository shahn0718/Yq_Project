package com.yongq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yongq.s_dao.SDaoImpl;

@Service
public class PayServiceImpl implements PayService{

  @Autowired
  SDaoImpl sdaoImpl;

  @Override
  public void writeRcg(String stu_id, String date, int mn_price) {
   
     sdaoImpl.writeRcg(stu_id, date, mn_price);
  }

  @Override
  public void updateRcg(int mn_price, String stu_id) {
    
    sdaoImpl.updateRcg(mn_price, stu_id);
  }
  
  
}
