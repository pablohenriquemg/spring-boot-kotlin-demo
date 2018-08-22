package com.company.service

import com.company.model.Employees
import com.company.model.Titles
import com.company.repository.EmployeeRepository
import com.company.repository.TitleRepository
import org.springframework.stereotype.Service

@Service
class TitleService(private val titleRepository: TitleRepository,
                   private val employeeRepository: EmployeeRepository) {

    fun save(title: Titles, employeer_id: Long): Titles {
        if (title == null) {
            throw RuntimeException()
        }

        if(employeer_id != null){
            var employee = employeeRepository.findById(employeer_id)
            title.employee = employee.get()
        }

        return titleRepository.save(title)
    }
}