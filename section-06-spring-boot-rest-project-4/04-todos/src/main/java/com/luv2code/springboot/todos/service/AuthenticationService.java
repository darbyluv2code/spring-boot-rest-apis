package com.luv2code.springboot.todos.service;

import com.luv2code.springboot.todos.request.AuthenticationRequest;
import com.luv2code.springboot.todos.request.RegisterRequest;
import com.luv2code.springboot.todos.response.AuthenticationResponse;

public interface AuthenticationService {
    void register(RegisterRequest input) throws Exception;
    AuthenticationResponse login(AuthenticationRequest request);
}
