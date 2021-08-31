/*
 * Project Dwarf
 *
 * Copyright (c) 2017-2021. Elex. All Rights Reserved.
 * https://www.elex-project.com/
 */

package com.elex_project.dwarf;

import org.jetbrains.annotations.Nullable;

/**
 * Float property
 *
 * @author Elex
 */
public final class FloatProperty extends NumberProperty<Float> {
	/**
	 * Float property with initial value 0
	 */
	public FloatProperty() {
		super(0f);
	}

	/**
	 * Float property
	 *
	 * @param value initial value
	 */
	public FloatProperty(@Nullable final Float value) {
		super(value);
	}

}
