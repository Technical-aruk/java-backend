
import java.sql.*;
public class delete {
	public static void insertmagic()throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/foodcart";
		String username="root";
		String password="2345";
		String Query="delete from food where  id=101";
		Connection con=DriverManager.getConnection(url, username, password);
		PreparedStatement pst=con.prepareStatement(Query);
		pst.executeUpdate();
		con.close();
	}
public static void main(String[] args)throws Exception {
		
		insertmagic();
	}
}