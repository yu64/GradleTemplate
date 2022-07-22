package test;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import test.symbols.SymbolTestSymbols;

public class MainTest {

	public static void main(String[] args) throws Exception
	{
		Main.main(args);
	}

	@Test
	public void test()
	{
		Arrays.stream(SymbolTestSymbols.ATTRIBUTES).forEach(System.out::println);
		
	}

	
}
