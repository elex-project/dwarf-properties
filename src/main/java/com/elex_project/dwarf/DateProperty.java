/*
 * Project Dwarf
 *
 * Copyright (c) 2017-2021. Elex. All Rights Reserved.
 * https://www.elex-project.com/
 */

package com.elex_project.dwarf;

import org.jetbrains.annotations.Nullable;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Date property
 *
 * @author Elex
 */
public final class DateProperty extends AbsProperty<Date> {
	private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

	/**
	 * LocalDate property with initial value, today.
	 */
	public DateProperty() {
		super(new Date());
	}

	/**
	 * LocalDate property
	 *
	 * @param value
	 */
	public DateProperty(@Nullable final Date value) {
		super(value);
	}

	@Override
	public boolean equals(final Object o) {
		if (o instanceof Date) {
			return o.equals(get());
		} else {
			return super.equals(o);
		}
	}

	@Override
	protected boolean canEqual(final Object other) {
		if (other instanceof Date || other instanceof DateProperty) {
			return true;
		} else {
			return super.canEqual(other);
		}
	}

	@Override
	public String toString() {
		return (null == get()) ? EMPTY_STRING
				: DATE_FORMAT.format(get());
	}
}
