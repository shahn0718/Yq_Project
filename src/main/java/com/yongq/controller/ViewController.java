package com.yongq.controller;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yongq.dto.StudentVO;
import com.yongq.dto.ViewRcgVO;
import com.yongq.dto.ViewUseVO;
import com.yongq.service.ViewServiceImpl;

/**
 * 
 * @Package Name : com.yongq.controller
 * @FileName : ViewController.java
 * @Date : 2018. 5. 30. 
 * @User : AHN
 * @Description : 결제내역 조회(학생, 관리자)
 *                학생 결제내역 , 충전내역
 *                관리자 
 */
@Controller
public class ViewController {
  
  private static final Logger logger =LoggerFactory.getLogger(ViewController.class);

  @Autowired
  private ViewServiceImpl viewService;

  
  // 학생 - 결제내역 확인
  @RequestMapping("/student/viewuse")
  public String stuViewUse(Model model, HttpServletRequest req){
    
    HashMap<StudentVO,String> userInfo = (HashMap<StudentVO,String>)req.getSession().getAttribute("userInfo");
    String stu_id = userInfo.get("stu_id");
    
    // 학생 전체
    ArrayList<ViewUseVO> chkStuUsage = viewService.chkStuUsage(stu_id);
    // 주, 1개월, 3개월
    ArrayList<ViewUseVO> chkWeekUsage = viewService.chkWeekUsage(stu_id);
    ArrayList<ViewUseVO> chkMthUsage = viewService.chkMthUsage(stu_id);
    ArrayList<ViewUseVO> chk3MthUsage = viewService.chk3MthUsage(stu_id);
    
    model.addAttribute("chkStuUsage",chkStuUsage);
    model.addAttribute("chkWeekUsage",chkWeekUsage);
    model.addAttribute("chkMthUsage",chkMthUsage);
    model.addAttribute("chk3MthUsage",chk3MthUsage);
    
    return "students/Student_ViewUse";
  }
  
  // 관리자 - 결제 내역 확인
  @RequestMapping("/admin/viewuse")
  public String adViewUse(Model model, HttpServletRequest req){
     
    ArrayList<ViewUseVO> chkAllUsage = viewService.chkAllUsage();
    
    model.addAttribute("chkAllUsage",chkAllUsage);
    
    return "admins/Admin_ViewUse";
  }
  
  // 학생 - 충전 내역 확인
  @RequestMapping("/student/viewrcg")
  public String stuViewRcg(Model model, HttpServletRequest req){
    
    HashMap<StudentVO,String> userInfo = (HashMap<StudentVO,String>)req.getSession().getAttribute("userInfo");
    String stu_id = userInfo.get("stu_id");
    
    //학생 전체
    ArrayList<ViewRcgVO> chkStuRcg = viewService.chkStuRcg(stu_id);
    //주, 1개월, 3개월
    ArrayList<ViewRcgVO> chkWeekRcg = viewService.chkWeekRcg(stu_id);
    ArrayList<ViewRcgVO> chkMthRcg = viewService.chkMthRcg(stu_id);
    ArrayList<ViewRcgVO> chk3MthRcg = viewService.chk3MthRcg(stu_id);
    
    model.addAttribute("chkStuRcg",chkStuRcg);
    model.addAttribute("chkWeekRcg",chkWeekRcg);
    model.addAttribute("chkMthRcg",chkMthRcg);
    model.addAttribute("chk3MthRcg",chk3MthRcg);
   
    return "students/Student_ViewRcg";
  }

  // 관리자 - 충전 내역
  @RequestMapping("/admin/viewrcg")
  public String adViewRcg(Model model, HttpServletRequest req){
    
    ArrayList<ViewRcgVO> chkAllRcg = viewService.chkAllRcg();
    
    model.addAttribute("chkAllRcg",chkAllRcg);
    
    return "admins/Admin_ViewRcg";
    
  }
  




}
