package com.company.repository

import com.company.model.Departments
import com.company.model.Employees
import com.company.model.Salaries
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface DepartmentRepository : JpaRepository<Departments, Long> {

    fun findByEmployees(employee: Employees): List<Departments>
}