package com.ashburnere.springbootcrud;

import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

/**
 * Service to load an YAML file on startup.
 * 
 * @author Erik
 *
 */
@Service
public class LoadConfigFromYAMLService {

	private final ConcurrentHashMap<String, BookStoreList> data = new ConcurrentHashMap<String, BookStoreList>();

	@PostConstruct
	public void loadData() {

		Yaml yaml = new Yaml(new Constructor(BookStoreList.class));
		InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("BookStoreEntities.yml");
		BookStoreList obj = yaml.load(inputStream);
		System.out.println(obj);
		data.put("BookStoreEntities", obj);
	}

	public BookStoreList getData() {
		return data.get("BookStoreEntities");
	}
}
