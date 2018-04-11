package com.yongq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

  @Override
  public void writeUse(String stu_id, String date, int mn_price) {
    // TODO Auto-generated method stub
    sdaoImpl.writeUse(stu_id, date, mn_price);
  }
  
  @Transactional
  @Override
  public void updateUse(int mn_price, String stu_id) {
    // TODO Auto-generated method stub
    sdaoImpl.updateUse(mn_price, stu_id);
  
  }
}
