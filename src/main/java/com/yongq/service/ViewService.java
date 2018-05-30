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
  
  //학생 전체
  public ArrayList<T> chkStuUsage(String stu_id);
  
  //1주, 1달, 3달
  public ArrayList<T> chkWeekUsage(String stu_id);
  public ArrayList<T> chkMthUsage(String stu_id);
  public ArrayList<T> chk3MthUsage(String stu_id);
  
  //학생 전체 (관리자)
  public ArrayList<T> chkAllUsage();
  
}
