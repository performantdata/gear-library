/*
 * Copyright © 2015 Performant Data LLC. All rights reserved.
 */
package com.performantdata.gearlibrary.war

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.config.annotation.web.builders.HttpSecurity

/** Spring Security configuration for this application.
  * 
  * @author Michael
  */
@EnableWebSecurity(debug=true)
class SecurityConfig extends WebSecurityConfigurerAdapter {

  /** Configure the authentication method. */
  @Autowired
  def configureGlobal(auth: AuthenticationManagerBuilder): Unit = {
    auth.inMemoryAuthentication()
      .withUser("user").password("password").roles("USER")
  }

  /** Configure the HTTP security. */
  protected override def configure(http: HttpSecurity): Unit = {
    http
      .authorizeRequests()
        .antMatchers("/javax.faces.resource/**", "/index.xhtml", "/gear/index.xhtml").permitAll()
        .anyRequest().authenticated()
      .and()
      .formLogin.loginPage("/login").permitAll()
  }
}
