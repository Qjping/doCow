package docow.converter;


import docow.struct.ido.LoginQueryIDO;
import docow.struct.ido.LoginUserIDO;
import docow.struct.vo1.LoginQueryVO;
import docow.struct.vo1.UserAccountVO;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface UserConverter {
    LoginQueryVO idoToVO(LoginQueryIDO queryIDO);
    LoginUserIDO voToIdo(UserAccountVO userAccountVO);
}
