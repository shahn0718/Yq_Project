package com.yongq.service;

import java.util.ArrayList;

import com.yongq.dto.ViewTotVO;

/**
 * 
 * @Package Name : com.yongq.service
 * @FileName : TotalService.java
 * @Date : 2018. 6. 7. 
 * @User : AHN
 * @Description : 정산, 인기 메뉴(관리자)
 */
public interface TotalService {
  
  /*
   * 정산
   * 인성관, 환과대, 기숙사
   */
  
  public ArrayList<ViewTotVO> getInsungTot(String date);
  public ArrayList<ViewTotVO> getHwanTot(String date);
  public ArrayList<ViewTotVO> getDormTot(String date);
  
  /*
   * 인기메뉴
   * 인성관, 환과대, 기숙사
   */
  
  public ArrayList<ViewTotVO> getInsungMenu(String date);
  public ArrayList<ViewTotVO> getHwanMenu(String date);
  public ArrayList<ViewTotVO> getDormMenu(String date);
  

}
