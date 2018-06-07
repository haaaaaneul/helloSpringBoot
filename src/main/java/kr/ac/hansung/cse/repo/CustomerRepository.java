package kr.ac.hansung.cse.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import kr.ac.hansung.cse.model.Customer;

//DAO, JPA Repository 상속받
public interface CustomerRepository extends CrudRepository<Customer, Long>{ //interface로 해주면 class에 대한 내용 자동적으로 만들어줌
	
	List<Customer> findByLastName(String lastName); //이름을 바탕으로 자동으로 메서드 구현해줌

}