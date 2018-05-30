package com.yongq.p_dao;

import java.util.ArrayList;

import com.yongq.dto.ViewRcgVO;
import com.yongq.dto.ViewUseVO;

/**
 * 
 * @Package Name : com.yongq.p_dao
 * @FileName : VDao.java
 * @Date : 2018. 5. 25. 
 * @User : AHN
 * @Description : 사용내역 조회 , 충전 내역 조회
 */
public interface VDao {

  /*
   *  사용 내역
   */
  
  // 학생 전체
  public ArrayList<ViewUseVO> chkStuUsage(String stu_id);
  
  // 학생 (주,달,3달)
  public ArrayList<ViewUseVO> chkWeekUsage(String stu_id);
  public ArrayList<ViewUseVO> chkMthUsage(String stu_id);
  public ArrayList<ViewUseVO> chk3MthUsage(String stu_id);
  
  // 관리자 (전체)
  public ArrayList<ViewUseVO> chkAllUsage();
  
  // 사용내역 총합계
  public ArrayList<ViewUseVO> chkTotUsage(String stu_id, String keyword);
  public ArrayList<ViewUseVO> chkTotlist(String stu_id, String keyword);
  
  /*
   *  충전 내역
   */
  
  // 학생 전체
  public ArrayList<ViewRcgVO> chkStuRcg(String stu_id);
  
  // 학생 (주,달,3달)
  public ArrayList<ViewRcgVO> chkWeekRcg(String stu_id);
  public ArrayList<ViewRcgVO> chkMthRcg(String stu_id);
  public ArrayList<ViewRcgVO> chk3MthRcg(String stu_id);
  
  //관리자 전체
  public ArrayList<ViewRcgVO> chkAllRcg();
  
}