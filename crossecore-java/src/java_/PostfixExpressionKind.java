package java_;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum PostfixExpressionKind implements org.eclipse.emf.common.util.Enumerator{
	INCREMENT(1, "INCREMENT", "++"),
	DECREMENT(2, "DECREMENT", "--")
;	public static final int INCREMENT_VALUE = 1;
	public static final int DECREMENT_VALUE = 2;
	
	private static final PostfixExpressionKind[] VALUES_ARRAY =
		new PostfixExpressionKind[] {
		INCREMENT,
		DECREMENT
		};
	public static final List<PostfixExpressionKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));
	
	public static PostfixExpressionKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PostfixExpressionKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}
	
	public static PostfixExpressionKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PostfixExpressionKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}
	
	public static PostfixExpressionKind get(int value) {
		switch (value) {
			
			case INCREMENT_VALUE: return INCREMENT;
			
			case DECREMENT_VALUE: return DECREMENT;
		}
		return null;
	}
	private final int value;
	private final String name;
	private final String literal;
	
	private PostfixExpressionKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	public int getValue() {
	  return value;
	}

	public String getName() {
	  return name;
	}

	public String getLiteral() {
	  return literal;
	}

	@Override
	public String toString() {
		return literal;
	}
			
}
