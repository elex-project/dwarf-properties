/*
 * Project Dwarf
 *
 * Copyright (c) 2021-2021. Elex. All Rights Reserved.
 * https://www.elex-project.com/
 */

package com.elex_project.dwarf;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@Slf4j
class EnumPropertyTest {
	private enum MyEnum {
		ITEM_1, ITEM_2, ITEM_3;
	}

	@Test
	void test() {
		EnumProperty<MyEnum> enumEnumProperty = new EnumProperty<>(MyEnum.ITEM_1);
		enumEnumProperty.addListener((PropertyListener<MyEnum>) (oldValue, newValue)
				-> log.info("{} -> {}", oldValue, newValue));
		enumEnumProperty.set(MyEnum.ITEM_2);

		EnumProperty<MyEnum> enumEnumProperty1 = new EnumProperty<>(MyEnum.ITEM_2);
		EnumProperty<MyEnum> enumEnumProperty2 = new EnumProperty<>(MyEnum.ITEM_3);
		assertEquals(enumEnumProperty, enumEnumProperty1);
		assertNotEquals(enumEnumProperty, enumEnumProperty2);
	}
}
