package com.company.repository

import com.company.model.Employees
import com.company.model.Salaries
import com.company.model.Titles
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SalaryRepository : JpaRepository<Salaries, Long> {

    fun findByEmployee(employee: Employees): List<Salaries>
}