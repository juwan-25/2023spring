package kr.hs.study.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy
@Scope("prototype")
// 이름이 아닌 type으로 가져옴 > type만 써주면 됨
public class TestBean1 {
    public TestBean1() {
        System.out.println("TestBean1의 기본생성자");
    }
}
