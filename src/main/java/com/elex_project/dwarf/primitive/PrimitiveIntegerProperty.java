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
public final class PrimitiveIntegerProperty implements PrimitiveProperty {
	private final List<IntegerPropertyListener> listeners;
	private int value;

	public PrimitiveIntegerProperty(final int value) {
		this.value = value;
		this.listeners = new ArrayList<>();
	}

	public PrimitiveIntegerProperty() {
		this(0);
	}

	public void set(final int value) {
		if (this.value != value) {
			final int oldValue = this.value;
			this.value = value;

			for (final IntegerPropertyListener listener : listeners) {
				if (null != listener) listener.onValueChanged(oldValue, this.value);
			}

		}
	}

	public int get() {
		return value;
	}

	public void addListener(final IntegerPropertyListener listener) {
		listeners.add(listener);
	}

	public void removeListener(final IntegerPropertyListener listener) {
		listeners.remove(listener);
	}

	public void removeAllListeners() {
		listeners.clear();
	}
}
