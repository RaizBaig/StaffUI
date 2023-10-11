package com.example.staffui.domain.models

import com.example.staffui.data.models.StaffModels

data class StaffListModel(
    var staffName : String = "",
    var email : String = "",
    var workingSince :Long = 0L,

)