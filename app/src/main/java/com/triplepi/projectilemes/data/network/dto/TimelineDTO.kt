/**
* MES
* MES API Reference
*
* OpenAPI spec version: v1
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package io.swagger.client.models

import io.swagger.client.models.TimelineDurationForBatchDTO
import io.swagger.client.models.TimelineOrderDTO
import io.swagger.client.models.TimelineProcessDTO
import io.swagger.client.models.TimelineWorkCenterLastOperationDTO

/**
 * 
 * @param Orders 
 * @param Processes 
 * @param Durations 
 * @param WorkCentersLastOperation 
 */
data class TimelineDTO (
    val Orders: kotlin.Array<TimelineOrderDTO>? = null,
    val Processes: kotlin.Array<TimelineProcessDTO>? = null,
    val Durations: kotlin.Array<TimelineDurationForBatchDTO>? = null,
    val WorkCentersLastOperation: kotlin.Array<TimelineWorkCenterLastOperationDTO>? = null
)
