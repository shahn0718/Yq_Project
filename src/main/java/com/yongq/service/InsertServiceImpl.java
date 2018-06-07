package com.yongq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yongq.a_dao.IDaoImpl;

/**
 * 
 * @Package Name : com.yongq.service
 * @FileName : InsertServiceImpl.java
 * @Date : 2018. 6. 7. 
 * @User : AHN
 * @Description : 메뉴 등록 (관리자)
 */

@Service
public class InsertServiceImpl implements InsertService {

  @Autowired
  IDaoImpl iDaoImpl;
  
  @Override
  public void insertMenu(String mn_id, String mn_date, String mn_name, String mn_price, String chain, String mn_type,
      String mn_sold) {
    
    iDaoImpl.insertMenu(mn_id, mn_date, mn_name, mn_price, chain, mn_type, mn_sold);

  }

}
