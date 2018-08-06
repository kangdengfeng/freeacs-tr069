package com.github.freeacs.dao.unitType

final case class UnitType(
  unitTypeId: Option[Long] = None,
  unitTypeName: String,
  matcherId: Option[String] = None,
  vendorName: Option[String] = None,
  description: Option[String] = None,
  protocol: String
)