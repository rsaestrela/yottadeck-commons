package me.estrela.yottadeck.commons.collector.client


import me.estrela.yottadeck.commons.collector.Scraper
import org.jsoup.nodes.Document
import org.springframework.stereotype.Component

@Component
class JSoupNoMimeDocumentScraper : Scraper {
    override fun scrap(url: String): Document {
        //todo
        return Document("")
    }
}
