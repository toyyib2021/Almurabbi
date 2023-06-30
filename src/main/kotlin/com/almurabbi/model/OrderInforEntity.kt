package com.almurabbi.model

import com.almurabbi.model.TotalProductionTable.bindTo
import org.ktorm.entity.Entity
import org.ktorm.schema.Table
import org.ktorm.schema.date
import org.ktorm.schema.int
import org.ktorm.schema.varchar
import org.ktorm.support.mysql.defaultValue
import java.sql.Date
import java.time.LocalDate
import java.util.*


object OrderInforTable: Table<OrderInforEntity>("orderinfor") {
    val productName = varchar("productName").bindTo { it.productName }
    val quantity = int("quantity").bindTo { it.quantity }
    val orderId = int("orderId").bindTo { it.orderId }
    val returned = int("returned").bindTo { it.returned }
    val currentdate = varchar("currentdate").bindTo { it.currentdate }
    val unitPrice = int("unitPrice").bindTo { it.unitPrice }
    val amount = int("amount").bindTo { it.amount }
    val id = int("id").primaryKey().bindTo { it.id }
}

interface OrderInforEntity: Entity<OrderInforEntity>{
    companion object: Entity.Factory<OrderInforEntity>()
    val productName: String
    val quantity: Int
    val orderId: Int
    val returned: Int
    val currentdate: String
    val unitPrice: Int
    val amount: Int
    val id: Int

}
