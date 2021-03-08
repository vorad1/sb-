package nz.ac.op.cs.SBHSQL.Prj;

import nz.ac.op.cs.SBHSQL.Prj.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SbhsqlPrjApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbhsqlPrjApplication.class, args);
	}
	@Bean
	public UserService getUserService() {
		return new UserService();
	}
}
