package com.yongq.dto;
/**
 * 
 * @Package Name : com.yongq.dto
 * @FileName : ViewRcgVO.java
 * @Date : 2018. 5. 30. 
 * @User : AHN
 * @Description : 충전내역 조회 (학생, 관리자)
 */
public class ViewRcgVO {
  /*
   *  학생에서 조회(날짜, 충전금액) = date, mn_price
   *  관리자에서 조회(학번, 날짜, 충전금액) = stu_id, date, mn_price
   * 
   */
  private String date;
  private int mn_price;
  private String stu_id;
  
  //충전 합계
  private int rcgTotal;
  
  public String getDate() {
    return date;
  }
  public void setDate(String date) {
    this.date = date;
  }
  public int getMn_price() {
    return mn_price;
  }
  public void setMn_price(int mn_price) {
    this.mn_price = mn_price;
  }
  public String getStu_id() {
    return stu_id;
  }
  public void setStu_id(String stu_id) {
    this.stu_id = stu_id;
  }
  public int getRcgTotal() {
    return rcgTotal;
  }
  public void setRcgTotal(int rcgTotal) {
    this.rcgTotal = rcgTotal;
  }
  
  

}
