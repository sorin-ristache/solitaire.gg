package services

import java.util.UUID

import models.queries.AccountQueries._
import org.joda.time.LocalDateTime
import services.database.DatabaseConnection

import scala.util.Random

object AccountService {
  def createAccount(name: String) = DatabaseConnection.transaction {
    DatabaseConnection.execute(CreateAccount(name))
    DatabaseConnection.query(GetAccountByName(name)).getOrElse(throw new IllegalStateException("Invalid account."))
  }

  def searchAccounts(q: String) = DatabaseConnection.query(SearchAccounts(q))

  def getAccount(id: UUID) = DatabaseConnection.query(GetAccount(id))

  def getAccount(map: Map[String, String], fallbackAccount: Option[UUID]) = {
    if (map.get("account").isDefined && map.get("name").isDefined && map.get("role").isDefined) {
      val accountId = UUID.fromString(map("account"))
      (accountId, map("name"), map("role"), false)
    } else {
      fallbackAccount match {
        case Some(acctId) =>
          DatabaseConnection.query(GetAccount(acctId)) match {
            case Some(a) =>
              (a.id, a.name, a.role, true)
            case None =>
              val name = "Guest " + Math.abs(Random.nextInt(100000))
              val a = AccountService.createAccount(name)
              (a.id, a.name, a.role, true)
          }
        case None =>
          val name = "Guest " + Math.abs(Random.nextInt(100000))
          val a = AccountService.createAccount(name)
          (a.id, a.name, a.role, true)
      }
    }
  }

  def updateAccountName(id: UUID, name: String) = DatabaseConnection.transaction {
    DatabaseConnection.execute(UpdateAccountName(id, name)) == 1
  }

  def updateAccountRole(id: UUID, role: String) = DatabaseConnection.transaction {
    DatabaseConnection.execute(UpdateAccountRole(id, role)) == 1
  }

  def incrementAccountGamesPlayed(id: UUID, started: LocalDateTime) = DatabaseConnection.transaction {
    DatabaseConnection.execute(IncrementAccountGamesPlayed(id, started)) == 1
  }

  def removeAccount(id: UUID) = DatabaseConnection.transaction {
    DatabaseConnection.execute(RemoveAccount(id)) == 1
  }
}
