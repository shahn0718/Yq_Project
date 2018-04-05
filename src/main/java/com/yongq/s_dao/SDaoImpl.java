package com.yongq.s_dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yongq.dto.StudentVO;

@Repository("SDaoImpl")
public class SDaoImpl<T, E> implements SDao{

  @Autowired
  SqlSession sqlSession;

  // mybatis연결

  SDao sdao;

  @Override
  public ArrayList<StudentVO> stuList() {

    sdao = sqlSession.getMapper(SDao.class);
    ArrayList<StudentVO> stulist = sdao.stuList();

    return  stulist;
  }

  @Override
  public HashMap<StudentVO, String> stuLogin(String stu_id) {

    sdao = sqlSession.getMapper(SDao.class);
    HashMap<StudentVO, String> loginInfo = sdao.stuLogin(stu_id);

    return loginInfo;
  }

  @Override
  public ArrayList<StudentVO> stuInfo(String stu_id) {

    sdao = sqlSession.getMapper(SDao.class);
    ArrayList<StudentVO> stuInfo = sdao.stuInfo(stu_id);

    return stuInfo;
  }

  @Override
  public void writeRcg(String stu_id, String date, int mn_price) {

    sdao = sqlSession.getMapper(SDao.class);
    sdao.writeRcg(stu_id, date, mn_price);
  }

  @Override
  public void updateRcg(int mn_price, String stu_id) {

    sdao = sqlSession.getMapper(SDao.class);
    sdao.updateRcg(mn_price, stu_id);
  }

}
