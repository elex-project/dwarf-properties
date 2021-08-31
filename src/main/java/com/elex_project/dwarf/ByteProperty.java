/*
 * Project Dwarf
 *
 * Copyright (c) 2017-2021. Elex. All Rights Reserved.
 * https://www.elex-project.com/
 */

package com.elex_project.dwarf;

import org.jetbrains.annotations.Nullable;

/**
 * Byte property
 *
 * @author Elex
 */
public final class ByteProperty extends NumberProperty<Byte> {
	/**
	 * Byte property with initial value 0
	 */
	public ByteProperty() {
		super((byte) 0);
	}

	/**
	 * Byte property
	 *
	 * @param value initial value
	 */
	public ByteProperty(@Nullable final Byte value) {
		super(value);
	}

}
