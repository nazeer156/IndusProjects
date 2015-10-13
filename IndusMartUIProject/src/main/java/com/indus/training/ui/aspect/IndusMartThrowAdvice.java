package com.indus.training.ui.aspect;

import org.springframework.aop.ThrowsAdvice;

public class IndusMartThrowAdvice implements ThrowsAdvice {
	public void afterThrowing(IllegalArgumentException e) throws Throwable {
		
		StringBuffer strBuffer = new StringBuffer();
		strBuffer.append("Exception :");
		strBuffer.append(e);

		System.out.println(strBuffer);
	}
}