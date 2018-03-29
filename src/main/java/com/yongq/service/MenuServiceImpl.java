package com.yongq.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yongq.dto.MenuVO;
import com.yongq.p_dao.MDaoImpl;

@Service
public class MenuServiceImpl implements MenuService{
  
  @Autowired 
  MDaoImpl mDaoImpl;

  @Override
  public ArrayList<MenuVO> dayMenuH(String date) {
  
    return mDaoImpl.dayMenuH(date);
  }

  @Override
  public ArrayList<MenuVO> dayMenuD(String date) {
   
    return mDaoImpl.dayMenuD(date);
  }

  @Override
  public ArrayList<MenuVO> dayMenuI(String date) {
    
    return mDaoImpl.dayMenuI(date);
  }

  @Override
  public ArrayList<MenuVO> weekMenu() {
   
    return mDaoImpl.weekMenu();
  }

}
