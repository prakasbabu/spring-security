package com.pk.controller;

import com.pk.entity.CustomUser;
import com.pk.service.iface.CustomUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/home/user")
@RequiredArgsConstructor
public class CustomUserController {
    private final CustomUserService customUserService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public CustomUser createUser(@RequestBody CustomUser customUser){
        return customUserService.createUser(customUser);
    }
}
