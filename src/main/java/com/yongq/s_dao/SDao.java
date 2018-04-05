package com.yongq.s_dao;

import java.util.ArrayList;
import java.util.HashMap;

public interface SDao<T,E> {

  //Test용 list 불러오기(학생)
  public ArrayList<T> stuList();
  //학생 로그인 (학번)
  public HashMap<T,E> stuLogin(String stu_id);
  //학생 정보(학번)
  public ArrayList<T> stuInfo(String stu_id);
  //학생 충전(삽입) => 사용페이지 입력
  public void writeRcg(String stu_id, String date, int mn_price);
  //학생 충전(업데이트) => 학생정보 업데이트
  public void updateRcg(int mn_price, String stu_id);
}

/*

*
*  1. 주석 작업
*  2. 제네릭프로그래밍 -> 공부 더할 필요성 존재
*  3. 충전 기능 -> 완료
*
*
*
*/