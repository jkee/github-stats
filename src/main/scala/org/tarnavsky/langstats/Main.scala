package org.tarnavsky.langstats

import com.ning.http.client.AsyncHttpClient
import org.apache.log4j.xml.DOMConfigurator
import java.util
import com.fasterxml.jackson.module.scala.DefaultScalaModule
import com.fasterxml.jackson.databind.{DeserializationFeature, ObjectMapper, Module}
import com.fasterxml.jackson.core.`type`.TypeReference

import scala.collection.convert.wrapAsScala._
import org.eclipse.egit.github.core.client.GitHubClient
import org.eclipse.egit.github.core.service.RepositoryService
import org.eclipse.egit.github.core.Repository

/**
 * @author jkee
 */

object Main extends Logging {

  DOMConfigurator.configure("config/log4j.xml")
  val client = new AsyncHttpClient()

  val gitHubClient = new GitHubClient()

  def main(args: Array[String]) {
    getRepos
  }

  def getRepos: List[Repository] = {
    val repositoryService = new RepositoryService()
    val iterator = repositoryService.pageAllRepositories()
    var c = 0
    while(iterator.hasNext) {
      iterator.next().map(r => println(r.getUrl))
      print("::::::: PAGE " + c + ":::::::")
      c += 1
    }
    List()
  }

}
