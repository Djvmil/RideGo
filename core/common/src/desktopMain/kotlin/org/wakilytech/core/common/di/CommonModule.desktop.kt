package org.wakilytech.core.common.di

import kotlinx.coroutines.Dispatchers

actual fun provideIoDispatcher() = Dispatchers.Default