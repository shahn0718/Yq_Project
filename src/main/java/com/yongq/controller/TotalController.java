package com.yongq.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yongq.dto.ViewTotVO;
import com.yongq.service.TotalServiceImpl;

/**
 * 
 * @Package Name : com.yongq.controller
 * @FileName : TotalController.java
 * @Date : 2018. 6. 7. 
 * @User : AHN
 * @Description : 정산, 인기메뉴 (관리자)
 */
@Controller
public class TotalController {
  
  private static final Logger logger = LoggerFactory.getLogger(TotalController.class);
  
  @Autowired
  private TotalServiceImpl totalService;
  
  @RequestMapping("/admin/total")
  public String callTotal(){
    
    return "admins/Admin_Total";
  }
  
  @RequestMapping("/admin/total/insung")
  public String totalInsung(HttpServletRequest req, Model model){
    
    String date = req.getParameter("date");
    
    ArrayList<ViewTotVO> insungTot = totalService.getInsungTot(date);
    ArrayList<ViewTotVO> insungMenu = totalService.getInsungMenu(date);
    
    model.addAttribute("insungTot",insungTot);
    model.addAttribute("insungMenu",insungMenu);
    
    return "admins/Admin_TotInsung";
  }
  
  @RequestMapping("/admin/total/hwan")
  public String totalHwan(HttpServletRequest req, Model model){
    
    String date = req.getParameter("date");
    
    ArrayList<ViewTotVO> hwanTot = totalService.getHwanTot(date);
    ArrayList<ViewTotVO> hwanMenu = totalService.getHwanMenu(date);
    
    model.addAttribute("hwanTot",hwanTot);
    model.addAttribute("hwanMenu",hwanMenu);
    
    return "admins/Admin_TotHwan";
  }
  
  @RequestMapping("/admin/total/dorm")
  public String totalDorm(HttpServletRequest req, Model model){
    
    String date = req.getParameter("date");
    
    ArrayList<ViewTotVO> dormTot = totalService.getDormTot(date);
    ArrayList<ViewTotVO> dormMenu = totalService.getDormMenu(date);
    
    model.addAttribute("dormTot",dormTot);
    model.addAttribute("dormMenu",dormMenu);
    
    
    return "admins/Admin_TotDorm";
  }
}
