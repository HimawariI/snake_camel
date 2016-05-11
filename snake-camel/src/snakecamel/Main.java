package snakecamel;

public class Main {

	public static void main(String[] args) {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String[] CapitalizeList = {"","a","xyz"};
		String[] UncapitalizeList ={"","A","Xyz"};
		String[] SnakeToCamelList = {"abc","abc_def","abc_def_gh","abc__def___gh","_abc_def__"};
		String[] CamelToSnakeList = {"Abc","AbcDef","AbcDefGh"};
		String result = "";
		for(int i = 0; i < 3; i++){	
			result = scu.capitalize(CapitalizeList[i]);
		}
		for(int i = 0; i < 3; i++){
			result = scu.uncapitalize(UncapitalizeList[i]);
		}
		for(int i = 0; i < 5; i++){
			result = scu.snakeToCamelcase(SnakeToCamelList[i]);
		}
		for(int i = 0; i < 3; i++){
			result = scu.camelToSnakecase(CamelToSnakeList[i]);
		}
	}

}
