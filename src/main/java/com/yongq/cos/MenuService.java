package com.yongq.cos;

import java.util.ArrayList;

import com.yongq.dto.MenuVO;

public interface MenuService {

  /*
   * 메뉴 확인(일일 메뉴)
   * H = 환경과학대 D = 기숙사 I = 인성관
   */
  public ArrayList<MenuVO> dayMenuH(String date);
  public ArrayList<MenuVO> dayMenuD(String date);
  public ArrayList<MenuVO> dayMenuI(String date);
  //메뉴 확인(주간 메뉴)
  public ArrayList<MenuVO> weekMenu();
}
