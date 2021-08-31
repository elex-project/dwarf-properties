/*
 * Project Dwarf
 *
 * Copyright (c) 2021. Elex. All Rights Reserved.
 * https://www.elex-project.com/
 */

package com.elex_project.dwarf.primitive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrimitiveIntegerPropertyTest {

	@Test
	void test() {
		PrimitiveIntegerProperty integerProperty = new PrimitiveIntegerProperty(10);
		PrimitiveByteProperty byteProperty = new PrimitiveByteProperty();

		assertEquals(10, integerProperty.get());
		assertEquals(0, byteProperty.get());
	}
}
