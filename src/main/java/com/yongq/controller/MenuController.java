package com.yongq.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yongq.dto.MenuVO;
import com.yongq.service.MenuServiceImpl;
/**
 * 
 * @Package Name : com.yongq.controller
 * @FileName : MenuController.java
 * @Date : 2018. 5. 25. 
 * @User : AHN
 * @Description : 메뉴조회 (일일, 주간)
 */
@Controller
public class MenuController {
  
  private static final Logger logger = LoggerFactory.getLogger(MenuController.class);

  @Autowired
  private MenuServiceImpl menuService;
  
  // 오늘 날짜 (일일 메뉴 구할때 이용)
  public String getDate(){
    
    Date d = new Date();
    SimpleDateFormat dF = new SimpleDateFormat("yyyy-MM-dd");
    String getDate = dF.format(d);
    
    return getDate;
    
  }
  
  
  @RequestMapping("/student/menu")
  public String stuDMenu(Model model){
    
    String date = getDate();
    
    /*
     * Hlist = 환과대 리스트 Dlist = 기숙사 리스트 Ilist = 인성관 리스트
     * 
     */
    ArrayList<MenuVO> Hlist = menuService.dayMenuH(date);
    ArrayList<MenuVO> Dlist = menuService.dayMenuD(date);
    ArrayList<MenuVO> Ilist = menuService.dayMenuI(date);
    
    model.addAttribute("Hlist",Hlist);
    model.addAttribute("Dlist",Dlist);
    model.addAttribute("Ilist",Ilist);
    
    return "students/Student_Menu";
     
  }
  
  @RequestMapping("/student/weekMenu")
  public String stuWMenu(Model model){
    
    ArrayList<MenuVO> weekList = menuService.weekMenu();
    model.addAttribute("weekList",weekList);
    
    return "students/WeekMenu";
  }
  
  
}
