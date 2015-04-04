/*
 * Copyright © 2015 Performant Data LLC. All rights reserved.
 */
package com.performantdata.gearlibrary.war

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer

/** Spring Security web application initializer.
  * 
  * @author Michael
  */
class SecurityWebApplicationInitializer
  extends AbstractSecurityWebApplicationInitializer(classOf[SecurityConfig]) {}
