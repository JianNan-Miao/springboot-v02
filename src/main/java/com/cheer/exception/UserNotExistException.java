package com.cheer.exception;

public class UserNotExistException extends RuntimeException {
    public UserNotExistException(String message) {
        super("用户不存在");
    }
}
