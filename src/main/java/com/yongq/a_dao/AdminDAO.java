package com.yongq.a_dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.yongq.dto.AdminVO;

@Repository("AdminDAO")
public class AdminDAO implements ADao{

  
  ADao adao;
  
  @Override
  public ArrayList<AdminVO> adList() {
    // TODO Auto-generated method stub
    return adao.adList();
  }

  @Override
  public HashMap<AdminVO, String> adLogin(String ad_id) {
    // TODO Auto-generated method stub
    return adao.adLogin(ad_id);
  }
  

}