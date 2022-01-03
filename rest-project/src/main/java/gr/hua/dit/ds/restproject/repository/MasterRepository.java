package gr.hua.dit.ds.restproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import gr.hua.dit.ds.restproject.entity.Master;

@RepositoryRestResource(path="master")
public interface MasterRepository extends JpaRepository<Master, Integer>{

}
