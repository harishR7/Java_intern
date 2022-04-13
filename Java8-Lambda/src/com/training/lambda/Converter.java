package com.training.lambda;

public interface Converter<T, R> {
	public R convert(T value);
}
