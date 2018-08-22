package com.company.service

import com.company.model.Departments
import com.company.repository.DepartmentRepository
import com.company.repository.EmployeeRepository
import org.springframework.stereotype.Service

@Service
class DepartmentService(private val departmentRepository: DepartmentRepository,
                        private val employeeRepository: EmployeeRepository) {

    fun save(department: Departments, employeer_id: Long): Departments {
        if (department == null) {
            throw RuntimeException()
        }

        if(employeer_id != null){
            var employee = employeeRepository.findById(employeer_id)
            department.employees = listOf(employee.get())
        }

        return departmentRepository.save(department)
    }
}