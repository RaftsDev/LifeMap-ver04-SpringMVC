package com.lifemap.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.jboss.logging.Logger;
import org.springframework.stereotype.Component;

import com.lifemap.spring.entity.Tasks;

@Aspect
@Component
public class UserActivityAspect {

	private Logger myLogger = Logger.getLogger(getClass().getName());
	
	@Pointcut("execution(* com.lifemap.spring.dao.DataDAOImpl.deleteTask(..))")
	private void forDeleteTask(){}
	
	@Pointcut("execution(* com.lifemap.spring.dao.DataDAOImpl.saveTask(..))")
	private void forSaveTask(){}
	
	@Pointcut("forDeleteTask() || forSaveTask()")
	private void forUserActivityLog(){}

	@AfterReturning("forUserActivityLog()")
	public void before(JoinPoint theJoinPoint) {
		String theMethod = theJoinPoint.getSignature().toShortString();
		
		Object[] args = theJoinPoint.getArgs();
		String arguments = "Arguments:";
		for(Object tmpArg : args ) {
			
			if(tmpArg instanceof Tasks) {
				Tasks tmpTasks;
				tmpTasks = (Tasks) tmpArg;
				
				arguments+=" "+ tmpTasks.getId()+" |";
			}else {
			arguments+=" "+ tmpArg.toString()+" |";
		}
			
		myLogger.info("=====> @AfterReturning: calling method: " + theMethod + ", " + arguments);
	}
	
}
}
