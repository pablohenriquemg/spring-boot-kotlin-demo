package com.company.repository

import com.company.model.Employees
import com.company.model.Titles
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TitleRepository : JpaRepository<Titles, Long> {

    fun findByEmployee(employee: Employees): List<Titles>
}