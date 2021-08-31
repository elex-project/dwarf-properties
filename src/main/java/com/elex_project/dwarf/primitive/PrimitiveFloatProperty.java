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
public final class PrimitiveFloatProperty implements PrimitiveProperty {
	private final List<FloatPropertyListener> listeners;
	private float value;

	public PrimitiveFloatProperty(final float value) {
		this.value = value;
		this.listeners = new ArrayList<>();
	}

	public PrimitiveFloatProperty() {
		this(0f);
	}

	public void set(final float value) {
		if (this.value != value) {
			final float oldValue = this.value;
			this.value = value;

			for (final FloatPropertyListener listener : listeners) {
				if (null != listener) listener.onValueChanged(oldValue, this.value);
			}

		}
	}

	public float get() {
		return value;
	}

	public void addListener(final FloatPropertyListener listener) {
		listeners.add(listener);
	}

	public void removeListener(final FloatPropertyListener listener) {
		listeners.remove(listener);
	}

	public void removeAllListeners() {
		listeners.clear();
	}
}
