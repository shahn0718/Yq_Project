package com.yongq.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yongq.a_dao.ADao;
import com.yongq.a_dto.AdminVO;
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
   * @test 용
   * 
   * @RequestMapping("/list") public String stuList(Model model){
   * 
   * SDao sdao = sqlSession.getMapper(SDao.class);
   * model.addAttribute("list",sdao.stuList());
   * 
   * return "/list"; }
   * 
   */

  @RequestMapping("/student")
  public String stuPage(Model model) {

    return "students/Student_Login_Page";
  }
  @RequestMapping("/admin")
  public String adPage(Model model){
    
    return "admins/Admin_Login_Page";
  }
  /*
   * 로그인 실패할 경우의 수 1. 아이디가 존재 하지 않는 경우.(SQL에 정보가 없는 경우) 2. 비밀번호가 틀린 경우.(SQL에 정보는
   * 있지만 값의 불일치)
   * 
   */

  @RequestMapping(value = "/Login", method = RequestMethod.POST)
  public String stuLogin(HttpServletRequest req, Model model) {

    // 성공 & 실패 url
    String successUrl = "students/Student_Main_Page";
    String falseUrl = "students/Student_Login_Page";

    String stu_id = req.getParameter("stu_id");
    String stu_pw = req.getParameter("stu_pw");

    SDao sdao = sqlSession.getMapper(SDao.class);
    HashMap<StudentVO, String> loginInfo = sdao.stuLogin(stu_id);

    try {
      if (stu_pw.equals(loginInfo.get("STU_PW"))) {
        logger.info("=====로그인 성공!=====");

        Map map = new HashMap();
        map.put("stu_id", stu_id);
        map.put("stu_pw", stu_pw);
        req.getSession().setAttribute("userInfo", map);

        logger.info("세션저장: " + map);
        // System.out.println(map)
        // 비밀번호를 저장? 저장x?

        return successUrl;

      } else {

        logger.info("=====로그인 실패!=====");
        logger.info("=====비밀번호 오류=====");
        return falseUrl;
      }
    } catch (Exception e) {
      logger.info("=====로그인 실패!=====");
      logger.info("=====아이디가 존재x======");
      return falseUrl;

    }
  }

  @RequestMapping(value = "/adLogin", method = RequestMethod.POST)
  public String adLogin(HttpServletRequest req, Model model) {

    String successUrl = "admins/Admin_Main_Page";
    String falseUrl = "admins/Admin_Login_Page";

    String ad_id = req.getParameter("ad_id");
    String ad_pw = req.getParameter("ad_pw");

    ADao adao = sqlSession.getMapper(ADao.class);
    HashMap<AdminVO, String> loginInfo = adao.adLogin(ad_id);

    try {
      if (ad_id.equals(loginInfo.get("AD_ID"))) {
        logger.info("=====로그인 성공!=====");

        Map map = new HashMap();
        map.put("ad_id", ad_id);
        map.put("ad_pw", ad_pw);
        req.getSession().setAttribute("adminInfo", map);

        logger.info("세션저장: " + map);
        // System.out.println(map)
        // 비밀번호를 저장? 저장x?

        return successUrl;
      } else {

        logger.info("=====로그인 실패!=====");
        logger.info("=====비밀번호 오류=====");
        return falseUrl;

      }

    } catch (Exception e) {
      logger.info("=====로그인 실패!=====");
      logger.info("=====아이디가 존재x======");
      return falseUrl;
    }
  }
}