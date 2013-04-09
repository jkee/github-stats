package org.tarnavsky.langstats

import org.slf4j.LoggerFactory
import org.apache.log4j.xml.DOMConfigurator

/**
 * @author jkee
 */

trait Logging {
  protected val log = LoggerFactory.getLogger(getClass)
}

