/*
 * Project Dwarf
 *
 * Copyright (c) 2021-2021. Elex. All Rights Reserved.
 * https://www.elex-project.com/
 */

package com.elex_project.dwarf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerPropertyTest {

	@Test
	void test(){
		IntegerProperty integerProperty = new IntegerProperty(100);
		ShortProperty shortProperty = new ShortProperty((short)100);

		assertEquals(integerProperty.get(), shortProperty.get());
	}
}
