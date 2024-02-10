package br.com.juanteste.demo.user;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class UserModel {
  
  private String username;
  @Getter
  @Setter
  private String name;
  private String password;
}
