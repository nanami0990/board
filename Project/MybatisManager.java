package project._mybatisConfig;

import java.io.Reader;
import java.sql.Connection;

import javax.annotation.Resource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.TransactionIsolationLevel;

public class MybatisManager {
	private static SqlSessionFactory instance;
	
	private MybatisManager() {
		//super();
	}
	
	
	public static SqlSessionFactory getInstance() {
		Reader reader = null;
		try {
			String resource = "project/_mybatisConfig/mybatisConfig.xml";
			reader = Resources.getResourceAsReader(resource);
			instance = new SqlSessionFactoryBuilder().build(reader);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("에러...");
		} finally {
			try {
				if (reader != null) { reader.close(); }
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return instance;
	}
}
