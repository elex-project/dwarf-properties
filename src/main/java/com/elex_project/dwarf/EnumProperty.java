/*
 * Project Dwarf
 *
 * Copyright (c) 2017-2021. Elex. All Rights Reserved.
 * https://www.elex-project.com/
 */

package com.elex_project.dwarf;

import org.jetbrains.annotations.Nullable;

/**
 * Enum property
 *
 * @author Elex
 */
public final class EnumProperty<T extends Enum<?>> extends AbsProperty<T> {
	/**
	 * Enum property
	 *
	 * @param value initial value
	 */
	public EnumProperty(@Nullable final T value) {
		super(value);
	}

	@Override
	public String toString() {
		return (null == get()) ? EMPTY_STRING : get().toString();
	}
}
