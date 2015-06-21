package models.user

import java.util.UUID

import org.joda.time.LocalDateTime

object UserFeedback {
  case class FeedbackNote(
    id: UUID,
    feedbackId: UUID,
    authorId: UUID,
    content: String,
    occurred: LocalDateTime
  )
}

case class UserFeedback(
  id: UUID,
  userId: UUID,
  activeGameId: Option[UUID],
  feedback: String,
  occurred: LocalDateTime
)
