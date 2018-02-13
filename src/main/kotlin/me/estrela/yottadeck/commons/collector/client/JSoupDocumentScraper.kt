package me.estrela.yottadeck.commons.collector.client


import me.estrela.yottadeck.commons.collector.Scraper
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.springframework.stereotype.Component

@Component
class JSoupDocumentScraper : Scraper {
    override fun scrap(url: String): Document {
        return Jsoup.connect(url).userAgent("Mozilla").timeout(5000).get()
    }
}
