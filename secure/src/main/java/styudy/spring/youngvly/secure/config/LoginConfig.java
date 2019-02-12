package styudy.spring.youngvly.secure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.sql.ResultSet;

@Configuration
@EnableGlobalAuthentication
public class LoginConfig {
    @Bean
    public UserDetailsService userDetailsService(JdbcTemplate jdbcTemplate){
        RowMapper<User> userRowMapper = (ResultSet resultset, int i) ->
                new User(
                        resultset.getString("USER_ID"),
                        resultset.getString("PASSWORD"),
                        resultset.getBoolean("ENABLED"),
                        resultset.getBoolean("ENABLED"),
                        resultset.getBoolean("ENABLED"),
                        resultset.getBoolean("ENABLED"),
                        AuthorityUtils.createAuthorityList("ROLE_USER","ROLE_ADMIN")
                );
        return username -> jdbcTemplate.queryForObject("SELECT * FROM USER where USER_ID = ?", userRowMapper,username);
    }
}
