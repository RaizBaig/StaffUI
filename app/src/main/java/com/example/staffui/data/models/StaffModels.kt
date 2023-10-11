package com.example.staffui.data.models

import com.example.staffui.domain.models.StaffListModel

data class StaffModels(
    var staffName: String = "",
    var email:String = "",
    var number:Long =0L,
    var receiptManagement :ReceiptManagement,
    var salesCounterPermissions: SalesCounterPermissions,
    val itemOrInventoryManagement: ItemOrInventoryManagement,
    val staffAndAttendance: StaffAndAttendance

){
    fun staffModel(): StaffListModel {
        return StaffListModel(
            staffName = staffName,
            email = email
        )
    }
}

data class ReceiptManagement(
    var createReceipt:Boolean = false,
    var viewAllReceipts:Boolean = false,
    var editReceipts:Boolean = false,
    var returnReceipts:Boolean = false,
    var admin:Boolean = false
)
data class SalesCounterPermissions(
    var discount:Boolean = false,
    var gift:Boolean = false,
    var free:Boolean = false,
    var addCharges:Boolean = false,
    var addTax:Boolean = false,
    var giveCredit:Boolean = false,
    var viewAllRunningTables:Boolean = false
)
data class ItemOrInventoryManagement(
    var viewOnly:Boolean = false,
    var create:Boolean = false,
    var edit:Boolean = false,
    var admin:Boolean = false
)
data class StaffAndAttendance(
    var attendence:Boolean = false,
    var payrollManager:Boolean = false,
    var manageStaff:Boolean = false,
    var admin:Boolean = false
)
