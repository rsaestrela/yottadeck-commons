package me.estrela.yottadeck.commons.collector.limiter


import me.estrela.yottadeck.commons.collector.Limiter
import java.util.concurrent.atomic.AtomicInteger

class CallLimiter(private val maxCalls: Int) : Limiter {

    private var calls = AtomicInteger(0)

    @Synchronized
    override fun keepCalling(): Boolean {
        return if (calls.toInt() >= maxCalls) {
            resetCounter()
            false
        } else {
            increment()
            true
        }
    }

    private fun resetCounter() {
        calls.set(0)
    }

    private fun increment() {
        calls.incrementAndGet()
    }
}
