package com.srimanth.auth.service.service;

import java.util.Arrays;
import java.util.Optional;

import javax.management.relation.Role;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srimanth.auth.service.dto.RequestDto;
import com.srimanth.auth.service.dto.ResponseDto;
import com.srimanth.auth.service.entity.Users;
import com.srimanth.auth.service.repository.UserRepository;

@Service
public class AuthService {

	@Autowired
	private UserRepository userRepo;

	//register
	public Users register(RequestDto requestDto) {
		Users users=new Users(requestDto.getFirstName(),requestDto.getLastName(),requestDto.getEmail(),requestDto.getPassword());
		return userRepo.save(users);
		
				}
	
	
}
