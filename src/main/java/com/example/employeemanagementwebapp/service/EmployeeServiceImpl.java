package com.example.employeemanagementwebapp.service;

import com.example.employeemanagementwebapp.dto.*;
import com.example.employeemanagementwebapp.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.example.employeemanagementwebapp.repository.EmployeeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        this.employeeRepository.save(employee);

    }



//    @Override
//    public Employee getEmployeeBYMaCoPhieu(String MaCoPhieu) {
//        Optional<Employee> optional=employeeRepository.findBy(MaCoPhieu);
//        return null;
//    }



    @Override
    public Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
        Sort sort=sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() : Sort.by(sortField).descending();

        Pageable pageable= PageRequest.of(pageNo -1,pageSize,sort);
        return this.employeeRepository.findAll(pageable);
    }

    @Override
    public DanhSachDaXem DanhSachDaXem(String macophieu) {
        return employeeRepository.DanhSachDaXem(macophieu);
    }








    @Override
    public List<DoanhThu> Doanhthu(String macophieu) {
        return employeeRepository.Doanhthu(macophieu);
    }

    @Override
    public List<LoiNhuan> LoiNhuan(String macophieu) {
        return employeeRepository.LoiNhuan(macophieu);
    }

    @Override
    public List<VonHoa> VonHoa(String macophieu) {
        return employeeRepository.VonHoa(macophieu);
    }

    @Override
    public List<TongHop> Tonghop(String macophieu) {
        return employeeRepository.Tonghop(macophieu);
    }
}
