package app;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import app.symbols.SymbolTestSymbols;


public class MainTest {


	@Test
	public void test()
	{
		Arrays.stream(SymbolTestSymbols.ATTRIBUTES).forEach(System.out::println);
		
	}

	
}
