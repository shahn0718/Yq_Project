package com.yongq.p_dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.yongq.dto.ViewRcgVO;
import com.yongq.dto.ViewUseVO;

/**
 * 
 * @Package Name : com.yongq.p_dao
 * @FileName : VDaoImpl.java
 * @Date : 2018. 5. 25. 
 * @User : AHN
 * @Description : 사용내역, 충전내역 (학생, 관리자)
 */
public class VDaoImpl implements VDao{
  
  @Autowired
  SqlSession sqlSession;
  
  VDao vdao;
  
  /*
   * 사용 내역
   */
  @Override
  public ArrayList<ViewUseVO> chkStuUsage(String stu_id) {
    // 학생 전체 확인
    
    vdao = sqlSession.getMapper(VDao.class);
    ArrayList<ViewUseVO> chkStuUsage = vdao.chkStuUsage(stu_id);
    
    return chkStuUsage;
  }
  
  @Override
  public ArrayList<ViewUseVO> chkWeekUsage(String stu_id) {
    // 학생 주단위 확인
   
    vdao = sqlSession.getMapper(VDao.class);
    ArrayList<ViewUseVO> chkWeekUsage = vdao.chkWeekUsage(stu_id);
    
    return chkWeekUsage;
  }

  @Override
  public ArrayList<ViewUseVO> chkMthUsage(String stu_id) {
    // 학생 월단위 확인
    
    vdao = sqlSession.getMapper(VDao.class);
    ArrayList<ViewUseVO> chkMthUsage = vdao.chkMthUsage(stu_id);
   
    return chkMthUsage;
    
  }

  @Override
  public ArrayList<ViewUseVO> chk3MthUsage(String stu_id) {
    // 학생 3월 단위 확인
    
    vdao = sqlSession.getMapper(VDao.class);
    ArrayList<ViewUseVO> chk3MthUsage = vdao.chk3MthUsage(stu_id);
    
    return chk3MthUsage;
  }
  
  @Override
  public ArrayList<ViewUseVO> chkTotUsage(String stu_id, String keyword) {
    // 학생 사용내역 총합계
    
    vdao = sqlSession.getMapper(VDao.class);
    ArrayList<ViewUseVO> chkTotUsage = vdao.chkTotUsage(stu_id, keyword);
    
    return chkTotUsage;
  }
  
  @Override
  public ArrayList<ViewUseVO> chkTotUselist(String stu_id, String keyword) {
    // 학생 사용내역 총합계 리스트
    vdao = sqlSession.getMapper(VDao.class);
    ArrayList<ViewUseVO> chkTotlist = vdao.chkTotUselist(stu_id, keyword);
    
    return chkTotlist;
  }
  
  @Override
  public ArrayList<ViewUseVO> chkAllUsage() {
    // 관리자 전체 확인
    
   vdao = sqlSession.getMapper(VDao.class);
   ArrayList<ViewUseVO> chkAllUsage = vdao.chkAllUsage();
   
   return chkAllUsage;
  }
  
  @Override
  public ArrayList<ViewUseVO> chkSearchUsage(String stu_id) {
    // 관리자 특정 학생 검색
    
    vdao =sqlSession.getMapper(VDao.class);
    ArrayList<ViewUseVO> chkSearchUsage = vdao.chkSearchUsage(stu_id);
    
    return chkSearchUsage;
  }
  
  /*
   * 충전 내역
   */
  @Override
  public ArrayList<ViewRcgVO> chkStuRcg(String stu_id) {
    // 학생 전체 확인
    
    vdao =sqlSession.getMapper(VDao.class);
    ArrayList<ViewRcgVO> chkStuRcg = vdao.chkStuRcg(stu_id);
    
    return chkStuRcg;
  }

  @Override
  public ArrayList<ViewRcgVO> chkWeekRcg(String stu_id) {
    // 학생 주단위 확인
    
    vdao = sqlSession.getMapper(VDao.class);
    ArrayList<ViewRcgVO> chkWeekRcg = vdao.chkWeekRcg(stu_id);
    
    return chkWeekRcg;
  }

  @Override
  public ArrayList<ViewRcgVO> chkMthRcg(String stu_id) {
    // 학생 월단위 확인
    
    vdao = sqlSession.getMapper(VDao.class);
    ArrayList<ViewRcgVO> chkMthRcg = vdao.chkMthRcg(stu_id);
    
    return chkMthRcg;
  }

  @Override
  public ArrayList<ViewRcgVO> chk3MthRcg(String stu_id) {
    // 학생 3월단위 확인
    
    vdao = sqlSession.getMapper(VDao.class);
    ArrayList<ViewRcgVO> chk3MthRcg = vdao.chk3MthRcg(stu_id);
    
    return chk3MthRcg;
  }

  @Override
  public ArrayList<ViewRcgVO> chkTotRcg(String stu_id, String keyword) {
    // 학생 충전내역 합계
   
    vdao =sqlSession.getMapper(VDao.class);
    ArrayList<ViewRcgVO>  chkTotRcg = vdao.chkTotRcg(stu_id, keyword);
    
    return chkTotRcg;
  }

  @Override
  public ArrayList<ViewRcgVO> chkTotRcglist(String stu_id, String keyword) {
    // 학생 충전내역 합계 리스트
    
    vdao = sqlSession.getMapper(VDao.class);
    ArrayList<ViewRcgVO> chkTotRcglist = vdao.chkTotRcglist(stu_id, keyword);
   
    return chkTotRcglist;
  }
  
  @Override
  public ArrayList<ViewRcgVO> chkAllRcg() {
    // 관리자 전체 확인
    
    vdao = sqlSession.getMapper(VDao.class);
    ArrayList<ViewRcgVO> chkAllRcg = vdao.chkAllRcg();
    
    return chkAllRcg;
  }


  @Override
  public ArrayList<ViewRcgVO> chkSearchRcg(String stu_id) {
    // 관리자 특정 학생 검색
    
    vdao =sqlSession.getMapper(VDao.class);
    ArrayList<ViewRcgVO> chkSearchRcg = vdao.chkSearchRcg(stu_id);
    
    return chkSearchRcg;
  }
}
