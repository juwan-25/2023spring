package kr.hs.study.dao;

import kr.hs.study.dto.testDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class testDAO {
    //실제 db 접속해서 쿼리 날림 > JdbcTemplate
    @Autowired
    JdbcTemplate jdbc;
    @Autowired
    Mapper mapper;

    //저장 > 저장할 값이 dto에 있음
    public void insert(testDTO dto){
        String sql = "insert into test values(?,?)";
        jdbc.update(sql, dto.getData1(), dto.getData2());
    }

    //업데이트
    public void update(testDTO dto){
        String sql = "update test set data2=? where data1=?";
        jdbc.update(sql, dto.getData2(), dto.getData1());
    }

    //지우기
    public void delete(testDTO dto){
        String sql="delete from test where data1=?";
        jdbc.update(sql, dto.getData1());
    }

    //리스트 - select
    public List<testDTO> select(){
        String sql = "select * from test";
        List<testDTO> list = jdbc.query(sql, mapper);
        return list;
    }
}
