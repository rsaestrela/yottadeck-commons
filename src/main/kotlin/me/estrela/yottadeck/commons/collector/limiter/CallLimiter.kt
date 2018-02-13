package me.estrela.yottadeck.commons.collector.limiter


import me.estrela.yottadeck.commons.collector.Limiter
import org.slf4j.LoggerFactory
import java.util.concurrent.atomic.AtomicInteger

class CallLimiter(private val maxCalls: Int) : Limiter {

    private val logger = LoggerFactory.getLogger(CallLimiter::class.java)

    private var calls = AtomicInteger(0)

    @Synchronized
    override fun keepCalling(): Boolean {
        return if (calls.toInt() >= maxCalls) {
            resetCounter()
            logger.info("operation=keepCalling msg='max calls reached'")
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
