package utils

import models.{ResponseMessage, VersionResponse, Pong, ServerError}
import play.api.libs.json._
import play.api.libs.functional.syntax._

object ResponseMessageSerializers {
  implicit val serverErrorWrites = Json.writes[ServerError]
  implicit val pongWrites = Json.writes[Pong]
  implicit val versionResponseWrites = Json.writes[VersionResponse]

  implicit val responseMessageWrites = Writes[ResponseMessage] { r: ResponseMessage =>
    val json = r match {
      case se: ServerError => serverErrorWrites.writes(se)
      case p: Pong => pongWrites.writes(p)
      case vr: VersionResponse => versionResponseWrites.writes(vr)
    }
    JsObject(Seq("c" -> JsString(r.getClass.getSimpleName), "v" -> json))
  }
}
