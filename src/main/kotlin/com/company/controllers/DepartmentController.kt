package com.company.controllers

import com.company.model.Departments
import com.company.repository.DepartmentRepository
import com.company.service.DepartmentService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/departments")
class DepartmentController(private val departmentRepository: DepartmentRepository,
                           private val departmentService: DepartmentService) {

    @GetMapping("")
    fun findAll() = departmentRepository.findAll()

    @GetMapping("/{department_id}")
    fun findById(@PathVariable department_id:Long) = departmentRepository.findById(department_id)

    @PostMapping("")
    fun save(@RequestBody department: Departments,
             @RequestParam("employeer_id") employeer_id: Long) = departmentService.save(department, employeer_id)
}