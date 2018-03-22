package com.yongq.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yongq.cos.MenuService;
import com.yongq.dto.MenuVO;

@Controller
public class MenuController {
  
  private static final Logger logger = LoggerFactory.getLogger(MenuController.class);

  @Autowired
  private SqlSession sqlSession;
  
  // 오늘 날짜 (일일 메뉴 구할때 이용)
  public String getDate(){
    
    Date d = new Date();
    SimpleDateFormat dF = new SimpleDateFormat("yyyy-MM-dd");
    String getDate = dF.format(d);
    
    return getDate;
    
  }
  
  
  @RequestMapping("/student/menu")
  public String stuDMenu(Model model){
    
    String getDate = getDate();
    MenuService mS = sqlSession.getMapper(MenuService.class);
   
    /*
     * Hlist = 환과대 리스트 Dlist = 기숙사 리스트 Ilist = 인성관 리스트
     * 
     */
    ArrayList<MenuVO> Hlist = mS.dayMenuH(getDate);
    ArrayList<MenuVO> Dlist = mS.dayMenuD(getDate);
    ArrayList<MenuVO> Ilist = mS.dayMenuI(getDate);
    
    model.addAttribute("Hlist",Hlist);
    model.addAttribute("Dlist",Dlist);
    model.addAttribute("Ilist",Ilist);
    
    return "students/Student_Menu";
     
  }
  
  @RequestMapping("/student/weekMenu")
  public String stuWMenu(Model model){
    
    MenuService mS = sqlSession.getMapper(MenuService.class);
    
    ArrayList<MenuVO> weekList = mS.weekMenu();
    model.addAttribute("weekList",weekList);
    
    return "students/WeekMenu";
  }
  
  
}
