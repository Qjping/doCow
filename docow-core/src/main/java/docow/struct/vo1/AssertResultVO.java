package docow.struct.vo1;

import lombok.Data;

@Data
public class AssertResultVO {
    public Boolean isPass;
    public String failCause;
}
