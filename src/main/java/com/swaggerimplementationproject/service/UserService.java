package com.swaggerimplementationproject.service;

import com.swaggerimplementationproject.entiry.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

User save(User user);

User getById(Long id);
List<User>getAll();

}
