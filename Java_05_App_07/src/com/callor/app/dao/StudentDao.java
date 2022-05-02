package com.callor.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.callor.app.dbconfig.DBConnection;
import com.callor.app.model.StudentVO;

public class StudentDao {
	private final Connection dbConn;

	public StudentDao() {
		dbConn = DBConnection.getDBConnection();
	}

	public List<StudentVO> selectAll() throws SQLException {
		String sql = "SELCET * FROM tbl_student";
		PreparedStatement pStr = null;

		pStr = dbConn.prepareStatement(sql);
		ResultSet rSet = pStr.executeQuery();

		List<StudentVO> stList = new ArrayList<>();

		/*
		 * 	private String stNum;
		 * 	private String stName;
		 * 	private String stTel;
		 * 	private String stAddr;
		 * 	private String stDept;
		 * 	private int stGrade;
		 */
		
		while (rSet.next()) {
//			StudentVO stVO = StudentVO.builder().stNum(sql).stName(sql).stAddr(sql).build();
			
			/*
			 * 모든 필드가 매개변수로 제공되는 임의 생성자 호출 후 VO 생성
			 */
			
//			StudentVO stVO = new StudentVO (
//					rSet.getString("st_num"),
//					rSet.getString("st_name"),
//					rSet.getString("st_tel"),
//					rSet.getString("st_addr"),
//					rSet.getString("st_dept"),
//					rSet.getInt("st_grade")
//				);
			
			/*
			 * 기본 생성자를 호출하여 비어있는 VO를 만들고 setter() method를 사용하여 변수에 값 setting하기
			 */
			
			StudentVO stVO1 = new StudentVO();
			
			stVO1.setStNum(rSet.getString("st_num"));
			stVO1.setStName(rSet.getString("st_name"));
			stVO1.setStTel(rSet.getString("st_tel"));
			stVO1.setStAddr(rSet.getString("st_addr"));
			stVO1.setStDept(rSet.getString("st_dept"));
			stVO1.setStGrade(rSet.getInt("st_grade"));
			
			StudentVO stVO2 = StudentVO.builder()
					.stNum(rSet.getString("st_num"))
					.stName(rSet.getString("st_name"))
					.stTel(rSet.getString("st_tel"))
					.build();
		}
	}
}
