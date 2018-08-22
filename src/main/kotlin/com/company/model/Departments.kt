package com.company.model

import com.fasterxml.jackson.annotation.JsonIgnore
import java.time.LocalDate
import javax.persistence.*

@Entity
class Departments (
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0,
        val dept_name: String? = null,
        val from_date: LocalDate? = null,
        val to_date: LocalDate? = null,

        @JsonIgnore
        @ManyToMany(cascade = arrayOf(CascadeType.ALL))
        @JoinTable(name = "department_employee",
                joinColumns = arrayOf(JoinColumn(name = "dept_id", referencedColumnName = "id")),
                inverseJoinColumns = arrayOf(JoinColumn(name = "emp_id", referencedColumnName = "id")))
        var employees: List<Employees> = mutableListOf<Employees>()
)