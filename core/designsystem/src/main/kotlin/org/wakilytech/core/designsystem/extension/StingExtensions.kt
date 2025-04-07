package org.wakilytech.core.designsystem.extension

fun String?.isNullOrEmpty(): Boolean {
    return this == null || this.isEmpty()
}