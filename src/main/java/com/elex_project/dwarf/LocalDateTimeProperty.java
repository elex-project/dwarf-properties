/*
 * Project Dwarf
 *
 * Copyright (c) 2017-2021. Elex. All Rights Reserved.
 * https://www.elex-project.com/
 */

package com.elex_project.dwarf;

import org.jetbrains.annotations.Nullable;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * LocalDateTime property
 *
 * @author Elex
 */
public final class LocalDateTimeProperty extends AbsProperty<LocalDateTime> {
	/**
	 * LocalDate property with initial value, today.
	 */
	public LocalDateTimeProperty() {
		super(LocalDateTime.now());
	}

	/**
	 * LocalDate property
	 *
	 * @param value
	 */
	public LocalDateTimeProperty(@Nullable final LocalDateTime value) {
		super(value);
	}

	@Override
	public boolean equals(final Object o) {
		if (o instanceof LocalDateTime) {
			return o.equals(get());
		} else {
			return super.equals(o);
		}
	}

	@Override
	protected boolean canEqual(final Object other) {
		if (other instanceof LocalDateTime || other instanceof LocalDateTimeProperty) {
			return true;
		} else {
			return super.canEqual(other);
		}
	}

	@Override
	public String toString() {
		return (null == get()) ? EMPTY_STRING : get().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
	}
}
