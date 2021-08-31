/*
 * Project Dwarf
 *
 * Copyright (c) 2017-2021. Elex. All Rights Reserved.
 * https://www.elex-project.com/
 */

package com.elex_project.dwarf;

import org.jetbrains.annotations.Nullable;

import java.math.BigDecimal;

/**
 * BigDecimal property
 *
 * @author Elex
 */
public final class BigDecimalProperty extends NumberProperty<BigDecimal> {
	/**
	 * BigDecimal property with initial value 0
	 */
	public BigDecimalProperty() {
		super(BigDecimal.ZERO);
	}

	/**
	 * BigDecimal property
	 *
	 * @param value initial value
	 */
	public BigDecimalProperty(@Nullable final BigDecimal value) {
		super(value);
	}

}
