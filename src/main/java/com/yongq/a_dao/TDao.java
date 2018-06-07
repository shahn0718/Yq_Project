package com.yongq.a_dao;

import java.util.ArrayList;

import com.yongq.dto.ViewTotVO;

/**
 * 
 * @Package Name : com.yongq.a_dao
 * @FileName : TDao.java
 * @Date : 2018. 6. 7. 
 * @User : AHN
 * @Description : 정산, 인기메뉴 (관리자)
 */
public interface TDao {

  /*
   * 정산
   */
  
  public ArrayList<ViewTotVO> getInsungTot(String date);
  public ArrayList<ViewTotVO> getHwanTot(String date);
  public ArrayList<ViewTotVO> getDormTot(String date);
  
  /*
   * 인기메뉴
   */
  
  public ArrayList<ViewTotVO> getInsungMenu(String date);
  public ArrayList<ViewTotVO> getHwanMenu(String date);
  public ArrayList<ViewTotVO> getDormMenu(String date);
}
