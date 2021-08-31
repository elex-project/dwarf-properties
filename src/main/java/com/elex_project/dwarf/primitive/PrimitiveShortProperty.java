/*
 * Project Dwarf
 *
 * Copyright (c) 2021. Elex. All Rights Reserved.
 * https://www.elex-project.com/
 */

package com.elex_project.dwarf.primitive;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public final class PrimitiveShortProperty implements PrimitiveProperty {
	private final List<ShortPropertyListener> listeners;
	private short value;

	public PrimitiveShortProperty(final short value) {
		this.value = value;
		this.listeners = new ArrayList<>();
	}

	public PrimitiveShortProperty() {
		this((short) 0);
	}

	public void set(final short value) {
		if (this.value != value) {
			final short oldValue = this.value;
			this.value = value;

			for (final ShortPropertyListener listener : listeners) {
				if (null != listener) listener.onValueChanged(oldValue, this.value);
			}

		}
	}

	public short get() {
		return value;
	}

	public void addListener(final ShortPropertyListener listener) {
		listeners.add(listener);
	}

	public void removeListener(final ShortPropertyListener listener) {
		listeners.remove(listener);
	}

	public void removeAllListeners() {
		listeners.clear();
	}
}
