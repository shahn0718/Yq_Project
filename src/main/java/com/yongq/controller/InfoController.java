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

import com.yongq.dto.AdminVO;
import com.yongq.dto.StudentVO;
import com.yongq.service.LoginServiceImpl;

@Controller
public class InfoController {
  
  @Autowired
  private LoginServiceImpl loginService;
  
  private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

  @RequestMapping("/student/Info")
  public String stuInfo(HttpServletRequest req, Model model){
  
    HashMap<StudentVO,String> userInfo = (HashMap<StudentVO, String>) req.getSession().getAttribute("userInfo");
    String stu_id = userInfo.get("stu_id");
    
    ArrayList<StudentVO> stuInfo = loginService.stuInfo(stu_id);
    
    model.addAttribute("stuInfo", stuInfo);
    
    return "students/Student_Info";
  }
  
  @RequestMapping("/admin/Info")
  public String adInfo(HttpServletRequest req, Model model){
    
    HashMap<AdminVO, String> adminInfo= (HashMap<AdminVO, String>)req.getSession().getAttribute("adminInfo");
    String ad_id = adminInfo.get("ad_id");
    
    ArrayList<AdminVO> adInfo = loginService.adInfo(ad_id);
    
    model.addAttribute("adInfo",adInfo);
    
    return "admins/Admin_Info";
  }
  
}
