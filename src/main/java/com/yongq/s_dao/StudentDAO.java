package com.yongq.s_dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.yongq.dto.StudentVO;

@Repository("StudentDAO")
public class StudentDAO implements SDao{
  
  SDao sdao;
  
  @Override
  public ArrayList<StudentVO> stuList() {
    
    return sdao.stuList();
  }
  
  @Override
  public HashMap<StudentVO, String> stuLogin(String stu_id) {
     
     return sdao.stuLogin(stu_id);
  }

  @Override
  public HashMap<StudentVO, String> stuInfo(String stu_id) {
    // TODO Auto-generated method stub
    return sdao.stuInfo(stu_id);
  }

  

}
