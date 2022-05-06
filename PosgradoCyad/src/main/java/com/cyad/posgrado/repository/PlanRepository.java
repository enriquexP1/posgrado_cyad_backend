package com.cyad.posgrado.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.posgrado.entity.EPlan;

@Repository("repositorio_plan")
public interface PlanRepository extends JpaRepository<EPlan, Serializable> {
	public abstract EPlan findById(long id);
	public abstract List<EPlan> findByDivision(String division);
}
