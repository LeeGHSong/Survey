

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Enumeration;

import custom.SurveyCollect;

/**
 * Servlet implementation class SurveyServlet
 */
@WebServlet("/SurveyServlet")
public class SurveyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SurveyServlet() {
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
		//doGet(request, response);
		String email = request.getParameter("email");
		String fname = request.getParameter("firstName");
		String lname = request.getParameter("lastName");
		String gender = request.getParameter("gender");
//		String color = request.getParameter("color");
		String[] color = request.getParameterValues("color");
		String colors = color[0];
		int max = color.length;
		if(max>1){
			for(int i=1; i<max; i++){
				colors=colors+","+color[i];
			}
		}
		String animal = request.getParameter("animal");
		String party = request.getParameter("party");
		if (party.equals("Other")){
			party = request.getParameter("textparty");
		}
		String status = request.getParameter("status");
		String nextURL = "/error.jsp";

		
		//need a reference to the session
		//get user out of session. If they don't exist then send them back to the login page.
		//kill the session while you're at it.
//		HttpSession session = request.getSession();
//		if (session.getAttribute("user")==null){
//		    nextURL = "/login.jsp";
//		    session.invalidate();
//		    response.sendRedirect(request.getContextPath() + nextURL);
//		    return;//return prevents an error
//		}
		 
		int works = SurveyCollect.insert(email,fname,lname,gender,colors,animal,party,status);
	 
		//go to the newsfeed or error
		if (works==1){
//			nextURL = "/newsfeed.jsp";
//			nextURL = "/NewsfeedServlet";
			nextURL = "/SurveyConfirm.jsp";
//			getServletContext().getRequestDispatcher("/NewsfeedServlet").forward(request, response);
			//request.setAttribute("posttext",posttext);	
		}	
		getServletContext().getRequestDispatcher(nextURL).forward(request, response);		
	}

}
