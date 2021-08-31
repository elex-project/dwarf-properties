/*
 * Project Dwarf
 *
 * Copyright (c) 2017-2021. Elex. All Rights Reserved.
 * https://www.elex-project.com/
 */

package com.elex_project.dwarf;

import org.jetbrains.annotations.Nullable;

/**
 * Character property
 *
 * @author Elex
 */
public final class CharacterProperty extends AbsProperty<Character> {

	/**
	 * Character property with initial value ' '
	 */
	public CharacterProperty() {
		super(' ');
	}

	/**
	 * Character property
	 *
	 * @param value initial value
	 */
	public CharacterProperty(@Nullable final Character value) {
		super(value);
	}

	@Override
	public String toString() {
		return (null == get()) ? EMPTY_STRING : get().toString();
	}

	@Override
	public boolean equals(final Object o) {
		if (o instanceof Character) {
			return o.equals(get());
		} else {
			return super.equals(o);
		}
	}

	@Override
	protected boolean canEqual(final Object other) {
		if (other instanceof Character || other instanceof Property) {
			return true;
		} else {
			return super.canEqual(other);
		}
	}
}
