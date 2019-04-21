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

import io.swagger.client.models.OptimizationCriteriaIM

/**
 * 
 * @param Begin 
 * @param End 
 * @param IncludeItems 
 * @param ExcludeOrders 
 * @param OptimizationCriteria 
 */
data class PlanningSettingsIM (
    val Begin: java.time.LocalDateTime? = null,
    val End: java.time.LocalDateTime? = null,
    val IncludeItems: kotlin.Array<kotlin.Long>? = null,
    val ExcludeOrders: kotlin.Array<kotlin.Long>? = null,
    val OptimizationCriteria: OptimizationCriteriaIM? = null
)
