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
public final class PrimitiveLongProperty implements PrimitiveProperty {
	private final List<LongPropertyListener> listeners;
	private long value;

	public PrimitiveLongProperty(final long value) {
		this.value = value;
		this.listeners = new ArrayList<>();
	}

	public PrimitiveLongProperty() {
		this(0L);
	}

	public void set(final long value) {
		if (this.value != value) {
			final long oldValue = this.value;
			this.value = value;

			for (final LongPropertyListener listener : listeners) {
				if (null != listener) listener.onValueChanged(oldValue, this.value);
			}

		}
	}

	public long get() {
		return value;
	}

	public void addListener(final LongPropertyListener listener) {
		listeners.add(listener);
	}

	public void removeListener(final LongPropertyListener listener) {
		listeners.remove(listener);
	}

	public void removeAllListeners() {
		listeners.clear();
	}
}
