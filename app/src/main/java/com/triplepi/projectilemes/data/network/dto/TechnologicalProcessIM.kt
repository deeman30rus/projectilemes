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

import io.swagger.client.models.TechnologicalOperationIM

/**
 * 
 * @param Id 
 * @param Name 
 * @param Kit 
 * @param Operations 
 */
data class TechnologicalProcessIM (
    val Id: kotlin.Long? = null,
    val Name: kotlin.String? = null,
    val Kit: kotlin.Int? = null,
    val Operations: kotlin.Array<TechnologicalOperationIM>? = null
)

