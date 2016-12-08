

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.SQLException;

import model.SAgholder;
import model.SAmholder;
import custom.SurveyCollect;
/**
 * Servlet implementation class SurveyResultsServlet
 */
@WebServlet("/SurveyResultsServlet")
public class SurveyResultsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SurveyResultsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
//		String sqlg = "SELECT gender, count(*) FROM SANSWERS GROUP BY gender ORDER BY 1";
//		String sqlcg = "select count(*) from SANSWERS";
		String sqlg = "Create view countsbygender as SELECT gender, count(*) as total FROM SANSWERS GROUP BY gender ORDER BY 1"; 
		String sqlgv = "Select * from countsbygender";
		ResultSet rsg = null;
		ResultSet rsgv = null;
		Connection con = null;
		PreparedStatement pstmtg = null;
		PreparedStatement pstmtgv = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:ora1/ora1@localhost:1521:orcl");
			pstmtg = con.prepareStatement(sqlg);
			rsg = pstmtg.executeQuery();
			pstmtgv = con.prepareStatement(sqlgv);
			rsgv = pstmtgv.executeQuery();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String sqlm = "SELECT married, count(*) FROM SANSWERS GROUP BY married ORDER BY 1";
		ResultSet rsm = null;
		PreparedStatement pstmtm = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:ora1/ora1@localhost:1521:orcl");
			pstmtm = con.prepareStatement(sqlg);
			rsm = pstmtm.executeQuery();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String nextURL = "/SurveyResults.jsp";
		//redirect to next page as indicated by the value of the nextURL variable
		getServletContext().getRequestDispatcher(nextURL).forward(request,response);
	}

}
