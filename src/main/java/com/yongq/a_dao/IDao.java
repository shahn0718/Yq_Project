package com.yongq.a_dao;
/**
 * 
 * @Package Name : com.yongq.a_dao
 * @FileName : IDao.java
 * @Date : 2018. 6. 7. 
 * @User : AHN
 * @Description : 메뉴 등록(관리자)
 */

public interface IDao {

  //메뉴 등록(관리자)
  public void insertMenu(String mn_id, String mn_date, String mn_name, String mn_price, String chain, String mn_type, String mn_sold);

}
