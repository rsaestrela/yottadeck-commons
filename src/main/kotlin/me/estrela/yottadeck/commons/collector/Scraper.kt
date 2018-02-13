package me.estrela.yottadeck.commons.collector

import org.jsoup.nodes.Document


interface Scraper {
    fun scrap(url: String): Document
}
