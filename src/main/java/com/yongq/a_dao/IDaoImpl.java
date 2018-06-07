package com.yongq.a_dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 
 * @Package Name : com.yongq.a_dao
 * @FileName : IDaoImpl.java
 * @Date : 2018. 6. 7. 
 * @User : AHN
 * @Description : 메뉴 등록(관리자)
 */

@Repository("IDaoImpl")
public class IDaoImpl implements IDao {

  @Autowired
  SqlSession sqlSession;
  
  IDao idao;
  
  @Override
  public void insertMenu(String mn_id, String mn_date, String mn_name, String mn_price, String chain, String mn_type,
      String mn_sold) {
    
    idao = sqlSession.getMapper(IDao.class);
    idao.insertMenu(mn_id, mn_date, mn_name, mn_price, chain, mn_type, mn_sold);

  }

}
