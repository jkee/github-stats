package org.tarnavsky.langstats

/**
 * @author jkee
 */

class Repository {

  var id: Int = 0
  var owner: String = null
  var fork: Boolean = false
  var url: String = null

  def setId(id: Int) {
    this.id = id
  }

  override def toString = {
    "Repository: " + "id: " + id + " url: " + url
  }

}
