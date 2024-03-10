package com.example.dietApp.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.dietApp.domain.Test;

@Repository
public class TestRepository {
    
    @Autowired
    private NamedParameterJdbcTemplate template;

    private static final RowMapper<Test> TEST_ROW_MAPPER
	= (rs,i) -> {
		Test test = new Test();
		test.setName(rs.getString("name"));
		return test;
	};

    public List<Test> getName(){
        String findAllSql = "select name from test;";
		List<Test> name = template.query(findAllSql,TEST_ROW_MAPPER);
		return name;
    }
}