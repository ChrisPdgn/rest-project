package gr.hua.dit.ds.restproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import gr.hua.dit.ds.restproject.entity.Application;

@RepositoryRestResource(path="application", exported = true)
public interface ApplicationRepository extends JpaRepository<Application, Integer>{

}
