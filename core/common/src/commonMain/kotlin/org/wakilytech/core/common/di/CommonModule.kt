package org.wakilytech.core.common.di

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import org.koin.core.module.dsl.withOptions
import org.koin.core.qualifier.named
import org.koin.dsl.module

val commonModule = module {
    single { provideIoDispatcher() } withOptions {
        named(RideGoDispatchers.IO)
    }

    single { provideDefaultDispatcher() } withOptions {
        named(RideGoDispatchers.Default)
    }

    single {
        provideApplicationScope(
            get(named(RideGoDispatchers.Default))
        )
    }

}

expect fun provideIoDispatcher(): CoroutineDispatcher
fun provideDefaultDispatcher() = Dispatchers.Default
fun provideApplicationScope(dispatcher: CoroutineDispatcher): CoroutineScope =
    CoroutineScope(SupervisorJob() + dispatcher)


enum class RideGoDispatchers {
    IO, Default
}