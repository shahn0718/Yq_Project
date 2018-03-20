package com.yongq.a_dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.yongq.a_dto.AdminVO;

public interface ADao {

  public ArrayList<AdminVO> adList();
  public HashMap<AdminVO,String>adLogin(String ad_id);
}
