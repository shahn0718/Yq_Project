package com.yongq.service;

import java.util.ArrayList;
import java.util.HashMap;

public interface LoginService<T,V> {  
  /*
   * 이진탐색알고리즘 
   * created By Ahn on 2018. 3. 28
   */
  
  /*
   * Student
   * 1. 학생 로그인 (학번)
   * 2. 학생 정보 (학번)
   */
  public HashMap<T,V> stuLogin(String stu_id);
  public ArrayList<T> stuInfo(String stu_id);
  
  /*
   *  Admin
   *  1. 관리자 로그인 (관리자번호)
   *  2. 관리자 정보 (관리자번호)
   */
  public HashMap<T,V>adLogin(String ad_id);
  public ArrayList<T> adInfo(String ad_id);
  
}
