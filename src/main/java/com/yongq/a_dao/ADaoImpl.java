package com.yongq.a_dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yongq.dto.AdminVO;

@Repository("ADaoImpl")
public class ADaoImpl implements ADao{

  @Autowired
  SqlSession sqlSession;
  
  ADao adao;

  @Override
  public ArrayList<AdminVO> adList() {
    
    adao = sqlSession.getMapper(ADao.class);
    ArrayList<AdminVO> adlist = adao.adList();
    return adlist;
  }

  @Override
  public HashMap<AdminVO, String> adLogin(String ad_id) {
    
    adao = sqlSession.getMapper(ADao.class);
    HashMap<AdminVO,String>adLogin = adao.adLogin(ad_id);
    
    return adLogin;
  }
  

}
