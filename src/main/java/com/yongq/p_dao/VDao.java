package com.yongq.p_dao;

import java.util.ArrayList;

import com.yongq.dto.ViewUseVO;

/**
 * 
 * @Package Name : com.yongq.p_dao
 * @FileName : VDao.java
 * @Date : 2018. 5. 25. 
 * @User : AHN
 * @Description : 사용내역 조회
 */
public interface VDao {

  // 학생 (주,달,3달)
  public ArrayList<ViewUseVO> chkWeekUsage(String stu_id, String date);
  public ArrayList<ViewUseVO> chkMthUsage(String stu_id, String date);
  public ArrayList<ViewUseVO> chk3MthUsage(String stu_id, String date);
  
  // 관리자 (전체)
  public ArrayList<ViewUseVO> chkAllUsage();
}