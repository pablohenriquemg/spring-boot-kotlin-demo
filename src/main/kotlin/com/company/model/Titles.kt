package com.company.model

import com.fasterxml.jackson.annotation.JsonIgnore
import java.time.LocalDate
import javax.persistence.*

@Entity
class Titles (
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0,
        val title: String? = null,
        val from_date: LocalDate? = null,
        val to_date: LocalDate? = null,

        @JsonIgnore
        @ManyToOne
        @JoinColumn(name = "emp_id")
        var employee: Employees? = null
)