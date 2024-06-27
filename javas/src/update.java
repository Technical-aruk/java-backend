

import java.sql.*;
public class update  {
	public static void updatemagic() throws Exception {
		String url="jdbc:mysql://127.0.0.1:3306/ foodcart ";
		String username="root";
		String password="2345";
		String Query="update food set name = 'curdrice' where   id = 102";
		Connection con=DriverManager.getConnection(url, username, password);
		PreparedStatement pst=con.prepareStatement(Query);
       pst.executeUpdate();
		con.close();
	}
	public static void main(String[] args)throws Exception {
		
		updatemagic();
	}

}

