package com.yongq.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * 
 * @Package Name : com.yongq.controller
 * @FileName : InsertController.java
 * @Date : 2018. 6. 7. 
 * @User : AHN
 * @Description : 메뉴 입력(관리자)
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yongq.service.InsertServiceImpl; 
@Controller
public class InsertController {
  
  private static final Logger logger = LoggerFactory.getLogger(InsertController.class);

  @Autowired
  private InsertServiceImpl insertService;

  @RequestMapping("/admin/insert")
  public String callInsert(){
    
    return "admins/Admin_Insert";
  }
  
  @RequestMapping("/admin/insertok")
  public String adInsertMenu(HttpServletRequest req, Model model) throws UnsupportedEncodingException{
    
    req.setCharacterEncoding("UTF-8");
    String mn_id = req.getParameter("mn_id");
    String mn_date = req.getParameter("mn_date");
    String mn_name = req.getParameter("mn_name");
    String mn_price = req.getParameter("mn_price");
    String chain = req.getParameter("chain");
    String mn_type = req.getParameter("mn_type");
    String mn_sold = " ";
    
    insertService.insertMenu(mn_id, mn_date, mn_name, mn_price, chain, mn_type, mn_sold);

    
    return "/admins/Admin_Main_Page";
  }

}
