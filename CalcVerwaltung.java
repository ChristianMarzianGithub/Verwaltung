package verwaltung;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.DefaultListModel;

public class CalcVerwaltung {
	
	static ResultSet rs;
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static DefaultListModel getData () throws SQLException, ClassNotFoundException{
		DefaultListModel listModel;
		listModel = new DefaultListModel();
		
		String lineBreakHTML = "<br>";	
		
//		for(int i = 0; i< 100 ; i++){
//			listModel.add(i,"<html>abc" + i + "<br>lines</html>");
//		}
//		
		
		Connection conn =connect();
		
		int i = 0;
		while(rs.next())
	    {
	      // read the result set
	      System.out.println("name = " + rs.getString("AlbumId"));
	      System.out.println("Title = " + rs.getString("Title"));
	      System.out.println("ArtistID = " + rs.getInt("Artistid"));
	      
	      listModel.add(i, "<html>" 
	    		  			+ rs.getString("AlbumId") 
	      					+ lineBreakHTML 
	      					+ rs.getString("Title") 
	      					+ lineBreakHTML 
	      					+ rs.getInt("Artistid")	      					
	      					+  "</html>");
	      
	      i++;
	    }
		
		
		conn.close();
		
	     
		
		
		
		return listModel;
	}
	
	public static Connection connect() throws ClassNotFoundException{
		// load the sqlite-JDBC driver using the current class loader
	    
		Class.forName("org.sqlite.JDBC");
	    Connection connection = null;
	    
	    
	    	
	      // create a database connection
	      try {
			connection = DriverManager.getConnection("jdbc:sqlite:C:/Users/Chris/Desktop/chinook.db");
			Statement statement = connection.createStatement();
		      statement.setQueryTimeout(30);  // set timeout to 30 sec.

		      rs = statement.executeQuery("select * from albums");
		      
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
	      
	      
	  return connection; 
	   
	}
	
	
	/*
    while(rs.next())
    {
      // read the result set
      System.out.println("name = " + rs.getString("AlbumId"));
      System.out.println("Title = " + rs.getString("Title"));
      System.out.println("ArtistID = " + rs.getInt("Artistid"));
    }
    */
	
	
	/*
	 *
	 */
	
	
	
	
	

}
