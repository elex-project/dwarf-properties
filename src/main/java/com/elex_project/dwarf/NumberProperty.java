/*
 * Project Dwarf
 *
 * Copyright (c) 2017-2021. Elex. All Rights Reserved.
 * https://www.elex-project.com/
 */

package com.elex_project.dwarf;

import org.jetbrains.annotations.Nullable;

/**
 * Number property
 *
 * @param <T> number
 */
abstract class NumberProperty<T extends Number> extends AbsProperty<T> {

	/**
	 * Number property
	 *
	 * @param value initial value
	 */
	public NumberProperty(@Nullable final T value) {
		super(value);
	}

	@Override
	public String toString() {
		return (null == get()) ? EMPTY_STRING : String.valueOf(get());
	}

	@Override
	public boolean equals(final Object o) {
		if (o instanceof Number) {
			return o.equals(this.get());
		} else if (o instanceof NumberProperty
				&& null != ((NumberProperty<?>) o).get()) {
			return ((NumberProperty<?>) o).get().equals(this.get());
		} else {
			return super.equals(o);

		}
	}

	@Override
	protected boolean canEqual(final Object other) {
		if (other instanceof Number || other instanceof Property) {
			return true;
		} else {
			return super.canEqual(other);
		}
	}
}
