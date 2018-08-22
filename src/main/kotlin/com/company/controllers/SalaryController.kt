package com.company.controllers

import com.company.model.Salaries
import com.company.repository.SalaryRepository
import com.company.service.SalaryService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/salaries")
class SalaryController(private val salaryRepository: SalaryRepository,
                       private val salaryService: SalaryService) {

    @GetMapping("")
    fun findAll() = salaryRepository.findAll()

    @PostMapping("")
    fun save(@RequestBody salary: Salaries,
             @RequestParam("employeer_id") employeer_id: Long) = salaryService.save(salary, employeer_id)

}