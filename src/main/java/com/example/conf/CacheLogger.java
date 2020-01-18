package com.example.conf;

import org.ehcache.event.CacheEvent;
import org.ehcache.event.CacheEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CacheLogger implements CacheEventListener<Object, Object> {

	private final Logger LOG = (Logger) LoggerFactory.getLogger(CacheLogger.class);
	
	@Override
	public void onEvent(CacheEvent<? extends Object, ? extends Object> event) {
		LOG.info("Key: {} | EventType: {} | Old value: {} | New value: {}", 
				event.getKey(), event.getType(), event.getOldValue(), event.getNewValue());
	}
	
	
}
