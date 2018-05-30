package com.yongq.service;

import java.util.ArrayList;

/**
 * 
 * @Package Name : com.yongq.service
 * @FileName : ViewService.java
 * @Date : 2018. 5. 25. 
 * @User : AHN
 * @Description : chkWeek , chkMth, chk3Mth  = 1주 , 1달, 3달
 */

public interface ViewService<T> {
  /*
   *  사용 내역
   */
  
  //학생 전체
  public ArrayList<T> chkStuUsage(String stu_id);
  
  //1주, 1달, 3달
  public ArrayList<T> chkWeekUsage(String stu_id);
  public ArrayList<T> chkMthUsage(String stu_id);
  public ArrayList<T> chk3MthUsage(String stu_id);
  
  //학생 전체 (관리자)
  public ArrayList<T> chkAllUsage();
  
  // 사용 내역 검색(학생)
  public ArrayList<T> chkTotUsage(String stu_id, String keyword);
  public ArrayList<T> chkTotUselist(String stu_id, String keyword);
  
  /*
   *  충전 내역
   */
  
  //학생 전체
  public ArrayList<T> chkStuRcg(String stu_id);
  
  //1주, 1달, 3달
  public ArrayList<T> chkWeekRcg(String stu_id);
  public ArrayList<T> chkMthRcg(String stu_id);
  public ArrayList<T> chk3MthRcg(String stu_id);
  
  //학생 전체 (관리자)
  public ArrayList<T> chkAllRcg();
  
  // 충전 내역 검색(학생)
  public ArrayList<T> chkTotRcg(String stu_id, String keyword);
  public ArrayList<T> chkTotRcglist(String stu_id, String keyword);
  
  
}
