package com.example.ums.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.ums.Repository.UserRepository;
import com.example.ums.entity.User;
import com.example.ums.exceptionhandler.Usernotfoundbyid;
@Service
public class UserService {

	private final UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
	
	

	public void addUser(User user) {
		userRepository.save(user);
		
	}

	public List<User> findAllUsers() {
		return userRepository.findAll();
	}



	public void deleteproduct(int userid) {
		User user=this.findbyId(userid);
		 userRepository.deleteById(userid);
		
	}



	



	public User findbyId(int userid) {
//		return userRepository.findById(userid)
//				.orElseThrow(() -> new Usernotfoundbyid("User not found check the details","display-users"));
		
		Optional<User> optional=userRepository.findById(userid);
		if(optional.isPresent()) {
			return optional.get();
		}else {
		throw new Usernotfoundbyid("User not found check the details","display-users");
		}
	}



	public void editUser(User user) {
		this.findbyId(user.getUserid());//conform that the user is present are not
		 userRepository.save(user);
		
	}

	
}
