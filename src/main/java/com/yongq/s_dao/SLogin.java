package com.yongq.s_dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.yongq.s_dto.StudentVO;

public class SLogin implements SDao {

  
  JdbcTemplate template;
  
  @Autowired
  public void setTemplate(JdbcTemplate template) {
    this.template = template;
  }

  @Override
  public ArrayList<StudentVO> stuList() {
    // TODO Auto-generated method stub
    return null;
  }

  
  

}
