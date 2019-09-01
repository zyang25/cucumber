package se.thinkcode;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import se.thinkcode.dao.PersonDAO;
import se.thinkcode.dao.PersonDAOImpl;

import javax.sql.DataSource;

@Configuration
public class AppConfig {
    @Bean
    public DataSource h2DataSource() {
        return new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.H2)
                .addScript("schema.sql")
                .addScript("data.sql")
                .build();
    }

    @Bean
    public PersonDAO jdbcPersonDao() {
        return new PersonDAOImpl();
    }
}
