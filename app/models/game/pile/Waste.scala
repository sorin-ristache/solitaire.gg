package models.game.pile

import models.game.pile.actions.SelectCardActions
import models.game.pile.constraints.{DragFromConstraints, SelectCardConstraints}

object Waste {
  private val defaultOptions = PileOptions(
    cardsShown = Some(3),
    direction = Some("r"),
    selectCardConstraint = Some(SelectCardConstraints.topCardOnly),
    dragFromConstraint = Some(DragFromConstraints.topCardOnly),
    selectCardAction = Some(SelectCardActions.klondike)
  )
}

class Waste(id: String, options: PileOptions = PileOptions.empty) extends Pile(id, "waste", Waste.defaultOptions.combine(options))