package com.sparta.cupeed.global.exception;

import com.sparta.cupeed.global.code.ResponseCode;

import lombok.Getter;


@Getter
public class BizException extends RuntimeException {

	private final ResponseCode responseCode;

	public BizException(ResponseCode responseCode) {
		super(responseCode.getMessage());
		this.responseCode = responseCode;
	}
}