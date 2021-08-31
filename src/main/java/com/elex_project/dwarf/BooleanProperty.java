/*
 * Project Dwarf
 *
 * Copyright (c) 2017-2021. Elex. All Rights Reserved.
 * https://www.elex-project.com/
 */

package com.elex_project.dwarf;

import org.jetbrains.annotations.Nullable;

/**
 * Boolean property
 *
 * @author Elex
 */
public final class BooleanProperty extends AbsProperty<Boolean> {

	/**
	 * Boolean property with initial value ""
	 */
	public BooleanProperty() {
		super(false);
	}

	/**
	 * Boolean property
	 *
	 * @param value initial value
	 */
	public BooleanProperty(@Nullable final Boolean value) {
		super(value);
	}

	@Override
	public String toString() {
		return (null == get()) ? EMPTY_STRING : String.valueOf(get());
	}

	@Override
	public boolean equals(final Object o) {
		if (o instanceof Boolean) {
			return o.equals(get());
		} else {
			return super.equals(o);
		}
	}

	@Override
	protected boolean canEqual(final Object other) {
		if (other instanceof Boolean || other instanceof Property) {
			return true;
		} else {
			return super.canEqual(other);
		}
	}
}
