package com.cf.springaop.advisor;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectJAnnotationAdvisorObj {
    @Pointcut("execution(* com.cf.springaop.service..*.*(..))")  
    public void performance() {  
          
    }  
    
    @Pointcut("execution(* com.cf.springaop.service.MyService.loginIn(..))")  
    public void performance1() {  
          
    } 
    
    @Before("performance1()")
    public void beforeExecute1() {
    	System.out.println("AspectJAnnotationAdvisorObj beforeExcecute1().");
    }
      
    @Before("performance()")  
    public void beforeExecute(){  
        System.out.println("AspectJAnnotationAdvisorObj beforeExcecute().");  
    }  
      
    @AfterReturning("performance()")  
    public void afterExecute(){  
    	System.out.println("AspectJAnnotationAdvisorObj afterExecute().");  
    }  
}
