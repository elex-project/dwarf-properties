/*
 * Project Dwarf
 *
 * Copyright (c) 2017-2021. Elex. All Rights Reserved.
 * https://www.elex-project.com/
 */

package com.elex_project.dwarf;

import lombok.EqualsAndHashCode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Optional;

/**
 * Base class for properties
 *
 * @param <T> type of a value
 * @author Elex
 */
@EqualsAndHashCode
abstract class AbsProperty<T> implements Property<T>, Serializable {
	protected static final String EMPTY_STRING = "";

	private T value;
	@EqualsAndHashCode.Exclude
	private final ArrayList<PropertyListener<T>> listeners;

	/**
	 * A property with initial value 'null'
	 */
	public AbsProperty() {
		this(null);
	}

	/**
	 * A Property
	 *
	 * @param value initial value
	 */
	public AbsProperty(@Nullable T value) {
		this.listeners = new ArrayList<>();
		this.value = value;
	}

	@Override
	public String toString() {
		if (null == this.value) return EMPTY_STRING;
		return this.value.toString();
	}

	@Override
	public void set(@Nullable final T value) {
		if ((null == this.value && null == value)
				|| (null != this.value && this.value.equals(value))) return;
		final T oldValue = this.value;
		this.value = value;
		for (final PropertyListener<T> listener : listeners) {
			listener.onValueChanged(oldValue, this.value);
		}
	}

	@Override
	@Nullable
	public T get() {
		return value;
	}

	@Override
	public Optional<T> optional() {
		return Optional.ofNullable(value);
	}

	@Override
	public void addListener(@NotNull final PropertyListener<T> listener) {
		this.listeners.add(listener);
	}

	@Override
	public void removeListener(@NotNull final PropertyListener<T> listener) {
		this.listeners.remove(listener);
	}

	@Override
	public void removeAllListeners() {
		this.listeners.clear();
	}
}
