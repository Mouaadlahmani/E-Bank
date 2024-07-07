package com.mouad.E_Bank.dto;

import com.mouad.E_Bank.model.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

	private Long userId;
	private String userName;
	private String password;
	
	public static UserDto toDto(User user) {
		return UserDto.builder()
				.userId(user.getUserId())
				.userName(user.getUserName())
				.password(user.getPassword())
				.build();
	}
	
}
