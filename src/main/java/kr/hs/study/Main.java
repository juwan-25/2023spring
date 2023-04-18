package kr.hs.study;

import kr.hs.study.config.BeanConfig;
import kr.hs.study.dao.testDAO;
import kr.hs.study.dto.testDTO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);

        testDAO dao = ctx.getBean(testDAO.class);

        testDTO t = new testDTO();
//        t.setData1(2);
//        t.setData2("Spring1");
//
//        dao.insert(t);
//        System.out.println("Inserted");
//
//        t.setData1(2);
//        t.setData2("Spring222222");
//        dao.update(t);

        t.setData1(1);
        dao.delete(t);
        System.out.println("Deleted");

        List<testDTO> list = dao.select();
        for(testDTO bean:list){
            System.out.println(bean.getData1());
            System.out.println(bean.getData2());
        }
        System.out.println("Selected");

        ctx.close();
    }
}