package com.luv2code.springboot.todos.util;

import com.luv2code.springboot.todos.entity.User;

public interface FindAuthenticatedUser {
    User getAuthenticatedUser();
}
