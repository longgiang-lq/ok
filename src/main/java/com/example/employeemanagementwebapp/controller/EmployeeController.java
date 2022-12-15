package com.example.employeemanagementwebapp.controller;

import com.example.employeemanagementwebapp.dto.*;
import com.example.employeemanagementwebapp.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.employeemanagementwebapp.service.EmployeeService;


import java.util.List;
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    // display list of employees
//    @GetMapping("/")
//    public String viewHomePage(Model model) {
//        return findPaginated(1, "firstName", "asc", model);
//    }
    @GetMapping("/")
    public String viewHomePage() {
//        DanhSachDaXem danhSachDaXem =employeeService.DanhSachDaXem(macophieu);
//        model.addAttribute("danhSachDaXem", danhSachDaXem);

        return "index_test";
    }





    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        // save employee to database
        employeeService.saveEmployee(employee);
        return "redirect:/";
    }

    @GetMapping("/find/{macophieu}")
    public String showFormForUpdate(@PathVariable( value = "macophieu") String macophieu, Model model) {

        // get employee from the service
        List<DoanhThu> doanhthu = employeeService.Doanhthu(macophieu);
        List<LoiNhuan> loinhuan = employeeService.LoiNhuan(macophieu);
        List<VonHoa> vonHoa = employeeService.VonHoa(macophieu);
        List<TongHop> tongHop = employeeService.Tonghop(macophieu);
        DanhSachDaXem danhSachDaXem =employeeService.DanhSachDaXem(macophieu);

        // set employee as a model attribute to pre-populate the form
        model.addAttribute("doanhthu", doanhthu);
        model.addAttribute("loinhuan", loinhuan);
        model.addAttribute("vonHoa", vonHoa);
        model.addAttribute("tongHop", tongHop);
        model.addAttribute("danhSachDaXem", danhSachDaXem);
        return "test";
    }
//    @GetMapping("/findEmployee/{id}")
//    public String findEmployee(@PathVariable( value = "id") long id, Model model) {
//
//        // get employee from the service
//        Employee employee = employeeService.getEmployeeById(id);
//        model.addAttribute("employee", employee);
//
//
//        return "view";
//    }


//    @GetMapping("/showInformation/{id}")
//    public String showInformation(@PathVariable( value = "id") long id, Model model) {
//
//        // get employee from the service
//        Employee employee = employeeService.getEmployeeById(id);
//        model.addAttribute("employee", employee);
//
//
//        return "view";
//    }



//    @GetMapping("/deleteEmployee/{id}")
//    public String deleteEmployee(@PathVariable (value = "id") long id) {
//
//        // call delete employee method
//        this.employeeService.deleteEmployeeById(id);
//        return "redirect:/";
//    }


//    @GetMapping("/page/{pageNo}")
//    public String DanhSachDaXem(@PathVariable (value = "pageNo") int pageNo,
//                                @RequestParam("sortField") String sortField,
//                                @RequestParam("sortDir") String sortDir,
//                                Model model) {
//        int pageSize = 5;
//
//        Page<DanhSachDaXem> page = employeeService.DanhSachDaXem(pageNo, pageSize, sortField, sortDir);
//        List<DanhSachDaXem> listEmployees = page.getContent();
//
//        model.addAttribute("currentPage", pageNo);
//        model.addAttribute("totalPages", page.getTotalPages());
//        model.addAttribute("totalItems", page.getTotalElements());
//
//        model.addAttribute("sortField", sortField);
//        model.addAttribute("sortDir", sortDir);
//        model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");
//
//        model.addAttribute("listEmployees", listEmployees);
//        return "index_test";
//    }
}
