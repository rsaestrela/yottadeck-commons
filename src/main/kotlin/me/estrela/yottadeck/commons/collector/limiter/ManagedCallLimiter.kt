package me.estrela.yottadeck.commons.collector.limiter


class ManagedCallLimiter(private val maxCalls: Int) : CallLimiter() {

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

}
