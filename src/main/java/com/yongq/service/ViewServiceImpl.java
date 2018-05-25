package com.yongq.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yongq.dto.ViewUseVO;
import com.yongq.p_dao.VDaoImpl;

/**
 * 
 * @Package Name : com.yongq.service
 * @FileName : ViewService.java
 * @Date : 2018. 5. 25. 
 * @User : AHN
 * @Description :
 */
@Service
public class ViewServiceImpl implements ViewService<ViewUseVO> {

  @Autowired
  VDaoImpl vDaoImpl;
  
  @Override
  public ArrayList<ViewUseVO> chkWeekUsage(String stu_id, String date) {
    // TODO Auto-generated method stub
    return vDaoImpl.chkWeekUsage(stu_id, date);
  }

  @Override
  public ArrayList<ViewUseVO> chkMthUsage(String stu_id, String date) {
    // TODO Auto-generated method stub
    return vDaoImpl.chkMthUsage(stu_id, date);
  }

  @Override
  public ArrayList<ViewUseVO> chk3MthUsage(String stu_id, String date) {
    // TODO Auto-generated method stub
    return vDaoImpl.chk3MthUsage(stu_id, date);
  }

  @Override
  public ArrayList<ViewUseVO> chkAllUsage() {
    // TODO Auto-generated method stub
    return vDaoImpl.chkAllUsage();
  }

}
