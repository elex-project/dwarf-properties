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
public final class PrimitiveBooleanProperty implements PrimitiveProperty {
	private final List<BooleanPropertyListener> listeners;
	private boolean value;

	public PrimitiveBooleanProperty(final boolean value) {
		this.value = value;
		this.listeners = new ArrayList<>();
	}

	public PrimitiveBooleanProperty() {
		this(true);
	}

	public void set(final boolean value) {
		if (this.value != value) {
			this.value = value;

			for (final BooleanPropertyListener listener : listeners) {
				if (null != listener) listener.onValueChanged(this.value);
			}

		}
	}

	public boolean get() {
		return value;
	}

	public void addListener(final BooleanPropertyListener listener) {
		listeners.add(listener);
	}

	public void removeListener(final BooleanPropertyListener listener) {
		listeners.remove(listener);
	}

	public void removeAllListeners() {
		listeners.clear();
	}
}
