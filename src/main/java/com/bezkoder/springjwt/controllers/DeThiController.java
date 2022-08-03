package com.bezkoder.springjwt.controllers;

import com.bezkoder.springjwt.dtos.DethiDto;
import com.bezkoder.springjwt.service.dethi.IDeThiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/admin")
public class DeThiController {
    @Autowired
    private IDeThiService iDeThiService;

    @PostMapping("/create")
    public ResponseEntity<DethiDto> createDeThi(@RequestBody DethiDto dethiDto){
        return new ResponseEntity<>(iDeThiService.save(dethiDto), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<DethiDto>> getAllDeThi() {
        return new ResponseEntity<>(iDeThiService.findAll(), HttpStatus.OK);
    }

}
