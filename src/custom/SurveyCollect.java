package custom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//import model.Bhpost;

public class SurveyCollect {
	public static int insert(String email,String fname,String lname,String gender,String color,String animal,String party,String status) {
		String sql = "insert into sanswers (email,fname,lname,gender,color,animal,party,married) " +
				"values(?,?,?,?,?,?,?,?)";
		int recordsAffected = 0;
		Connection con = null;
		PreparedStatement pstmt = null;
		System.out.println(email);
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(gender);
		System.out.println(color);
		System.out.println(animal);
		System.out.println(party);
		System.out.println(status);
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:ora1/ora1@localhost:1521:orcl");
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, email);
			pstmt.setString(2, fname);
			pstmt.setString(3, lname);
			pstmt.setString(4, gender);
			pstmt.setString(5, color);
			pstmt.setString(6, animal);
			pstmt.setString(7, party);
			pstmt.setString(8, status);
			//System.out.println(pstmt.toString());
			recordsAffected = pstmt.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}

		return recordsAffected;

	}
	
//	public static List<result> AllResults () throws SQLException, ClassNotFoundException{
//		List<result> results = new ArrayList<result>();
//		String sqlg = "Create view countsbygender as SELECT gender, count(*) as total FROM SANSWERS GROUP BY gender ORDER BY 1"; 
//		String sqlgv = "Select * from countsbygender";		
//		ResultSet rs = null;
//		Connection con = null;
//		PreparedStatement pstmt = null;
//
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		con = DriverManager.getConnection("jdbc:oracle:thin:ora1/ora1@localhost:1521:orcl");
//		pstmt = con.prepareStatement(sql);
//		rs = pstmt.executeQuery();
//		// Fetch each row from the result set
//		while (rs.next()) {
//			long postid = rs.getInt("postid");
//			java.util.Date postdate = rs.getDate("postdate");
//			String posttext = rs.getString("posttext");
//			long userid = rs.getLong("bhuserid");
//
//			Bhpost p = new Bhpost();
//			p.setPostid(postid);
//			p.setPostdate(convertJavaDateToSqlDate(postdate));
//			p.setPosttext(posttext);
//			p.setBhuserid(userid);
//			//add the post to the arraylist
//			posts.add(p);
//		}
//		return posts;
//	}	
}
