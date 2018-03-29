package com.yongq.p_dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yongq.dto.MenuVO;

@Repository("MDaoImpl")
public class MDaoImpl implements MDao{

  @Autowired
  SqlSession sqlSession;
  
  MDao mdao;
  
  @Override
  public ArrayList<MenuVO> dayMenuH(String date) {
   
    mdao = sqlSession.getMapper(MDao.class);
    ArrayList<MenuVO> dayMenuH = mdao.dayMenuH(date);
    
    return dayMenuH;
  }

  @Override
  public ArrayList<MenuVO> dayMenuD(String date) {
    
    mdao = sqlSession.getMapper(MDao.class);
    ArrayList<MenuVO> dayMenuD = mdao.dayMenuD(date);
    
    return dayMenuD;
  }

  @Override
  public ArrayList<MenuVO> dayMenuI(String date) {
    
    mdao = sqlSession.getMapper(MDao.class);
    ArrayList<MenuVO> dayMenuI = mdao.dayMenuI(date);
    
    return dayMenuI;
  }

  @Override
  public ArrayList<MenuVO> weekMenu() {
    
    mdao = sqlSession.getMapper(MDao.class);
    ArrayList<MenuVO> weekMenu = mdao.weekMenu();
    
    return weekMenu;
  }

}
