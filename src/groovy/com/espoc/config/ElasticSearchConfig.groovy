package groovy.com.espoc.config

import grails.util.Holders
import org.elasticsearch.client.transport.TransportClient
import org.elasticsearch.common.settings.ImmutableSettings
import org.elasticsearch.common.transport.InetSocketTransportAddress
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.elasticsearch.core.ElasticsearchOperations
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories

@Configuration
@EnableElasticsearchRepositories(basePackages = ["com.as.core.repositories"])
class ElasticSearchConfig {

    @Bean
    ElasticsearchOperations elasticsearchTemplate() {
        return new ElasticsearchTemplate(new TransportClient(ImmutableSettings.settingsBuilder()
                .put("cluster.name", Holders.config.grails.elasticsearch.clusterName as String).build()).addTransportAddress(
                new InetSocketTransportAddress(
                        Holders.config.grails.elasticsearch.transportClientIP as String,
                        Holders.config.grails.elasticsearch.transportClientPort as Integer
                )
        ))
    }
}
