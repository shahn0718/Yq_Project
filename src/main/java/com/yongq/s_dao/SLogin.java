package com.yongq.s_dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.yongq.s_dto.StudentVO;

@Repository("SLogin")
public class SLogin implements SDao{
  
  SDao sdao;
  
  @Override
  public ArrayList<StudentVO> stuList() {
    
    return sdao.stuList();
  }
  
  @Override
  public HashMap<StudentVO, String> stuLogin(String stu_id) {
     
     return sdao.stuLogin(stu_id);
  }

  
  

}
