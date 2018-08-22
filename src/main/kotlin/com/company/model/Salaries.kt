package com.company.model

import com.fasterxml.jackson.annotation.JsonIgnore
import java.time.LocalDate
import javax.persistence.*

@Entity
class Salaries (
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0,
        val salary: Int = 0,
        val from_date: LocalDate? = null,
        val to_date: LocalDate? = null,

        @JsonIgnore
        @ManyToOne
        @JoinColumn(name = "emp_id")
        var employee: Employees? = null
)