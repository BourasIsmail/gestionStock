package ma.emsi.gestionStock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.emsi.gestionStock.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, long>{

}
