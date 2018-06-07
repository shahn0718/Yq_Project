package com.yongq.dto;
/**
 * 
 * @Package Name : com.yongq.dto
 * @FileName : ViewTotVO.java
 * @Date : 2018. 6. 7. 
 * @User : AHN
 * @Description : 정산, 인기메뉴 (관리자)
 */
public class ViewTotVO {
  
  /*
   *  
   */
  private String mn_name;
  
  /*
   * 환경과학대, 인성관, 기숙사
   * 총합계
   */
  private int insungTot;
  private int hwanTot;
  private int dormTot;

  /*
   * 환경과학대, 인성관, 기숙사
   * 인기메뉴 체크횟수
   */
  private int insungChk;
  private int hwanChk;
  private int dormChk;
  
  
  public String getMn_name() {
    return mn_name;
  }
  public void setMn_name(String mn_name) {
    this.mn_name = mn_name;
  }
  public int getInsungTot() {
    return insungTot;
  }
  public void setInsungTot(int insungTot) {
    this.insungTot = insungTot;
  }
  public int getHwanTot() {
    return hwanTot;
  }
  public void setHwanTot(int hwanTot) {
    this.hwanTot = hwanTot;
  }
  public int getDormTot() {
    return dormTot;
  }
  public void setDormTot(int dormTot) {
    this.dormTot = dormTot;
  }
  public int getInsungChk() {
    return insungChk;
  }
  public void setInsungChk(int insungChk) {
    this.insungChk = insungChk;
  }
  public int getHwanChk() {
    return hwanChk;
  }
  public void setHwanChk(int hwanChk) {
    this.hwanChk = hwanChk;
  }
  public int getDormChk() {
    return dormChk;
  }
  public void setDormChk(int dormChk) {
    this.dormChk = dormChk;
  }
  
  
}
