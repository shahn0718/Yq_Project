package com.yongq.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yongq.a_dao.ADaoImpl;
import com.yongq.dto.AdminVO;
import com.yongq.dto.StudentVO;
import com.yongq.s_dao.SDaoImpl;

@Service
public class LoginServiceImpl implements LoginService{

  @Autowired
  private SDaoImpl sDaoImpl;
  @Autowired
  private ADaoImpl aDaoImpl;
  
  @Override
  public HashMap<StudentVO, String> stuLogin(String stu_id) {
    
    return sDaoImpl.stuLogin(stu_id);
  }
  @Override
  public ArrayList<StudentVO> stuInfo(String stu_id) {
    
    return sDaoImpl.stuInfo(stu_id);
  }
  
  @Override
  public HashMap<AdminVO, String> adLogin(String ad_id) {
    
    return aDaoImpl.adLogin(ad_id);
  }
  
  @Override
  public ArrayList<AdminVO> adInfo(String ad_id) {
    
    return aDaoImpl.adInfo(ad_id);
  }
  @Override
  public ArrayList<StudentVO> findPw(String stu_id) {
    // 관리자 - 학생 비밀번호 찾기
    return aDaoImpl.findPw(stu_id);
  }
  
  
}
