package me.estrela.yottadeck.commons.collector

interface Limiter {
    fun keepCalling(): Boolean
}