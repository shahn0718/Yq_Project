package com.yongq.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yongq.dto.StudentVO;
import com.yongq.service.PayServiceImpl;
/**
 * 
 * @Package Name : com.yongq.controller
 * @FileName : PayController.java
 * @Date : 2018. 5. 25. 
 * @User : AHN
 * @Description : 충전, 사용(학생)
 */
@Controller
public class PayController {

  //transaction 트랜잭션 처리 해줘야함
  private static final Logger logger = LoggerFactory.getLogger(PayController.class);

  @Autowired 
  private PayServiceImpl payService;

  public String getDate(){
    
    Date d = new Date();
    SimpleDateFormat dF = new SimpleDateFormat("yyyy-MM-dd");
    String getDate = dF.format(d);
    
    return getDate;
  }
  
  @RequestMapping("/student/recharge")
  public String stuRcg(Model model){
    
    return "students/Student_Recharge";
  }
  
  @RequestMapping("/student/main")
  public String stuPage(Model model) {

    return "students/Student_Main_Page";
  }
  
  //RequestMapping 이름 다시 설정해주기
  @RequestMapping("/student/recharge/complete")
  public String stuRecharge(Model model , HttpServletRequest req){
    
    HashMap<StudentVO,String> userInfo = (HashMap<StudentVO, String>) req.getSession().getAttribute("userInfo");
    
    String stu_id = userInfo.get("stu_id");
    String date = getDate();
    int mn_price = Integer.parseInt(req.getParameter("recharge_mn"));
  
    
    logger.info("충전 과정 시작");
    payService.writeRcg(stu_id, date, mn_price);
    logger.info("충전 정보 업데이트");
    payService.updateRcg(mn_price, stu_id);
    
    return "redirect:/student/recharge";
  }
  
  @RequestMapping("/student/pay")
  public String stuPay (Model model, HttpServletRequest req){
    
    HashMap<StudentVO,String> userInfo = (HashMap<StudentVO,String>)req.getSession().getAttribute("userInfo");
    
    String stu_id = userInfo.get("stu_id");
    String date = getDate();
    int mn_price = 3500;
    
    logger.info("결제 과정 시작");
    payService.updateUse(mn_price, stu_id);
    logger.info("결제 정보 업데이트");
    payService.writeUse(stu_id, date, mn_price);
    
   
    return "redirect:/student/Info";
  }
  
}
