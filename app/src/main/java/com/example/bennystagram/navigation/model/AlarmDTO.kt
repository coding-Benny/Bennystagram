package com.example.bennystagram.navigation.model

data class AlarmDTO(
    var destinationUid : String? = null,
    var userId : String? = null,
    var uid : String? = null,
    // 0 : like, 1 : comment, 2 : follow alarm
    var kind : Int? = null,
    var message : String? = null,
    var timestamp : Long? = null
)