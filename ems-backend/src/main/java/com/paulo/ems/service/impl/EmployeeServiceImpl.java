package com.paulo.ems.service.impl;

import com.paulo.ems.dto.EmployeeDto;
import com.paulo.ems.entity.Employee;
import com.paulo.ems.mapper.EmployeeMapper;
import com.paulo.ems.repository.EmployeeRepository;
import com.paulo.ems.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}
