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

import com.triplepi.projectilemes.data.network.dto.AdjustmentDTO

/**
 * 
 * @param Id 
 * @param Order 
 * @param Adjustments 
 * @param OperationModes 
 */
data class TechnologicalOperationDTO (
    val Id: kotlin.Long? = null,
    val Order: kotlin.Int? = null,
    val Adjustments: kotlin.Array<AdjustmentDTO>? = null,
    val OperationModes: kotlin.Array<OperationModeDTO>? = null
)

