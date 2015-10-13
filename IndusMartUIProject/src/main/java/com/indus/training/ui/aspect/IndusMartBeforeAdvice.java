package com.indus.training.ui.aspect;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.aop.MethodBeforeAdvice;


	public class IndusMartBeforeAdvice implements MethodBeforeAdvice {
		
		
		static final Logger logger = Logger.getLogger(IndusMartBeforeAdvice.class);

		public void before(Method method, Object[] args, Object target)
				throws Throwable {

			StringBuffer strBuffer = new StringBuffer();
			strBuffer.append("Class name:");
			strBuffer.append(target);
			strBuffer.append("Method name:");
			strBuffer.append(method);
			for (int i = 0; i < args.length; i++) {
				strBuffer.append(args[i]);
			}

			PropertyConfigurator.configure("log4j.properties");
			logger.info(strBuffer);
			logger.debug(strBuffer);
		}
	}

