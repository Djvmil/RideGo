package org.wakilytech.ride_go

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform