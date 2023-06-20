package com.example.demo.controller;

import com.example.demo.models.entity.Profile;
import com.example.demo.models.response.SuccessResponse;
import com.example.demo.service.IProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profile")
public class ProfileController {
    @Autowired
    private IProfileService profileService;

    @PostMapping("/insert")
    public ResponseEntity insert(@RequestBody Profile profile) {
        Profile result = profileService.insert(profile);
        return ResponseEntity.status(HttpStatus.CREATED).body(new SuccessResponse<>("Success insert profile", result));
    }

    @GetMapping("/view")
    public ResponseEntity view() {
        List<Profile> result = profileService.view();
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse<>("Success insert profile", result));
    }
}
