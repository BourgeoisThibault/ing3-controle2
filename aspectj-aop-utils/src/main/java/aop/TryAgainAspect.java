package aop;

import annotation.TryAgain;
import lombok.extern.java.Log;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.reflect.Method;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author BOURGEOIS Thibault
 * Date     09/11/2017
 * Time     12:03
 */
@Component
@Aspect
@Log
public class TryAgainAspect {

    @Pointcut("@annotation(annotation.TryAgain)")
    public void tryAgainAnnotation() {}

    @Around("tryAgainAnnotation() && execution(* *(..))")
    public Object restLog(ProceedingJoinPoint joinPoint) {

        Object returnValue = null;
        try {
            returnValue = joinPoint.proceed();
            log.warning(String.format("[RestLogAspect] : %s", "fonctionne"));
        } catch (Throwable throwable) {
            log.warning(String.format("[RestLogAspect] : %s", throwable.getMessage()));
        }

        return returnValue;
    }

}
