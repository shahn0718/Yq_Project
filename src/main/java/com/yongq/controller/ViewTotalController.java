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
 * @FileName : ViewTotalController.java
 * @Date : 2018. 5. 30. 
 * @User : AHN
 * @Description : 조회 합계 기능 (학생, 관리자)
 */

@Controller
public class ViewTotalController {

  private static final Logger logger =LoggerFactory.getLogger(ViewController.class);

  @Autowired
  private ViewServiceImpl viewService;
  
  //학생 - 합계 내역
  @RequestMapping("student/usetotal")
  public String stuViewTotUse (Model model, HttpServletRequest req){
    
    HashMap<StudentVO,String> userInfo = (HashMap<StudentVO,String>)req.getSession().getAttribute("userInfo");
   
    String stu_id = userInfo.get("stu_id");
    String keyword = req.getParameter("keyword");

    ArrayList<ViewUseVO> chkTotUsage = viewService.chkTotUsage(stu_id, keyword);
    ArrayList<ViewUseVO> chkTotUselist = viewService.chkTotUselist(stu_id, keyword);
    
    model.addAttribute("chkTotUsage",chkTotUsage);
    model.addAttribute("chkTotUselist",chkTotUselist);
    
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
    
    return "/students/Student_TotUse";
  }
  
  @RequestMapping("student/rcgtotal")
  public String stuViewTotRcg(Model model, HttpServletRequest req){
    
    HashMap<StudentVO,String> userInfo = (HashMap<StudentVO,String>)req.getSession().getAttribute("userInfo");
    
    String stu_id = userInfo.get("stu_id");
    String keyword = req.getParameter("keyword");
    
    ArrayList<ViewRcgVO> chkTotRcg = viewService.chkTotRcg(stu_id, keyword);
    ArrayList<ViewRcgVO> chkTotRcglist = viewService.chkTotRcglist(stu_id, keyword);
    
    model.addAttribute("chkTotRcg", chkTotRcg);
    model.addAttribute("chkTotRcglist", chkTotRcglist);
    
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
    
    return "/students/Student_TotRcg";
  }
}
