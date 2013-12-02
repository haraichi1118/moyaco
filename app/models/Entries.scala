package models

import org.joda.time.DateTime
import play.api.db._
import play.api.Play.current

import scala.slick.driver.MySQLDriver.simple._
import scala.slick.jdbc._ // --(*) これが超大事！！
import Database.threadLocalSession

import org.apache.commons.dbcp.BasicDataSource
import javax.sql.DataSource

case class Entry(id: Long, userId: Long, content: String, displayFlg: Boolean, createdAt: DateTime, updatedAt: DateTime)

/**
 * Created with IntelliJ IDEA.
 * User: tsuiki
 * Date: 13/12/01
 * Time: 19:40
 * To change this template use File | Settings | File Templates.
 */
object Entries {


  object

//  val entry = {
//    get[Long]("id") ~ get[Long]("userId") ~ get[String]("content") ~ get[Boolean]("displayFlg") ~
//      get[org.joda.time.DateTime]("createdAt") ~ get[org.joda.time.DateTime]("updatedAt") map {
//      case id~userId~content~displayFlg~createdAt~updatedAt => Entry(id, userId, content, displayFlg, createdAt, updatedAt)
//    }
//  }
//
//  // すべての記事を取得
//  def all(): List[Entry] = DB.withConnection { implicit c =>
//    SQL("select * from entry").as(entry *)
//  }
//
//  // 公開状態の記事を取得
//  def findByDisplayFlg(): List[Entry] = DB.withConnection { implicit c =>
//    SQL("select * from entry where display_flg = 0").as(entry *)
//  }


}
