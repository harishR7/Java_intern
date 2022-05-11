package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer > {
	
	public List<Doctor> findByDepartment(String srch);
	
	public Doctor findByDoctorName(String srch);
	
	public List<Doctor> findByDoctorNameAndDepartment(String name,String dept);
	
	
//@Query(nativeQuery = true ,value="select doc.doctor_id,doc.doctor_name,doc.department from harish_doctor doc where doctor_name=:docName or department=:dept")
//	public List<Doctor> getByNameDept(@Param("docName")String docName,@Param("dept")String dept);
	@Query(nativeQuery = true, value = "select * from harish_doctor where doctor_name=:docName or department=:dept")
	public List<Doctor> getByNameDept(@Param("docName") String docName, @Param("dept") String dept);	
	
}
