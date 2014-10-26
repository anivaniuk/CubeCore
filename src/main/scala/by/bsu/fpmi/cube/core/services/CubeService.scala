package by.bsu.fpmi.cube.core.services

import by.bsu.fpmi.cube.core.models.data.{FactEntry, DimensionEntry}
import by.bsu.fpmi.cube.core.models.filters.DiscreteFilter
import by.bsu.fpmi.cube.core.models.types.{TableType, FactType, DimensionType}
import by.bsu.fpmi.cube.core.sources.SqlSource

object CubeService {

  def getData(filters: Seq[(DimensionType, DiscreteFilter)]): Map[Seq[DimensionEntry], FactEntry] = {
    SqlSource.readFacts(filters)
  }

  def getDimensionValues(tableType: DimensionType): Seq[DimensionEntry] = ???

  def getDimensionTypes: Seq[DimensionType] = ???
  def getFactType: FactType = ???

}
