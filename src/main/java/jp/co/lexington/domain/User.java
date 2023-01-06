package jp.co.lexington.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class User {

	@Getter
	@Setter
	private Long id;
	@Getter
	@Setter
	private String name;
	@Getter
	@Setter
	private String email;

}