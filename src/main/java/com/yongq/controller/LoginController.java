package com.yongq.controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yongq.s_dao.SDao;
import com.yongq.s_dao.SLogin;
import com.yongq.s_dto.StudentVO;

@Controller
public class LoginController {

  private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

  SLogin Slogin;

  @Autowired
  private SqlSession sqlSession;

  /**
   * Simply selects the home view to render by returning its name.
   */
  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String home(Locale locale, Model model) {
    logger.info("Welcome home! The client locale is {}.", locale);

    Date date = new Date();
    DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

    String formattedDate = dateFormat.format(date);

    model.addAttribute("serverTime", formattedDate);

    return "home";

  }

  /*
   * @RequestMapping("/list") public String stuList(Model model){
   * 
   * SDao sdao = sqlSession.getMapper(SDao.class);
   * model.addAttribute("list",sdao.stuList());
   * 
   * return "/list"; }
   * 
   */

  @RequestMapping("/student")
  public String loginPage(Model model) {
    
    return "students/Student_Login_Page";
  }

  @RequestMapping(value="/Login", method=RequestMethod.POST)
  public String stuLogin(HttpServletRequest req, Model model) {

    String successUrl = "students/Student_Main_Page";
    String falseUrl = "students/Student_Login_Page";
    
    String stu_id = req.getParameter("stu_id");
    String stu_pw = req.getParameter("stu_pw");
  

    SDao sdao = sqlSession.getMapper(SDao.class);
    HashMap<StudentVO, String> loginInfo = sdao.stuLogin(stu_id);
   
    if (stu_pw.equals(loginInfo.get("STU_PW"))) {
      logger.info("=====로그인 성공!=====");
      
      
      //session 저장
      
      return successUrl;
    }else{
      logger.info("=====로그인 실패=====");
      return falseUrl;
    }
     
    

  }

}