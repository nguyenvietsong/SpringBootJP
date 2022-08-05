package com.bezkoder.springjwt.controllers;

import com.bezkoder.springjwt.dtos.TrinhDoDto;
import com.bezkoder.springjwt.service.trinhdo.ITrinhDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/admin")
public class TrinhDoController {
    @Autowired
    private ITrinhDoService iTrinhDoService;

    @GetMapping(value = "/list-trinh-do", produces = {MediaType.APPLICATION_JSON_VALUE})
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<List<TrinhDoDto>> getTrinhDo(){
        return new ResponseEntity<>(iTrinhDoService.findAll(), HttpStatus.OK);
    }
}
