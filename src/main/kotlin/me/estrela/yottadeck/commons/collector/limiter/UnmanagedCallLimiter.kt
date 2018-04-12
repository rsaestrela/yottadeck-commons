package me.estrela.yottadeck.commons.collector.limiter


class UnmanagedCallLimiter(private val maxCalls: Int) : CallLimiter() {

    @Synchronized
    override fun keepCalling(): Boolean {
        return calls.toInt() <= maxCalls
    }

}
