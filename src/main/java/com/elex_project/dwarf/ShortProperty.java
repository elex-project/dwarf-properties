/*
 * Project Dwarf
 *
 * Copyright (c) 2017-2021. Elex. All Rights Reserved.
 * https://www.elex-project.com/
 */

package com.elex_project.dwarf;

import org.jetbrains.annotations.Nullable;

/**
 * Short property
 *
 * @author Elex
 */
public final class ShortProperty extends NumberProperty<Short> {
	/**
	 * Short property with initial value 0
	 */
	public ShortProperty() {
		super((short) 0);
	}

	/**
	 * Short property
	 *
	 * @param value initial value
	 */
	public ShortProperty(@Nullable final Short value) {
		super(value);
	}

}
