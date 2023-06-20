package com.example.demo.service;

import com.example.demo.models.entity.Profile;

import java.util.List;

public interface IProfileService {
    Profile insert(Profile profile);
    List<Profile> view();
}
