package org.wakilytech.ride_go

class JVMPlatform: Platform {
    override val name: String = "Java ${System.getProperty("kotlin.version")}"
}

actual fun getPlatform(): Platform = JVMPlatform()