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

import io.swagger.client.models.ScheduleItemBatchDTO
import io.swagger.client.models.ScheduleItemLeftoverDTO
import io.swagger.client.models.ScheduleItemOperationDTO
import io.swagger.client.models.ScheduleItemWorkCenterDTO

//import com.squareup.moshi.Json
///**
// *
// * @param Id
// * @param Operation
// * @param WorkCenter
// * @param Batch
// * @param StartDate
// * @param StartExecutionDate
// * @param FinishDate
// * @param WorkCenterFinishDate
// * @param Timestamp
// * @param FactStartDate
// * @param FactFinishDate
// * @param FactWorkCenterFinishDate
// * @param FactStartExecutionDate
// * @param PlanCount
// * @param FactCount
// * @param QuarantineCount
// * @param Leftover
// * @param LeftoverSolution
// * @param Status
// */
//data class ScheduleItemDTO (
//    val Id: kotlin.Long? = null,
//    val Operation: ScheduleItemOperationDTO? = null,
//    val WorkCenter: ScheduleItemWorkCenterDTO? = null,
//    val Batch: ScheduleItemBatchDTO? = null,
//    val StartDate: java.time.LocalDateTime? = null,
//    val StartExecutionDate: java.time.LocalDateTime? = null,
//    val FinishDate: java.time.LocalDateTime? = null,
//    val WorkCenterFinishDate: java.time.LocalDateTime? = null,
//    val Timestamp: kotlin.Long? = null,
//    val FactStartDate: java.time.LocalDateTime? = null,
//    val FactFinishDate: java.time.LocalDateTime? = null,
//    val FactWorkCenterFinishDate: java.time.LocalDateTime? = null,
//    val FactStartExecutionDate: java.time.LocalDateTime? = null,
//    val PlanCount: kotlin.Int? = null,
//    val FactCount: kotlin.Int? = null,
//    val QuarantineCount: kotlin.Int? = null,
//    val Leftover: ScheduleItemLeftoverDTO? = null,
//    val LeftoverSolution: ScheduleItemLeftoverDTO? = null,
//    val Status: ScheduleItemDTO.Status? = null
//) {
//
//    /**
//    *
//    * Values: new,started,executionStarted,finished,suspending
//    */
//    enum class Status(val value: kotlin.String){
//
//        @Json(name = "New") new("New"),
//
//        @Json(name = "Started") started("Started"),
//
//        @Json(name = "ExecutionStarted") executionStarted("ExecutionStarted"),
//
//        @Json(name = "Finished") finished("Finished"),
//
//        @Json(name = "Suspending") suspending("Suspending");
//
//    }
//
//}
//