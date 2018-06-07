package com.yongq.a_dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yongq.dto.ViewTotVO;
/**
 * 
 * @Package Name : com.yongq.a_dao
 * @FileName : TDaoImpl.java
 * @Date : 2018. 6. 7. 
 * @User : AHN
 * @Description : 정산 , 인기메뉴(관리자)
 */
@Repository("TDaoImpl")
public class TDaoImpl implements TDao {

  @Autowired
  SqlSession sqlSession;
  
  TDao tdao;
  
  /*
   * 정산(관리자)
   * 인성관, 환경과학대, 기숙사
   */
  
  @Override
  public ArrayList<ViewTotVO> getInsungTot(String date) {
    
    tdao = sqlSession.getMapper(TDao.class);
    ArrayList<ViewTotVO> getInsungTot = tdao.getInsungTot(date);
    
    return getInsungTot;
  }

  @Override
  public ArrayList<ViewTotVO> getHwanTot(String date) {
    
    tdao = sqlSession.getMapper(TDao.class);
    ArrayList<ViewTotVO> getHwanTot = tdao.getHwanTot(date);
    
    return getHwanTot;
  }

  @Override
  public ArrayList<ViewTotVO> getDormTot(String date) {
   
    tdao = sqlSession.getMapper(TDao.class);
    ArrayList<ViewTotVO> getDormTot = tdao.getDormTot(date);
    
    return getDormTot;
  }
  
  /*
   * 인기메뉴(관리자)
   * 인성관, 환경과학대, 기숙사
   */

  @Override
  public ArrayList<ViewTotVO> getInsungMenu(String date) {
    
    tdao = sqlSession.getMapper(TDao.class);
    ArrayList<ViewTotVO> getInsungMenu = tdao.getInsungMenu(date);
    
    return getInsungMenu;
  }

  @Override
  public ArrayList<ViewTotVO> getHwanMenu(String date) {
    
    tdao = sqlSession.getMapper(TDao.class);
    ArrayList<ViewTotVO> getHwanMenu = tdao.getHwanMenu(date);
    
    return getHwanMenu;
  }

  @Override
  public ArrayList<ViewTotVO> getDormMenu(String date) {

    tdao = sqlSession.getMapper(TDao.class);
    ArrayList<ViewTotVO> getDormMenu = tdao.getDormMenu(date);
    
    return getDormMenu;
  }

}
