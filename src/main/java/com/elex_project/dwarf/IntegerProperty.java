/*
 * Project Dwarf
 *
 * Copyright (c) 2017-2021. Elex. All Rights Reserved.
 * https://www.elex-project.com/
 */

package com.elex_project.dwarf;

import org.jetbrains.annotations.Nullable;

/**
 * Integer property
 *
 * @author Elex
 */
public final class IntegerProperty extends NumberProperty<Integer> {
	/**
	 * Integer property with initial value 0
	 */
	public IntegerProperty() {
		super(0);
	}

	/**
	 * Integer property
	 *
	 * @param value initial value
	 */
	public IntegerProperty(@Nullable final Integer value) {
		super(value);
	}

}
