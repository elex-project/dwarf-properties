/*
 * Project Dwarf
 *
 * Copyright (c) 2017-2021. Elex. All Rights Reserved.
 * https://www.elex-project.com/
 */

package com.elex_project.dwarf;

import org.jetbrains.annotations.Nullable;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * LocalDate property
 *
 * @author Elex
 */
public final class LocalTimeProperty extends AbsProperty<LocalTime> {
	/**
	 * LocalDate property with initial value, today.
	 */
	public LocalTimeProperty() {
		super(LocalTime.now());
	}

	/**
	 * LocalDate property
	 *
	 * @param value
	 */
	public LocalTimeProperty(@Nullable final LocalTime value) {
		super(value);
	}

	@Override
	public boolean equals(final Object o) {
		if (o instanceof LocalTime) {
			return o.equals(get());
		} else {
			return super.equals(o);
		}
	}

	@Override
	protected boolean canEqual(final Object other) {
		if (other instanceof LocalTime || other instanceof LocalTimeProperty) {
			return true;
		} else {
			return super.canEqual(other);
		}
	}

	@Override
	public String toString() {
		return (null == get()) ? EMPTY_STRING : get().format(DateTimeFormatter.ISO_LOCAL_TIME);
	}
}
