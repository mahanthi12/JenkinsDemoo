package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student1;

import jakarta.transaction.Transactional;

@Repository
public interface StudentRepo extends JpaRepository<Student1,Long>{
	List<Student1> findByname(String str);
	List<Student1> findBypercentage(int p);
	
	@Query("select u from Student1 u where u.name=?1 and u.college=?2")
	List<Student1> findByNameAndCollege(String s1,String s2);
@Modifying
@Transactional
@Query(value="update Student1 set percentage=?1 where name=?2",nativeQuery=true )
	public int updatePercentBasedOnName(int percentage,String name);
}
