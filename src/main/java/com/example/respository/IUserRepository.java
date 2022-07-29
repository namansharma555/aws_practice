package com.example.respository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.example.dao.User;

@Mapper
public interface IUserRepository {
	
	@Select("select * from user where contact_number=#{contactNumber}")
	public User getUserByNumber(@Param("contactNumber") String contactNumber);

}
