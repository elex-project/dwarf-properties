/*
 * Project Dwarf
 *
 * Copyright (c) 2017-2021. Elex. All Rights Reserved.
 * https://www.elex-project.com/
 */

package com.elex_project.dwarf;

import org.jetbrains.annotations.Nullable;

import java.math.BigInteger;

/**
 * BigInteger property
 *
 * @author Elex
 */
public final class BigIntegerProperty extends NumberProperty<BigInteger> {
	/**
	 * BigInteger property with initial value 0
	 */
	public BigIntegerProperty() {
		super(BigInteger.ZERO);
	}

	/**
	 * BigInteger property
	 *
	 * @param value initial value
	 */
	public BigIntegerProperty(@Nullable final BigInteger value) {
		super(value);
	}

}
