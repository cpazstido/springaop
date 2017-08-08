package com.cf.springaop.advisor;


import org.aspectj.lang.ProceedingJoinPoint;

public class AdvisorObject {	  
    
    public void beforeExecute(){  
        System.out.println("AdvisingObj beforeExcecute().");  
    }  
      
    public void afterExecute(){  
    	System.out.println("AdvisingObj afterExecute().");  
    }  
    
    public void roundExecute(ProceedingJoinPoint joinpoint) {
    	try{  
    		System.out.println("AdvisingObj before roundExecute().");  
            joinpoint.proceed();  
            System.out.println("AdvisingObj after roundExecute().");  
        }catch(Throwable t){  
        	System.out.println("AdvisingObj roundExecute() Error!");
        }  
    	
    }
}
