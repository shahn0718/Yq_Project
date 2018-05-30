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

  
  //학생 결제 내역 확인
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
    
    return "students/Student_Foruse";
  }

  




}
