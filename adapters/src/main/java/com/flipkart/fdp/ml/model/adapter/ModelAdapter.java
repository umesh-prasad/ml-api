package com.flipkart.fdp.ml.model.adapter;

public interface ModelAdapter<F, T> {

	T transform(F from);

	Class<F> getSource();

	Class<T> getTarget();
}
