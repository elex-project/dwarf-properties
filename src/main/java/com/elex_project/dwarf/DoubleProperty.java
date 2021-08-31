/*
 * Project Dwarf
 *
 * Copyright (c) 2017-2021. Elex. All Rights Reserved.
 * https://www.elex-project.com/
 */

package com.elex_project.dwarf;

import org.jetbrains.annotations.Nullable;

/**
 * Double property
 *
 * @author Elex
 */
public final class DoubleProperty extends NumberProperty<Double> {
	/**
	 * Float property with initial value 0
	 */
	public DoubleProperty() {
		super(0d);
	}

	/**
	 * Double property
	 *
	 * @param value initial value
	 */
	public DoubleProperty(@Nullable final Double value) {
		super(value);
	}

}
