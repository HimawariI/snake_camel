package test;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import snakecamel.SnakeCamelUtil;

public class SnakeCamelTest {

	@Test
	public void CamelTest(){
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String[] expectedList = {"Abc","AbcDef","Abc","Abc","AbcDef","AbcDef"};
		String[] actualList = {"abc","abc_def","abc_","_abc","_abc_def","abc__def"};
		for(int i = 0; i < expectedList.length;i++){
			String expected = expectedList[i];
			String actual = scu.snakeToCamelcase(actualList[i]);
			assertThat(actual, is(expected));
		}
	}
	@Test
	public void SnakeTest() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String[] expectedList = {"abc","abc_def","abc_d_ef"};
		String[] actualList = {"Abc","AbcDef","AbcDEf"};
		for(int i = 0; i < expectedList.length;i++){
			String expected = expectedList[i];
			String actual = scu.camelToSnakecase(actualList[i]);
			assertThat(actual, is(expected));
		}
	}
	
	@Test
	public void CapitalizeTest(){
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String[] expectedList = {"A","Abc","ABC"};
		String[] actualList = {"a","abc","ABC"};
		for(int i = 0; i < expectedList.length;i++){
			String expected = expectedList[i];
			String actual = scu.capitalize(actualList[i]);
			assertThat(actual, is(expected));
		}
	}
	
	@Test
	public void UncapitalizeTest(){
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String[] expectedList = {"a","abc","aBC"};
		String[] actualList = {"A","Abc","ABC"};
		for(int i = 0; i < expectedList.length;i++){
			String expected = expectedList[i];
			String actual = scu.uncapitalize(actualList[i]);
			assertThat(actual, is(expected));
		}
	}

}
