package com.yongq.service;

public interface PayService {
/*
 * 1. mybatis 
 * 2. 
 * 
 */
  
  //충전 입력(Foruse 테이블)
  public void writeRcg(String stu_id, String date, int mn_price);
  //충전 업데이트 (Student 테이블)
  public void updateRcg(int mn_price, String stu_id);
}
