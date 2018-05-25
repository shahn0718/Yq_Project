package com.yongq.dto;
/**
 * 
 * @Package Name : com.yongq.dto
 * @FileName : ViewUseVO.java
 * @Date : 2018. 5. 25. 
 * @User : AHN
 * @Description : 사용내역 조회 (학생, 관리자)
 */
public class ViewUseVO {

  private String stu_id;
  private String date;
  private String chain;
  private String mn_name;
  private int mn_price;
  private String f_use;
  public String getStu_id() {
    return stu_id;
  }
  public void setStu_id(String stu_id) {
    this.stu_id = stu_id;
  }
  public String getDate() {
    return date;
  }
  public void setDate(String date) {
    this.date = date;
  }
  public String getChain() {
    return chain;
  }
  public void setChain(String chain) {
    this.chain = chain;
  }
  public String getMn_name() {
    return mn_name;
  }
  public void setMn_name(String mn_name) {
    this.mn_name = mn_name;
  }
  public int getMn_price() {
    return mn_price;
  }
  public void setMn_price(int mn_price) {
    this.mn_price = mn_price;
  }
  public String getF_use() {
    return f_use;
  }
  public void setF_use(String f_use) {
    this.f_use = f_use;
  }
  
  
}
