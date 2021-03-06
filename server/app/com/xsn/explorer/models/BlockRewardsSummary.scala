package com.xsn.explorer.models

import play.api.libs.json.{Json, Writes}
import scala.math.BigDecimal.RoundingMode

case class BlockRewardsSummary(
    averageReward: BigDecimal,
    averageInput: BigDecimal,
    medianInput: BigDecimal,
    averagePoSInput: BigDecimal,
    averageTPoSInput: BigDecimal,
    medianWaitTime: BigDecimal,
    averageWaitTime: BigDecimal
)

object BlockRewardsSummary {
  implicit val writes: Writes[BlockRewardsSummary] = (summary: BlockRewardsSummary) =>
    Json.obj(
      "averageReward" -> summary.averageReward.setScale(8, RoundingMode.HALF_UP),
      "averageInput" -> summary.averageInput.setScale(8, RoundingMode.HALF_UP),
      "medianInput" -> summary.medianInput.setScale(8, RoundingMode.HALF_UP),
      "averagePoSInput" -> summary.averagePoSInput.setScale(8, RoundingMode.HALF_UP),
      "averageTPoSInput" -> summary.averageTPoSInput.setScale(8, RoundingMode.HALF_UP),
      "medianWaitTime" -> summary.medianWaitTime.setScale(8, RoundingMode.HALF_UP),
      "averageWaitTime" -> summary.averageWaitTime.setScale(8, RoundingMode.HALF_UP)
    )
}
