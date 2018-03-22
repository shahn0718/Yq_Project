package com.yongq.s_dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.yongq.dto.StudentVO;


public interface SDao {

  //Test용 list 불러오기
  public ArrayList<StudentVO> stuList();
  //학생 로그인 (stu_id)
  public HashMap<StudentVO,String> stuLogin(String stu_id);
  //학생 정보(Info)
  public HashMap<StudentVO,String> stuInfo(String stu_id);
}
