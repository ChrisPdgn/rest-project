package gr.hua.dit.ds.restproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gr.hua.dit.ds.restproject.entity.Application;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Integer>{

}
