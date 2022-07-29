
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration()
@MapperScan("com.example")
@ComponentScan(basePackages = "com.example.aws_practice")

public class AWSPracticeApplication {
	
	@Bean
    public DataSource datasource() {
        return DataSourceBuilder.create()
          .driverClassName("com.mysql.cj.jdbc.Driver")
          .url("jdbc:mysql://first.cqwafflxrcjr.ap-south-1.rds.amazonaws.com:3306/practice")
          .username("admin")
          .password("Admin1234")
          .build(); 
    }

	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource);
		return (SqlSessionFactory) sqlSessionFactoryBean.getObject();
	}

	public static void main(String[] args) {
		SpringApplication.run(AWSPracticeApplication.class, args);
	}

}
