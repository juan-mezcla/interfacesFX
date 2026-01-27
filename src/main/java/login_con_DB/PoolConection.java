package login_con_DB;

import java.sql.Connection;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class PoolConection {
    private static HikariConfig config;
    private static HikariDataSource data;

    static{
        config.setJdbcUrl("jdbc:mysql://localhost:3306/tablaLoggin?useSSL=false&serverTimezone=UTC");
        config.setUsername("root");
        config.setPassword("manager");
        config.addDataSourceProperty("maximumPoolSize", 1);
		config.addDataSourceProperty("cachePrepStmts", "true");
		config.addDataSourceProperty("prepStmtCacheSize", "250");
		config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
    } 

    private PoolConection() {}
	
	public static Connection getConnection() throws SQLException {
		return data.getConnection();
	}
    
}
