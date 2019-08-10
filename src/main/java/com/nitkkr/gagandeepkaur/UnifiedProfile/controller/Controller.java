package com.nitkkr.gagandeepkaur.UnifiedProfile.controller;

import com.nitkkr.gagandeepkaur.UnifiedProfile.model.CFUser;
import com.nitkkr.gagandeepkaur.UnifiedProfile.service.UserDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/codeforces")
public class Controller {
    @Autowired
    UserDaoService userDaoService;

    @GetMapping("/{id}")
    public CFUser getUserById(@PathVariable("id") String id){

        return userDaoService.getUserById(id);

    }
}
