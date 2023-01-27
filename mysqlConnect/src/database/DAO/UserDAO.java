package database.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.protocol.Resultset;

import database.DatabaseConnector;
import database.Entity.UserEntity;

public class UserDAO {
	
	// 데이터베이스에서 User 테이블 중 id가 입력받은 값에 해당하는 레코드를 모든 컬럼을 선택해서 반환
	// SQL: SELECT * FROM User WHERE id = ?;
	// 예상되는 반환 값: 0 or 1개의 레코드가 반환됨
	// 레코드는 테이블을 기준으로 만들어짐
	// 자바에서 테이블은 entity 클래스
	
	// find~ : 결과의 인스턴스를 반환하는 메서드
	// exists~ : 결과의 존재여부를 boolean 형태로 반환하는 메서드
	public UserEntity findById(Integer id) {
		UserEntity result = null;
		
		final String SQL = "SELECT * FROM User WHERE id = ?";
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			
			connection = DatabaseConnector.createConnection();
			preparedStatement = connection.prepareStatement(SQL);
			preparedStatement.setInt(1, id);
			
			resultSet = preparedStatement.executeQuery();
			
			if (resultSet.next()) {
				String password = resultSet.getString(2);
				String name = resultSet.getString(3);
				String telNumber = resultSet.getString(4);
				
				result = new UserEntity(id, password, name, telNumber);
			}
			
		} catch (Exception exception) {
			
		} finally {
			try {
				if (resultSet != null && !resultSet.isClosed()) 
					resultSet.close();
				if (preparedStatement != null && !preparedStatement.isClosed())
					preparedStatement.close();
				if (connection != null && !connection.isClosed())
					connection.close();
			} catch (Exception exception) {
				
			}
			
		}
		
		return result;
	}
	
}
