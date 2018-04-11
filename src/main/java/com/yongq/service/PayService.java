package com.yongq.service;

public interface PayService {
  /*
   * 추후에 결제창 만들면 수리해야하는 부분
   * 1. 현재 결제과정은 해당 고정 금액 이므로, 나중에 chain, 가격 설정 보수
   * 2. 사용금액보다 적을때 오류 발생
   */

  //충전 입력(Foruse 테이블)
  public void writeRcg(String stu_id, String date, int mn_price);
  //충전 업데이트 (Student 테이블)
  public void updateRcg(int mn_price, String stu_id);
  //사용 입력(Foruse 테이블)
  public void writeUse(String stu_id, String date, int mn_price);
  //사용 후 개인 돈 업데이트(Student 테이블)
  public void updateUse(int mn_price, String stu_id);
}
