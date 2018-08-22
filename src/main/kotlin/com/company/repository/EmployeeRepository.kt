package com.company.repository

import com.company.model.Employees
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface EmployeeRepository : JpaRepository<Employees, Long> {

    fun findTop10ByOrderByIdDesc(): List<Employees>
}