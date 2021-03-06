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
package com.triplepi.projectilemes.data.network.dto

import com.triplepi.projectilemes.data.network.dto.BatchIM

/**
 * 
 * @param Id 
 * @param Quantity 
 * @param Number 
 * @param Start 
 * @param Deadline 
 * @param ProcessId 
 * @param Priority 
 * @param Batches 
 */
data class OrderIM (
    val Id: kotlin.Long? = null,
    val Quantity: kotlin.Int? = null,
    val Number: kotlin.String? = null,
    val Start: java.time.LocalDateTime? = null,
    val Deadline: java.time.LocalDateTime? = null,
    val ProcessId: kotlin.Long? = null,
    val Priority: kotlin.Int? = null,
    val Batches: kotlin.Array<BatchIM>? = null
)

