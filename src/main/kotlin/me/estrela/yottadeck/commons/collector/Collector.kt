package me.estrela.yottadeck.commons.collector


import me.estrela.yottadeck.commons.domain.Track

interface Collector {
    fun collect(): List<Track>
}
