package com.malves.devweek2024.service;

import com.malves.devweek2024.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
