package DB;
 import java.sql.*;
 import javax.sql.*;
 import javax.naming.*;

public class ConExDAO {
	DataSource ds = null;
	
	public ConExDAO() {
		try {
			Context context = new InitialContext();
			DataSource dataSource = (DataSource) context.lookup("java:comp/env/jdbc/jdbc/local_test");
			Connection conn = dataSource.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
