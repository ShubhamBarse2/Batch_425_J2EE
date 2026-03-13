package com.tka;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectClass {

//	@Before("execution(* com.tka.Recharge.*(..))")
//	public void beforeMain() {
//		System.out.println("U r Pack is Expiring Soon plz Recharge ... !");
//	}

//	@Before("execution( public void myRecharge())")
//	public void beforeMain() {
//		System.out.println("U r Pack is Expiring Soon plz Recharge ... !");
//	}

//	@After("execution(* com.tka.Recharge.*(..))")
//	public void afterMain() {
//		System.out.println("Enjoy ur Data Pack  ... !");
//	}

	@Around("execution(* com.tka.Recharge.*(..))")
	public void aroundMain(ProceedingJoinPoint p) {

		System.out.println("U r Pack is Expiring Soon plz Recharge ... !");
		try {
			p.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}

		System.out.println("Enjoy ur Data Pack  ... !");
	}

}
