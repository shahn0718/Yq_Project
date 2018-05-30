package com.yongq.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yongq.dto.ViewRcgVO;
import com.yongq.dto.ViewUseVO;
import com.yongq.p_dao.VDaoImpl;

/**
 * 
 * @Package Name : com.yongq.service
 * @FileName : ViewService.java
 * @Date : 2018. 5. 25. 
 * @User : AHN
 * @Description : 사용내역 , 충전내역 서비스 작업
 */
@Service
public class ViewServiceImpl implements ViewService {

  @Autowired
  VDaoImpl vDaoImpl;

  /*
   *  사용 내역
   */
  @Override
  public ArrayList<ViewUseVO> chkStuUsage(String stu_id) {
    // 학생 전체 확인
    return vDaoImpl.chkStuUsage(stu_id);
  }
  
  @Override
  public ArrayList<ViewUseVO> chkWeekUsage(String stu_id) {
    // 학생 주단위 확인 
    return vDaoImpl.chkWeekUsage(stu_id);
  }

  @Override
  public ArrayList<ViewUseVO> chkMthUsage(String stu_id) {
    // 학생 월단위 확인
    return vDaoImpl.chkMthUsage(stu_id);
  }

  @Override
  public ArrayList<ViewUseVO> chk3MthUsage(String stu_id) {
    // 학생 3월단위 확인
    return vDaoImpl.chk3MthUsage(stu_id);
  }

  @Override
  public ArrayList<ViewUseVO> chkAllUsage() {
    // 관리자 전체 확인
    return vDaoImpl.chkAllUsage();
  }
  
  @Override
  public ArrayList<ViewUseVO> chkTotUsage(String stu_id, String keyword) {
    // 학생 사용내역 총합계
    return vDaoImpl.chkTotUsage(stu_id, keyword) ;
  }
  
  @Override
  public ArrayList chkTotUselist(String stu_id, String keyword) {
    // 학생 사용내역 총합계 리스트
    return vDaoImpl.chkTotUselist(stu_id, keyword);
  }

  /*
   *  충전 내역
   */ 
  @Override
  public ArrayList<ViewRcgVO> chkStuRcg(String stu_id) {
    // 학생 전체 확인
    return vDaoImpl.chkStuRcg(stu_id);
  }

  @Override
  public ArrayList<ViewRcgVO> chkWeekRcg(String stu_id) {
    // 학생 주단위 확인
    return vDaoImpl.chkWeekRcg(stu_id);
  }

  @Override
  public ArrayList<ViewRcgVO> chkMthRcg(String stu_id) {
    // 학생 월단위 확인
    return vDaoImpl.chkMthRcg(stu_id);
  }

  @Override
  public ArrayList<ViewRcgVO> chk3MthRcg(String stu_id) {
    // 학생 3월단위 확인
    return vDaoImpl.chk3MthRcg(stu_id);
  }

  @Override
  public ArrayList<ViewRcgVO> chkAllRcg() {
    // 관리자 전체 확인
    return vDaoImpl.chkAllRcg();
  }

  @Override
  public ArrayList<ViewRcgVO> chkTotRcg(String stu_id, String keyword) {
    // 학생 충전내역 총합계
    return vDaoImpl.chkTotRcg(stu_id, keyword);
  }

  @Override
  public ArrayList<ViewRcgVO> chkTotRcglist(String stu_id, String keyword) {
    // 학생 충전내역 총합계 리스트
    return vDaoImpl.chkTotRcglist(stu_id, keyword);
  }
}
