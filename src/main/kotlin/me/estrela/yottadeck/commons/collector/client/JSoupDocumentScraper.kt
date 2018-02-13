package me.estrela.yottadeck.commons.collector.client


import me.estrela.yottadeck.commons.collector.Scraper
import me.estrela.yottadeck.commons.collector.exception.ScraperException
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component

@Component
class JSoupDocumentScraper : Scraper {

    private val logger = LoggerFactory.getLogger(JSoupDocumentScraper::class.java)

    override fun scrap(url: String): Document {
        try {
            return Jsoup.connect(url).userAgent(userAgent).timeout(timeout).get()
        } catch (e: Exception) {
            throw ScraperException("operation=apply msg='failed to get document url=$url ex=${e.message}")
        }
    }

}
