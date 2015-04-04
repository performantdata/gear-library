/*
 * Copyright © 2015 Performant Data LLC. All rights reserved.
 */
package com.performantdata.gearlibrary.war

import java.lang.Iterable
import scala.collection.JavaConversions.bufferAsJavaList
import com.performantdata.gearlibrary.model.Asset
import com.performantdata.gearlibrary.service.{AssetService => EJBService}
import javax.enterprise.context.RequestScoped
import javax.inject.Inject
import javax.inject.Named
import scala.beans.BeanProperty

/** Backing bean for assets.
  */
@Named
@RequestScoped
class AssetController {
  /** Asset EJB service to use for data access. */
  @Inject private[this] var service: EJBService = _
}
