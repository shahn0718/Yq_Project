package com.yongq.service;

import java.util.HashMap;

import com.yongq.dto.AdminVO;
import com.yongq.dto.StudentVO;

public interface LoginService {  
  /*
   * Student
   * 1. 학생 로그인 (학번)
   * 2. 학생 정보 (학번)
   */
  public HashMap<StudentVO,String> stuLogin(String stu_id);
  public HashMap<StudentVO,String> stuInfo(String stu_id);
  
  /*
   *  Admin
   *  1. 관리자 로그인 (관리자번호)
   *  2. 관리자 정보 (관리자번호)
   */
  public HashMap<AdminVO,String>adLogin(String ad_id);
  
  
}
