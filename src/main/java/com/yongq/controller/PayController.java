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

@Controller
public class PayController {

  private static final Logger logger = LoggerFactory.getLogger(PayController.class);

  @Autowired 
  private PayServiceImpl payService;

  public String getDate(){
    
    Date d = new Date();
    SimpleDateFormat dF = new SimpleDateFormat("yyyy-MM-dd");
    String getDate = dF.format(d);
    
    return getDate;
  }
  /*
   * 처음 예를 통해서 mn_price = 3500으로 고정
   */
  @RequestMapping("/student/recharge")
  public String stuRcg(Model model){
    
    return "students/Student_Recharge";
    
    
  }
  
  //RequestMapping 이름 다시 설정해주기
  @RequestMapping("/student/recharge/complete")
  public String stuRecharge(Model model , HttpServletRequest req){
    
    HashMap<StudentVO,String> userInfo = (HashMap<StudentVO, String>) req.getSession().getAttribute("userInfo");
    
    String stu_id = userInfo.get("stu_id");
    String date = getDate();
    int mn_price = Integer.parseInt(req.getParameter("recharge_mn"));
   
    System.out.println(stu_id);
    System.out.println(date);
    System.out.println(mn_price);
    payService.writeRcg(stu_id, date, mn_price);
   
    payService.updateRcg(mn_price, stu_id);
    
    return "students/Student_Main_Page";
  }
}
