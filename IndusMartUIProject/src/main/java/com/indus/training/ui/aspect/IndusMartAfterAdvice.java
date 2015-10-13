package com.indus.training.ui.aspect;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.aop.AfterReturningAdvice;

public class IndusMartAfterAdvice implements AfterReturningAdvice {

	static final Logger logger = Logger.getLogger(IndusMartAfterAdvice.class);
	public void afterReturning(Object returnValue, Method method,
			Object[] args, Object target) throws Throwable {
		
		StringBuffer strBuffer = new StringBuffer();
		strBuffer.append("Class name:");
		strBuffer.append(target);
		strBuffer.append("Method name:");
		strBuffer.append(method);
		strBuffer.append("Return output:");
		strBuffer.append(returnValue);
		
		strBuffer.append("Object array:");
		for (int i = 0; i < args.length; i++) {
			strBuffer.append(args[i]);
		}

		PropertyConfigurator.configure("log4j.properties");
		logger.info(strBuffer);
		logger.debug(strBuffer);
		System.out.println(strBuffer);
	}
}