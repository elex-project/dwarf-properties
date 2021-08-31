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
public final class PrimitiveDoubleProperty implements PrimitiveProperty {
	private final List<DoublePropertyListener> listeners;
	private double value;

	public PrimitiveDoubleProperty(final double value) {
		this.value = value;
		this.listeners = new ArrayList<>();
	}

	public PrimitiveDoubleProperty() {
		this(0d);
	}

	public void set(final double value) {
		if (this.value != value) {
			final double oldValue = this.value;
			this.value = value;

			for (final DoublePropertyListener listener : listeners) {
				if (null != listener) listener.onValueChanged(oldValue, this.value);
			}

		}
	}

	public double get() {
		return value;
	}

	public void addListener(final DoublePropertyListener listener) {
		listeners.add(listener);
	}

	public void removeListener(final DoublePropertyListener listener) {
		listeners.remove(listener);
	}

	public void removeAllListeners() {
		listeners.clear();
	}
}
