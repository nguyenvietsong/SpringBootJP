package com.bezkoder.springjwt.controllers;

import com.bezkoder.springjwt.dtos.DethiDto;
import com.bezkoder.springjwt.dtos.TrinhDoDto;
import com.bezkoder.springjwt.service.dethi.IDeThiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/admin")
public class DeThiController {
    @Autowired
    private IDeThiService iDeThiService;

    //@PostMapping("/create")
    @RequestMapping(value = "/create", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<DethiDto> createDeThi(@RequestBody DethiDto dethiDto){
        return new ResponseEntity<>(iDeThiService.save(dethiDto), HttpStatus.OK);
    }

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<List<DethiDto>> getlistDethi(){
        return new ResponseEntity<>(iDeThiService.findAll(), HttpStatus.OK);
    }



//    public ResponseEntity<Employee> createEmp(@RequestBody Employee emp) {
//        // test git
//        return new ResponseEntity<>(empRepo.save(emp), HttpStatus.OK);
//    }

    @GetMapping
    public ResponseEntity<List<DethiDto>> getAllDeThi() {
        return new ResponseEntity<>(iDeThiService.findAll(), HttpStatus.OK);
    }

}
