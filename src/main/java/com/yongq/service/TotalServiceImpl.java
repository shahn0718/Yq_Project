package com.yongq.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yongq.a_dao.TDaoImpl;
import com.yongq.dto.ViewTotVO;

/**
 * 
 * @Package Name : com.yongq.service
 * @FileName : TotalServiceImpl.java
 * @Date : 2018. 6. 7. 
 * @User : AHN
 * @Description : 정산, 인기메뉴(관리자)
 */
@Service
public class TotalServiceImpl implements TotalService {

  @Autowired
  private TDaoImpl tDaoImpl;
  
  /*
   * 정산 (관리자)
   * 인성관, 환경과학대, 생활관
   */

  @Override
  public ArrayList<ViewTotVO> getInsungTot(String date) {

    return tDaoImpl.getInsungTot(date);
  }

  @Override
  public ArrayList<ViewTotVO> getHwanTot(String date) {
    
    return tDaoImpl.getHwanTot(date);
  }

  @Override
  public ArrayList<ViewTotVO> getDormTot(String date) {
   
    return tDaoImpl.getDormTot(date);
  }
  
  /*
   * 인기메뉴 (관리자)
   * 인성관, 환경과학대, 생활관
   */

  @Override
  public ArrayList<ViewTotVO> getInsungMenu(String date) {
    
    return tDaoImpl.getInsungMenu(date);
  }

  @Override
  public ArrayList<ViewTotVO> getHwanMenu(String date) {
   
    return tDaoImpl.getHwanMenu(date);
  }

  @Override
  public ArrayList<ViewTotVO> getDormMenu(String date) {
    
    return tDaoImpl.getDormMenu(date);
  }
  
}
