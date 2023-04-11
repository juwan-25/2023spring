package kr.hs.study.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Data
public class TestBean1 {
    @Autowired
    private Car data1;

    @Autowired
    private Train data2;
}
