
import java.sql.*;
public class get {
	public static void updatemagic() throws Exception {
	String url="jdbc:mysql://127.0.0.1:3306/ foodcart ";
	String username="root";
	String password="2345";
	String Query="Select name,price,calroie,description from food where id=102";
	Connection con=DriverManager.getConnection(url, username, password);
	Statement smt=con.createStatement();
	ResultSet rs=smt.executeQuery(Query);
	if(rs.next()) {
		String name=rs.getString("name");
		String price=rs.getString("price");
		String cal=rs.getString("calroie");
		String des=rs.getString("description");
		System.out.println(cal );
		System.out.println(des);
		
		System.out.println(name );
		System.out.println(price);
		
		
		
		
	}else {
		System.out.println("no record found");
	}
	smt.close();
   rs.close();
}public static void main(String[] args)throws Exception {
	
	updatemagic();
}

}