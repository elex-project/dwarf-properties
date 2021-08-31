/*
 * Project Dwarf
 *
 * Copyright (c) 2021-2021. Elex. All Rights Reserved.
 * https://www.elex-project.com/
 */

package com.elex_project.dwarf;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class StringPropertyTest {

	@Test
	void test1(){
		StringProperty property = new StringProperty();
		PropertyListener<String> listener = new PropertyListener<String>() {
			@Override
			public void onValueChanged(final String oldValue, final String newValue) {
				log.info("{} -> {}", oldValue, newValue);
			}
		};
		property.addListener(listener);

		property.set("Hello");

		assertEquals("Hello", property.get());

		System.out.println(property);
	}

	@Test
	void test2(){
		StringProperty property = new StringProperty("Hello");
		StringProperty property1 = new StringProperty("Hello");
		StringProperty property2 = new StringProperty("Hello~");

		assertEquals(property, property1);
		assertEquals(property, "Hello");

		assertNotEquals(property, property2);
		assertNotEquals("Hello", property2);
	}
}
