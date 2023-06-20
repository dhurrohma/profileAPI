package com.example.demo.service;

import com.example.demo.models.entity.Profile;
import com.example.demo.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService implements IProfileService{
    @Autowired
    private ProfileRepository profileRepository;

    @Override
    public Profile insert(Profile profile) {
        return profileRepository.save(profile);
    }

    @Override
    public List<Profile> view() {
        return profileRepository.findAll();
    }
}
