package services.sandbox

import utils.Application

import scala.concurrent.Future

trait ScreenshotCreatorLogic {
  def call(ctx: Application) = {
    val ret = screenshots.ScreenshotCreator.processAll()
    // val ret = screenshots.ScreenshotCreator.processRules("klondike")
    Future.successful(ret)
  }
}
