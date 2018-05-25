package com.yongq.p_dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.yongq.dto.ViewUseVO;

/**
 * 
 * @Package Name : com.yongq.p_dao
 * @FileName : VDaoImpl.java
 * @Date : 2018. 5. 25. 
 * @User : AHN
 * @Description :
 */
public class VDaoImpl implements VDao{
  
  @Autowired
  SqlSession sqlSession;
  
  VDao vdao;
  
  @Override
  public ArrayList<ViewUseVO> chkWeekUsage(String stu_id, String date) {
    // TODO Auto-generated method stub
   
    vdao = sqlSession.getMapper(VDao.class);
    ArrayList<ViewUseVO> chkWeekUsage = vdao.chkWeekUsage(stu_id, date);
    return chkWeekUsage;
  }

  @Override
  public ArrayList<ViewUseVO> chkMthUsage(String stu_id, String date) {
    // TODO Auto-generated method stub
    
    vdao = sqlSession.getMapper(VDao.class);
    ArrayList<ViewUseVO> chkMthUsage = vdao.chkMthUsage(stu_id, date);
    return chkMthUsage;
    
  }

  @Override
  public ArrayList<ViewUseVO> chk3MthUsage(String stu_id, String date) {
    // TODO Auto-generated method stub
    
    vdao = sqlSession.getMapper(VDao.class);
    ArrayList<ViewUseVO> chk3MthUsage = vdao.chk3MthUsage(stu_id, date);
    return chk3MthUsage;
  }

  @Override
  public ArrayList<ViewUseVO> chkAllUsage() {
    // TODO Auto-generated method stub
    
   vdao = sqlSession.getMapper(VDao.class);
   ArrayList<ViewUseVO> chkAllUsage = vdao.chkAllUsage();
   return chkAllUsage;
  }

}
