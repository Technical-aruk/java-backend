import java.sql.*;
public class insert {
	public static void insertmagic()throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/foodcart";
		String username="root";
		String password="2345";
		String Query="insert into food values(?,?,?,?,?,?,?)";
		Connection con=DriverManager.getConnection(url, username, password);
		PreparedStatement pst=con.prepareStatement(Query);
		

		pst.setInt(1,102);
		pst.setString(2,"sambarrice");
		pst.setString(3, "Sambar Rice is more than just a meal; it's a journey into South Indian cuisine. Traditionally served on a banana leaf, it's a staple food enjoyed by families and communities across the region");
		pst.setInt(4, 350);
		pst.setString(5, "Mixed Vegetable Sambar Rice");
		pst.setInt(6, 25);
		pst.setString(7, "south indian");
		pst.setInt(1,103);
		pst.setString(2,"pizza");
		pst.setString(3, "A classic Italian pizza with a simple yet flavorful combination of tomato sauce");
		pst.setInt(4, 150);
		pst.setString(5, "Appetizer, Main Course");
		pst.setInt(6,280 );
		pst.setString(7, "italian");
		pst.setInt(1,104);
		pst.setString(2,"fried rice noodle");
		pst.setString(3, " A flavorful and satisfying dish with a delightful combination of textures");
		pst.setInt(4, 100);
		pst.setString(5, " Main Course");
		pst.setInt(6,500 );
		pst.setString(7, "Thai");
		pst.setInt(1,106);
		pst.setString(2,"Chicken Burrito Bowl");
		pst.setString(3, " A customizable and flavorful dish offering a variety of textures and tastes. ");
		pst.setInt(4, 700);
		pst.setString(5, "Appetizer, Main Course");
		pst.setInt(6,500 );
		pst.setString(7, "mexican");

		
		pst.executeUpdate();
		con.close();
	}
	public static void main(String[] args) throws Exception{
		insertmagic();
	}
	}
