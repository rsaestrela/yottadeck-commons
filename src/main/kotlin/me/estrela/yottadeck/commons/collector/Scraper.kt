package me.estrela.yottadeck.commons.collector

import org.jsoup.nodes.Document


interface Scraper {

    val userAgent: String get() = "Mozilla"
    val timeout: Int get() = 5000

    fun scrap(url: String): Document
}
