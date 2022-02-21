package gr.hua.dit.ds.restproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.core.mapping.RepositoryDetectionStrategy.RepositoryDetectionStrategies;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import gr.hua.dit.ds.restproject.entity.Application;
import gr.hua.dit.ds.restproject.entity.Authority;
import gr.hua.dit.ds.restproject.entity.Instructor;
import gr.hua.dit.ds.restproject.entity.Master;
import gr.hua.dit.ds.restproject.entity.Secretary;
import gr.hua.dit.ds.restproject.entity.Student;
import gr.hua.dit.ds.restproject.entity.User;

@Configuration
public class ExposeEntityIdRestConfig {

	@Bean
	public RepositoryRestConfigurer repositoryRestConfigurer() {

		return new RepositoryRestConfigurer() {

			@Override
			public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
				//config.setRepositoryDetectionStrategy(RepositoryDetectionStrategies.ALL);
				config.exposeIdsFor(User.class);
				config.exposeIdsFor(Application.class);
				config.exposeIdsFor(Authority.class);
				config.exposeIdsFor(Instructor.class);
				config.exposeIdsFor(Master.class);
				config.exposeIdsFor(Secretary.class);
				config.exposeIdsFor(Student.class);
			}
		};
	}

}
