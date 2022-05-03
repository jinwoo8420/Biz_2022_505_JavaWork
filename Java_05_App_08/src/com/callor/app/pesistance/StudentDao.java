package com.callor.app.pesistance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.callor.app.dbconfig.DBConnection;
import com.callor.app.dbconfig.DBContract;
import com.callor.app.model.StudentVO;

public class StudentDao {
	private final Connection dbConn;

	public StudentDao() {
		dbConn = DBConnection.getDBConnection();
	}
	
	/*
	 * Exception 처리
	 * 
	 * 1. Exception이 발생 할 만한 코드를 try-catch로 묶기
	 * 
	 * 2. Exception을 나를 호출 한 곳으로 전달
	 * 
	 * Service에서 다음과 같이 selectAll()을 호출 할 것이다
	 * List<StudetnVO> stList = dao.selectAll();
	 * 
	 * dao.selectAll()에서 Exception이 발생하면
	 * dao.selectAll()에서 Exception을 직접 처리(핸들링) 하지 않고
	 * Service로 Exception 전달하여  Exception을 모아서 처리
	 */

	public List<StudentVO> selectAll() throws SQLException {
		PreparedStatement pStr = null;
		String sql = DBContract.ST_SELECT;

		pStr = dbConn.prepareStatement(sql);
		
		ResultSet rSet = pStr.executeQuery();
		
		return getResult(rSet);
	}
	
	private List<StudentVO> getResult(ResultSet rSet) throws SQLException {
		List<StudentVO> stList = new ArrayList<>();
		
		while(rSet.next()) {
			StudentVO stVO = StudentVO.builder()
					.stNum(rSet.getString(DBContract.ST_COL.ST_NUM))
					.stName(rSet.getString(DBContract.ST_COL.ST_NUM))
					.stDept(rSet.getString(DBContract.ST_COL.ST_DEPT))
					.stGrade(rSet.getInt(DBContract.ST_COL.ST_GRADE))
					.stAddr(rSet.getString(DBContract.ST_COL.ST_ADDR))
					.stTel(rSet.getString(DBContract.ST_COL.ST_TEL))
					.build();
			stList.add(stVO);
		}
		
		return stList;
	}
}
