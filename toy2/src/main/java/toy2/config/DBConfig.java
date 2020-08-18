package toy2.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

@Configuration
@EnableTransactionManagement
public class DBConfig implements TransactionManagementConfigurer {
	private String driverClassName = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://lookiehackerton.cq8czcekfb2n.ap-northeast-2.rds.amazonaws.com:3306/toy2?useUnicode=true&characterEncoding=utf8&verifyServerCertificate=false&useSSL=true&serverTimezone=UTC";
    private String username = "lookie";
    private String password = "lookie2020";
    
    @Bean
    public DataSource dataSource(){
    	BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
	}

	@Override
	public PlatformTransactionManager annotationDrivenTransactionManager() {
		return transactionManger();
	}

	@Bean
	public PlatformTransactionManager transactionManger() {
		return new DataSourceTransactionManager(dataSource());
	}
}