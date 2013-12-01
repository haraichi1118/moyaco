package controllers

import play.api.mvc.{Controller, Action}
import models.Entries

/**
 * Created with IntelliJ IDEA.
 * User: tsuiki
 * Date: 13/12/01
 * Time: 18:16
 * To change this template use File | Settings | File Templates.
 */
object TopsController extends Controller {


  def index = Action {
    Ok(views.html.top(Entries.all()))
  }

  def create = TODO

  def delete = TODO

}
