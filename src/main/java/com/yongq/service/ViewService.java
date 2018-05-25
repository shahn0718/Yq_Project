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
  
  public ArrayList<T> chkWeekUsage(String stu_id, String date);
  public ArrayList<T> chkMthUsage(String stu_id, String date);
  public ArrayList<T> chk3MthUsage(String stu_id, String date);
  
  
  public ArrayList<T> chkAllUsage();
  
}
