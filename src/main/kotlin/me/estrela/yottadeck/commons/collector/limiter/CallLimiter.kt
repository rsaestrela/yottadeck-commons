package me.estrela.yottadeck.commons.collector.limiter

import me.estrela.yottadeck.commons.collector.Limiter
import java.util.concurrent.atomic.AtomicInteger

abstract class CallLimiter : Limiter {

    protected var calls = AtomicInteger(0)

    fun resetCounter() {
        calls.set(0)
    }

    fun increment() {
        calls.incrementAndGet()
    }

}
