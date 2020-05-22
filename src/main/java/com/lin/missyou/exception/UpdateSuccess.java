package com.lin.missyou.exception;

import com.lin.missyou.exception.http.HttpException;

public class UpdateSuccess extends HttpException {
    public UpdateSuccess(int code) {
        this.httpStatusCode = 200;
        this.code = code;
    }
}
