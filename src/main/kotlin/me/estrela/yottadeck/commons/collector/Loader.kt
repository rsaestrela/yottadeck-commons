package me.estrela.yottadeck.commons.collector


interface Loader<in I, out L> {
    fun load(input: I): L
}
