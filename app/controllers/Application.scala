package controllers

import play.api.mvc._

import models.Task
import play.api.data.Form
import play.api.data.Forms._
import org.slf4j._
import play.api.Logger

object Application extends Controller {

  val taskForm = Form("label" -> nonEmptyText)

  private val logger = Logger(Application.getClass())

  def index = Action {
    println("---------------- index ----------------")
    Redirect(routes.Application.tasks)
  }

  def tasks = Action {
    println("---------------- tasks ----------------")
    Ok(views.html.index(Task.all(), taskForm))
  }

//  def newTask = TODO
  def newTask = Action { implicit request =>
    taskForm.bindFromRequest.fold(
      errors => BadRequest(views.html.index(Task.all(), errors)),
      label => {
        println("---------------- Task.create ----------------")
        Task.create(label)
        Redirect(routes.Application.tasks)
      }
    )
  }

  def deleteTask(id: Long) = Action {
    Task.delete(id)
    Redirect(routes.Application.tasks)
  }

}