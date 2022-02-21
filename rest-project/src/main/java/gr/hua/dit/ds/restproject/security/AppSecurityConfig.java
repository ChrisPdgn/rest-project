package gr.hua.dit.ds.restproject.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	DataSource dataSource;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.jdbcAuthentication().dataSource(dataSource).passwordEncoder(passwordEncoder())
				.usersByUsernameQuery("select username,password, enabled from user where username=?")
				.authoritiesByUsernameQuery("select username, authority from authorities where username=?");

	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().cors()
		.and().authorizeRequests()
//		.antMatchers("/swagger-ui/index.html").permitAll()
//		.antMatchers("/**").hasRole("ADMIN")
//		.antMatchers("/application/**", "/master/**", "/student/**", "/instructor/**").hasRole("SEC")
//		.antMatchers("/instructor/**").hasRole("INSTR")
//		.antMatchers("/master/**", "/student/**").hasRole("STUDENT")
		.anyRequest().authenticated().and()
		.formLogin()
		.loginProcessingUrl("/authUser").permitAll().and()
		.logout().permitAll().and()
		.exceptionHandling()
		.accessDeniedPage("/403");

	}
	
	@Bean
    CorsConfigurationSource corsConfigurationSource() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", new CorsConfiguration().applyPermitDefaultValues());
        return source;
    }

	@Bean
	public PasswordEncoder passwordEncoder() {
		PasswordEncoder encoder = new BCryptPasswordEncoder();
		return encoder;
	}

}
