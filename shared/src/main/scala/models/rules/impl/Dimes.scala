package models.rules.impl

import models.card.Rank
import models.rules._

object Dimes extends GameRules(
  id = "dimes",
  completed = true,
  title = "Dimes",
  like = Some("busyaces"),
  links = Seq(Link("Pretty Good Solitaire", "www.goodsol.com/pgshelp/dimes.htm")),
  layout = "swf|.:t",
  deckOptions = DeckOptions(numDecks = 2, lowRank = Rank.Ten),
  stock = Some(StockRules(maximumDeals = Some(1))),
  waste = Some(WasteRules()),
  foundations = IndexedSeq(FoundationRules(numPiles = 8, autoMoveCards = true)),
  tableaus = IndexedSeq(TableauRules(
    numPiles = 8,
    initialCards = InitialCards.Count(1),
    cardsFaceDown = TableauFaceDownCards.Count(0),
    suitMatchRuleForBuilding = SuitMatchRule.SameSuit,
    suitMatchRuleForMovingStacks = SuitMatchRule.None
  ))
)
