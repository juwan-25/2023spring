package kr.hs.study.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Data
public class Member {
    @Autowired
    @Qualifier("p1")
    private Person p1;

    @Autowired
    @Qualifier("p2")
    private Person p2;
}
