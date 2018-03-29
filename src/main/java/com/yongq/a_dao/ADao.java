package com.yongq.a_dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.yongq.dto.AdminVO;

public interface ADao {

  //Test용 list 불러오기(관리자)
  public ArrayList<AdminVO> adList();
  //관리자 로그인(관리자번호)
  public HashMap<AdminVO,String>adLogin(String ad_id);
  //관리자 정보(관리자번호)
  public ArrayList<AdminVO> adInfo(String ad_id);
}
