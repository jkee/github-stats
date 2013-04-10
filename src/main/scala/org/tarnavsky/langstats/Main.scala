package org.tarnavsky.langstats

import com.ning.http.client.AsyncHttpClient
import org.apache.log4j.xml.DOMConfigurator
import java.util
import com.fasterxml.jackson.module.scala.DefaultScalaModule
import com.fasterxml.jackson.databind.{DeserializationFeature, ObjectMapper, Module}
import com.fasterxml.jackson.core.`type`.TypeReference

/**
 * @author jkee
 */

object Main extends Logging {

  DOMConfigurator.configure("config/log4j.xml")

  def main(args: Array[String]) {
    val client = new AsyncHttpClient()
    val future = client.prepareGet("https://api.github.com/repositories").execute()
    val response = future.get()
    val body: String = response.getResponseBody
    println(body)
    client.close()

    val mapper = new ObjectMapper()
    mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
    val module: Module = DefaultScalaModule
    mapper.registerModule(module)
    val list: util.List[Repository] =
      mapper.readValue(body, new TypeReference[util.List[Repository]] {})
    println(list)
  }

}
