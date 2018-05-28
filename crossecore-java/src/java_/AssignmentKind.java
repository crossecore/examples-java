package java_;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum AssignmentKind implements org.eclipse.emf.common.util.Enumerator{
	ASSIGN(1, "ASSIGN", "="),
	PLUS_ASSIGN(2, "PLUS_ASSIGN", "+="),
	MINUS_ASSIGN(3, "MINUS_ASSIGN", "-="),
	TIMES_ASSIGN(4, "TIMES_ASSIGN", "*="),
	DIVIDE_ASSIGN(5, "DIVIDE_ASSIGN", "/="),
	BIT_AND_ASSIGN(6, "BIT_AND_ASSIGN", "&="),
	BIT_OR_ASSIGN(7, "BIT_OR_ASSIGN", "|="),
	BIT_XOR_ASSIGN(8, "BIT_XOR_ASSIGN", "^="),
	REMAINDER_ASSIGN(9, "REMAINDER_ASSIGN", "%="),
	LEFT_SHIFT_ASSIGN(10, "LEFT_SHIFT_ASSIGN", "<<="),
	RIGHT_SHIFT_SIGNED_ASSIGN(11, "RIGHT_SHIFT_SIGNED_ASSIGN", ">>="),
	RIGHT_SHIFT_UNSIGNED_ASSIGN(12, "RIGHT_SHIFT_UNSIGNED_ASSIGN", ">>>=")
;	public static final int ASSIGN_VALUE = 1;
	public static final int PLUS_ASSIGN_VALUE = 2;
	public static final int MINUS_ASSIGN_VALUE = 3;
	public static final int TIMES_ASSIGN_VALUE = 4;
	public static final int DIVIDE_ASSIGN_VALUE = 5;
	public static final int BIT_AND_ASSIGN_VALUE = 6;
	public static final int BIT_OR_ASSIGN_VALUE = 7;
	public static final int BIT_XOR_ASSIGN_VALUE = 8;
	public static final int REMAINDER_ASSIGN_VALUE = 9;
	public static final int LEFT_SHIFT_ASSIGN_VALUE = 10;
	public static final int RIGHT_SHIFT_SIGNED_ASSIGN_VALUE = 11;
	public static final int RIGHT_SHIFT_UNSIGNED_ASSIGN_VALUE = 12;
	
	private static final AssignmentKind[] VALUES_ARRAY =
		new AssignmentKind[] {
		ASSIGN,
		PLUS_ASSIGN,
		MINUS_ASSIGN,
		TIMES_ASSIGN,
		DIVIDE_ASSIGN,
		BIT_AND_ASSIGN,
		BIT_OR_ASSIGN,
		BIT_XOR_ASSIGN,
		REMAINDER_ASSIGN,
		LEFT_SHIFT_ASSIGN,
		RIGHT_SHIFT_SIGNED_ASSIGN,
		RIGHT_SHIFT_UNSIGNED_ASSIGN
		};
	public static final List<AssignmentKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));
	
	public static AssignmentKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AssignmentKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}
	
	public static AssignmentKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AssignmentKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}
	
	public static AssignmentKind get(int value) {
		switch (value) {
			
			case ASSIGN_VALUE: return ASSIGN;
			
			case PLUS_ASSIGN_VALUE: return PLUS_ASSIGN;
			
			case MINUS_ASSIGN_VALUE: return MINUS_ASSIGN;
			
			case TIMES_ASSIGN_VALUE: return TIMES_ASSIGN;
			
			case DIVIDE_ASSIGN_VALUE: return DIVIDE_ASSIGN;
			
			case BIT_AND_ASSIGN_VALUE: return BIT_AND_ASSIGN;
			
			case BIT_OR_ASSIGN_VALUE: return BIT_OR_ASSIGN;
			
			case BIT_XOR_ASSIGN_VALUE: return BIT_XOR_ASSIGN;
			
			case REMAINDER_ASSIGN_VALUE: return REMAINDER_ASSIGN;
			
			case LEFT_SHIFT_ASSIGN_VALUE: return LEFT_SHIFT_ASSIGN;
			
			case RIGHT_SHIFT_SIGNED_ASSIGN_VALUE: return RIGHT_SHIFT_SIGNED_ASSIGN;
			
			case RIGHT_SHIFT_UNSIGNED_ASSIGN_VALUE: return RIGHT_SHIFT_UNSIGNED_ASSIGN;
		}
		return null;
	}
	private final int value;
	private final String name;
	private final String literal;
	
	private AssignmentKind(int value, String name, String literal) {
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
