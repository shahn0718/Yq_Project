package com.yongq.service;

import java.util.ArrayList;

public interface MenuService<T> {

  /*
   * 메뉴 확인(일일 메뉴)
   * H = 환경과학대 D = 기숙사 I = 인성관
   */
  public ArrayList<T> dayMenuH(String date);
  public ArrayList<T> dayMenuD(String date);
  public ArrayList<T> dayMenuI(String date);
  //메뉴 확인(주간 메뉴)
  public ArrayList<T> weekMenu();
}
