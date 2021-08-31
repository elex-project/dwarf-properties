/*
 * Project Dwarf
 *
 * Copyright (c) 2017-2021. Elex. All Rights Reserved.
 * https://www.elex-project.com/
 */

package com.elex_project.dwarf;

import org.jetbrains.annotations.Nullable;

/**
 * Long property
 *
 * @author Elex
 */
public final class LongProperty extends NumberProperty<Long> {
	/**
	 * Long property with initial value 0
	 */
	public LongProperty() {
		super(0L);
	}

	/**
	 * Long property
	 *
	 * @param value initial value
	 */
	public LongProperty(@Nullable final Long value) {
		super(value);
	}


}
