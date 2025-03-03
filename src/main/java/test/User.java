package test;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
	@JsonProperty
  String id;
	@JsonProperty
  String name;
	@JsonProperty
  String Password;
	public User(String id,String name,String Password) {
		this.id=id;
		this.name=name;
		this.Password=Password;
	}
	public User() {
		
	};
	
	
}