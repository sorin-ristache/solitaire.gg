package models

import java.util.UUID

import models.card.Card
import models.game.PossibleMove
import models.user.UserStatistics

sealed trait ResponseMessage
sealed trait ReversibleResponseMessage extends ResponseMessage

case class ServerError(reason: String, content: String) extends ResponseMessage
case class Notification(recipient: Option[UUID], message: String) extends ResponseMessage

case class GameResult(moves: Int, undos: Int, redos: Int, score: Int, durationSeconds: Int, leaderboardRanking: Int)
case class GameLost(id: UUID, rules: String, seed: Int, result: GameResult, stats: UserStatistics) extends ResponseMessage
case class GameWon(
  id: UUID, rules: String, seed: Int, firstForRules: Boolean, firstForSeed: Boolean, result: GameResult, stats: UserStatistics
) extends ResponseMessage

case class PossibleMoves(moves: Seq[PossibleMove], undosAvailable: Int, redosAvailable: Int) extends ResponseMessage

case class CardRevealed(card: Card) extends ReversibleResponseMessage
case class CardHidden(id: Int) extends ReversibleResponseMessage

case class CardMoveCancelled(cards: Seq[Int], source: String) extends ResponseMessage
case class CardsMoved(cards: Seq[Int], source: String, target: String, turn: Option[Boolean] = None) extends ReversibleResponseMessage

case class MessageSet(messages: Seq[ResponseMessage]) extends ReversibleResponseMessage
