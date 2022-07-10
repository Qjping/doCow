package docow.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class UserAuthorizeAspect {
    @Autowired
    private StringRedisTemplate redisTemplate;

//    @Pointcut("execution(public * cow.interfaces.CaseDetailCrontroller*.*(..))"
//            +"&& ! execution(public * cow.interfaces.LoginController.*(..))")
//    public void verify(){
//
//    }
//
//    @Before("verify()")
//    public void doVerify(){
//        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
//        HttpServletRequest request = attributes.getRequest();
//        String token=request.getHeader("Access-Token");
//
//        //查询cookie
//        Cookie cookie = CookiesUtil.get(request, CookieConstant.TOKEN);
//        if(token == null){
//            log.warn("【登录校验】没有token信息");
//            throw  new UserAuthorizeExption();
//        }
//
//        String tokenValue = redisTemplate.opsForValue().get(String.format(RedisConstant.TOKEN_PREFIX, token));
//        if(tokenValue == null ){
//            log.warn("【登录校验】Redis中查不到token");
//            throw  new UserAuthorizeExption();
//        }
//    }
}
