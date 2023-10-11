package com.pk.service.impl;

import com.pk.entity.CustomUser;
import com.pk.repo.CustomUserRepo;
import com.pk.service.iface.CustomUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserServiceImpl implements CustomUserService {
    private final CustomUserRepo customUserRepo;
    @Override
    public CustomUser createUser(CustomUser customUser) {
        return customUserRepo.save(customUser);
    }
}
