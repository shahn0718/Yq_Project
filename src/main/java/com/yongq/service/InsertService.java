package com.yongq.service;
/**
 * 
 * @Package Name : com.yongq.service
 * @FileName : InsertService.java
 * @Date : 2018. 6. 7. 
 * @User : AHN
 * @Description : 메뉴 등록(관리자)
 */
public interface InsertService {
  
  // 메뉴 등록
  public void insertMenu(String mn_id, String mn_date, String mn_name, String mn_price, String chain, String mn_type, String mn_sold);
}
