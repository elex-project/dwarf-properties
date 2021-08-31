/*
 * Project Dwarf
 *
 * Copyright (c) 2017-2021. Elex. All Rights Reserved.
 * https://www.elex-project.com/
 */

package com.elex_project.dwarf;

import org.jetbrains.annotations.Nullable;

/**
 * String property
 *
 * @author Elex
 */
public final class StringProperty extends AbsProperty<String> {

	/**
	 * String property with initial value ""
	 */
	public StringProperty() {
		super(EMPTY_STRING);
	}

	/**
	 * String property
	 *
	 * @param value initial value
	 */
	public StringProperty(@Nullable final String value) {
		super(value);
	}

	@Override
	public String toString() {
		return (null == get()) ? EMPTY_STRING : get();
	}

	@Override
	public boolean equals(final Object o) {
		if (o instanceof String) {
			return o.equals(get());
		} else {
			return super.equals(o);
		}
	}

	@Override
	protected boolean canEqual(final Object other) {
		if (other instanceof String || other instanceof Property) {
			return true;
		} else {
			return super.canEqual(other);
		}
	}
}
