import  java.io.*;
import  java.util.*;
import  javax.servlet.*;
import  javax.servlet.http.*;

public class Student extends HttpServlet
{
	String SeatNum,Name;
	String ans1,ans2,ans3,ans4,ans5;
        int a1=0,a2=0,a3=0,a4=0,a5=0;
public void doPost (HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException             
{

//Gathering parameters from HTML form

	  SeatNum = request.getParameter("Seat_no");
	  Name = request.getParameter("Name");
	  ans1 =request.getParameter("group1");         
	  if(ans1.equals("True"))
	    a1=2;
	  else  
	    a1=0;	  
               ans2 = request.getParameter("group2");         
	  if(ans2.equals("True"))
	    a2=0;
	  else
	    a2=2;	  
	  ans3 = request.getParameter("group3");         
	  if(ans3.equals("True"))
	    a3=0;
	  else
	    a3=2;	  
	  ans4 = request.getParameter("group4");         
	  if(ans4.equals("True"))
	    a4=2;
	  else
	    a4=0;	  
	  ans5 = request.getParameter("group5");         
	  if(ans5.equals("True"))
	    a5=0;
	  else
	    a5=2;	  
	  int Total=a1+a2+a3+a4+a5;         
	
response.setContentType("text/html");
PrintWriter out=response.getWriter();
out.println("<html>");
out.println("<head>");
out.println("</head>");
out.println("<body bgcolor=pink>");
out.println("<center>");
out.println("<br><br>");
out.println("<h1>Thank You!!</h1>\n");		
out.println("</center>");	
out.println("</body></html>");
}
}
