/*
 * Project Dwarf
 *
 * Copyright (c) 2017-2021. Elex. All Rights Reserved.
 * https://www.elex-project.com/
 */

package com.elex_project.dwarf;

import org.jetbrains.annotations.Nullable;

/**
 * General object property
 *
 * @author Elex
 */
public final class ObjectProperty<T> extends AbsProperty<T> {
	/**
	 * General object property with initial value, null
	 */
	public ObjectProperty() {
		super(null);
	}

	/**
	 * General object property
	 *
	 * @param value initial value
	 */
	public ObjectProperty(@Nullable final T value) {
		super(value);
	}

	@Override
	public String toString() {
		return (null == get()) ? EMPTY_STRING : get().toString();
	}

}
