package com.hmc.searchmanager.modules.job.config;
/*
import java.util.Arrays;
import java.util.UUID;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.elasticsearch.client.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.NodeClientFactoryBean;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.geo.GeoPoint;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

import com.hmc.searchmanager.modules.job.documents.Conference;
import com.hmc.searchmanager.modules.job.repository.ConferenceRepository;

@Configuration
@EnableElasticsearchRepositories
class ApplicationConfiguration {

	@Autowired 
	ElasticsearchOperations operations;
	
	@Autowired 
	ConferenceRepository repository;

	@Bean
	public NodeClientFactoryBean client() {

		NodeClientFactoryBean bean = new NodeClientFactoryBean(true);
		bean.setClusterName(UUID.randomUUID().toString());
		bean.setEnableHttp(false);
		bean.setPathData("E:\\es\\data");
		bean.setPathHome("E:\\es\\home");

		return bean;
	}

	@Bean
	public ElasticsearchTemplate elasticsearchTemplate(Client client) throws Exception {
		return new ElasticsearchTemplate(client);
	}

	@PreDestroy
	public void deleteIndex() {
		operations.deleteIndex(Conference.class);
	}

	@PostConstruct
	public void insertDataSample() {

		// Remove all documents
		repository.deleteAll();
		operations.refresh(Conference.class);

		// Save data sample
		repository.save(Conference.builder().date("2014-11-06").name("Spring eXchange 2014 - London")
				.keywords(Arrays.asList("java", "spring")).location(new GeoPoint(51.500152D, -0.126236D)).build());
		repository.save(Conference.builder().date("2014-12-07").name("Scala eXchange 2014 - London")
				.keywords(Arrays.asList("scala", "play", "java")).location(new GeoPoint(51.500152D, -0.126236D)).build());
		repository.save(Conference.builder().date("2014-11-20").name("Elasticsearch 2014 - Berlin")
				.keywords(Arrays.asList("java", "elasticsearch", "kibana")).location(new GeoPoint(52.5234051D, 13.4113999))
				.build());
		repository.save(Conference.builder().date("2014-11-12").name("AWS London 2014")
				.keywords(Arrays.asList("cloud", "aws")).location(new GeoPoint(51.500152D, -0.126236D)).build());
		repository.save(Conference.builder().date("2014-10-04").name("JDD14 - Cracow")
				.keywords(Arrays.asList("java", "spring")).location(new GeoPoint(50.0646501D, 19.9449799)).build());
	}
}
*/