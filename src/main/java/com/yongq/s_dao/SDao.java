package com.yongq.s_dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.yongq.s_dto.StudentVO;


public interface SDao {

  //Test용 list 불러오기
  public ArrayList<StudentVO> stuList();
  public HashMap<StudentVO,String> stuLogin(String stu_id);
}
