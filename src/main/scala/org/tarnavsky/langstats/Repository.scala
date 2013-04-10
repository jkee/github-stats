package org.tarnavsky.langstats

/**
 * @author jkee
 */

class Repository {

  var id: Int = 0
  var name: String = null
  var owner: String = null
  var fork: Boolean = false
  var url: String = null

  def setId(id: Int) {
    this.id = id
  }

  def setName(name: String) {
    this.name = name
  }

  override def toString = {
    "Repository: " + "id: " + id + " name: " + name
  }

}
